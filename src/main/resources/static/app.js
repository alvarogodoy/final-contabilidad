document.addEventListener("DOMContentLoaded", function() {
    fetch("http://localhost:8080/cuentas")
        .then(response => response.json())
        .then(data => {
            var tbody = document.getElementById("tbody");

            data.forEach(function (item){
                var row = tbody.insertRow(tbody.rows.length);

                var cell1 = row.insertCell(0);
                cell1.innerHTML = item.codigoInicial;

                var cell2 = row.insertCell(1);
                cell2.innerHTML = item.nroCuenta;

                var cell3 = row.insertCell(2);
                cell3.innerHTML = item.rubro;

                var cell4 = row.insertCell(3);
                cell4.innerHTML = item.descripcion;

                var cell5 = row.insertCell(4);

                var button1 = document.createElement('button');
                button1.innerHTML = 'Modificar';
                button1.className = "btn-upd"
                button1.addEventListener('click', function() {

                });
                cell4.appendChild(button1);

                var button2 = document.createElement('button');
                button2.innerHTML = 'Eliminar';
                button2.className = "btn-del"
                button2.addEventListener('click', function() {
                    eliminarCuenta(item.nroCuenta);
                    location.reload();
                });
                cell4.appendChild(button2);
            })
        })
        .catch(error => console.error('Error al obtener datos de la API:', error));
})

function eliminarCuenta(id) {
    fetch(`http://localhost:8080/cuentas/${id}`, {
        method: 'DELETE',
        headers: {
            'Content-Type': 'application/json',
        },
    })
        .then(response => {
            if (!response.ok) {
                throw new Error(`Error al eliminar datos: ${response.status}`);
            }
            console.log('Datos eliminados con éxito');
        })
        .catch(error => console.error('Error al eliminar datos:', error));
}