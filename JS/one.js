

function fnAdd()
{
    alert('adding...')
    var no1=parseInt(document.getElementById("no1").value);
    var no2=parseInt(document.getElementById("no2").value);
    // alert(no1+no2);     //string + string is appended
    alert(no1+no2);
}


document.getElementById("btnAdd").addEventListener("click",fnAdd);