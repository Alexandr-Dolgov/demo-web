window.onload = function() {

  $(".like").click((e) => {
    var btn = $(e.currentTarget);
    var id = btn.attr("data-postid");
    $.post("/post/" + id + "/like", (data) => {
      btn.text("" + data + " ❤");
      btn.removeClass("btn-secondary");
      btn.removeClass("btn-danger");
      btn.addClass("btn-danger");
    });
  });

}
