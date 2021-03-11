'use strict';
/**
 *
 */
$(document).ready(function() {
    $("#uploadBtn").on('click', function(event) {
        var formData = new FormData();
        var inputFile = $("input[name='uploadFile']");
        var files = inputFile[0].files;
        console.log(files);
        //add fileDate to formData
        for (var i = 0; i < files.legnth; i++) {
            formData.append("uploadFile", files[i]);
        }

        $.ajax({
            url: '/uploadAjaxAction',
            processData: false,
            contentType: false,
            data: formData,
            type: 'POST',
            success: (result) => console.log("Uploaded")
        });
    });
});