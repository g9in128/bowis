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