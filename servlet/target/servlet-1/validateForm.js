function validateForm() {
  var x = document.getElementById("idNumber").value;
  var num = parseInt(x, 10);
  if (num <= "0" || num >200 ) {
    alert("No existe un item con el identificador dado.");
    return false;
  }
  
}