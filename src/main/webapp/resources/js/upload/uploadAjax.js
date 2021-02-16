'use strict';
/**
 *
 */
$(document).ready(function () {
  $("#uploadBtn").on('click', function (event) {
    let formData = new FormData();
    let inputFile = $("input[name='uploadFile']");
    let files = inputFile[0].files;
    console.log(files);
  })

})