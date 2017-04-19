// $(".qna-comment").on("click", ".answerWrite input[type=submit]", addAnswer);
$(".answerWrite input[type=submit]").click(addAnswer);

function addAnswer(e) {
	e.preventDefault();

	var queryString = $("form[name=answer]").serialize();

	$.ajax({
		type : 'post',
		url : '/api/qna/addAnswer',
		data : queryString,
		dataType : 'json',
		error : onError,
		success : onSuccess,
	});
}

function onSuccess(json, status) {
	var answer = json.answer;
	var answerTemplate = $("#answerTemplate").html();
	document.querySelector(".qna-comment-count strong").innerHTML++;
	var template = answerTemplate.format(answer.writer, new Date(answer.createdDate), answer.contents, answer.answerId,
			answer.answerId);
	$(".qna-comment--articles").append(template);
}

function onError(xhr, status) {
	alert("error");
}

$('.qna-comment-slipp-articles').on('click', '.form-delete', deleteAnswer);

function deleteAnswer(e) {
	e.preventDefault();
	console.log($(this));
	let deleteButton = $(this);
	let queryString = deleteButton.closest("form").serialize();
	
	deleteButton.closest('article').hide();
	
	$.ajax({
		type : 'post',
		url : '/api/qna/deleteAnswer',
		data : queryString,
		dataType : 'json',
		error : (xhr, status) => {
			deleteButton.closest('article').show();
		},
		success : (json, status) => {
			document.querySelector(".qna-comment-count strong").innerHTML--;
			deleteButton.closest('article').remove();
		}
	});
}

String.prototype.format = function() {
	var args = arguments;
	return this.replace(/{(\d+)}/g, function(match, number) {
		return typeof args[number] != 'undefined' ? args[number] : match;
	});
};