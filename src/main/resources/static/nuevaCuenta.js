var btnCrear = document.getElementById("crear-cuenta");
var inputNroRubro = document.getElementById("codigo-rubro");
var inputRubro = document.getElementById("rubro");
var inputNroCuenta = document.getElementById("nro-cuenta");
var inputDesc = document.getElementById("descripcion");

function crearCuenta() {
    var data = {
        nroCuenta: inputNroCuenta.value,
        rubro: inputRubro.value,
        descripcion: inputDesc.value,
        codigoInicial: inputNroRubro.value
    }

    fetch("http://localhost:8080/cuentas",
        {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    } )
        .then(function (response) {
            if (!response.ok) {
                throw new Error("La solicitud falló");
            }

            return response.json();
        })
        .then(function (responseData) {
            console.log(responseData);

            window.location.replace("http://localhost:63342/RegCont/templates/plandecuentas.html");
        })
        .catch(function (error) {
            console.error(error);
        });
}

function setNroRubro() {
    switch (inputRubro.value) {
        case "activo":
            inputNroRubro.innerHTML = 100;
            break;
        case "pasivo":
            inputNroRubro.innerHTML = 200;
            break;
        case "pNeto":
            inputNroRubro.innerHTML = 300;
            break;
        case "ingreso":
            inputNroRubro.innerHTML = 410;
            break;
        case "egreso":
            inputNroRubro.innerHTML = 420;
            break;
    }
}

btnCrear.addEventListener("click", crearCuenta);