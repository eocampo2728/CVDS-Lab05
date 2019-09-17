function validateForm() {
  var x = document.getElementById("superId").value;
  if (x < 0 && x > 200) {
    alert("Id Invalido");
    return false;
  }
}