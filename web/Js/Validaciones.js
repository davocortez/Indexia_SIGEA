
function valCombo(combo) {
    var combo = $("#combo : selected").text();
    // $("#formulario").submit();
    confirm("Lolaso" + combo);
}
function asignarMateriaGrupo(idProfesor, idEspecialidad) {
    var combo = $("#combo :selected").val();
    var comboNombre = $("#combo :selected").text();
    var materias = $("#combo :selected").val();
    $("#idProf").val(idProfesor);
    $("#idMat").val(combo);
    var respuesta = confirm("Estas seguro de querer asignar " + comboNombre + " a " + nombreMaestro + "?");
    if (respuesta) {
        if (materias != '') {
            $("#formProfesorMateria").submit();
        } else {
            alert("Debes seleccionar una materia para asignarla al docente");
        }
    }
}

