window.onload = function() {

  $(".like").click((e) => {
    var btn = $(e.currentTarget);
    var id = btn.attr("data-postid");
    btn.attr("disabled", "disabled");
    $.post("/post/" + id + "/like", (data) => {
      btn.text("" + data + " ❤");
      btn.removeClass("btn-secondary");
      btn.addClass("btn-danger");
    });
  });

}
