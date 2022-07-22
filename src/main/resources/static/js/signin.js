$("input.image_input").on('change',e => {
	const files = $("input.image_input")[0].files
	
	if (files && files.length > 0) {
		const reader = new FileReader()
		
		reader.onload = e => {
			$("#preview_img").attr("src",e.target.result)
		}
		
		console.log(files[0])
		reader.readAsDataURL(files[0])
	}
	
});

$("#signin").on("submit",e => {
	e.preventDefault()
	const passwd = $(e.target).find("#password").val()
	const confirm = $(e.target).find("#password_confirm").val()
	
	if (passwd == confirm) {
		e.target.submit()
	}else {
		$(".message").text("비밀번호가 서로 맞지 않습니다.")
	}
	
});