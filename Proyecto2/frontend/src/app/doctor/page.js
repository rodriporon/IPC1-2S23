'use client'

function DoctorPage () {

    const { firstName, id } = JSON.parse(localStorage.getItem('user'))

    return (
        // todos van a tener el navbar de doctor, gracias al layout creado
        <div>
            <h1>Bienvenido doctor: {firstName} con id:{id}</h1>
        </div>
    )
}

export default DoctorPage