'use client'

import { useEffect, useState } from "react"

export default function PacientesPage() {
    const [firstName, setFirstName] = useState('')
    const [idUser, setIdUser] = useState('')
    const [medicinas, setMedicinas] = useState([])

    const handleCompraMedicina = async (idMedicina) => {

        try {
            const response = await fetch('http://localhost:4000/compra-medicina', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({
                    idMedicina,
                    cantidad: 1,
                    idPaciente: idUser
                })
            })

            if (response.ok) {
                alert('Medicina agregada a su factura')
            }
        } catch (err) {
            alert('Error al comprar medicina')
            console.log(err)
        }



    }

    useEffect(() => {
        const fetchMedicinas = async () => {
            const response = await fetch('http://localhost:4000/medicinas')

            if (response.ok) {
                const data = await response.json()

                setMedicinas(data)
            }
        }

        fetchMedicinas()
    }, [])

    useEffect(() => {
        const { id, firstName } = JSON.parse(localStorage.getItem('user'))
        setFirstName(firstName)
        setIdUser(id)
    }, [])

    return (
        <div>
            <h1 className="pb-10">Modulo del paciente: {firstName}</h1>

            {
                medicinas.map((medicina) => (
                    <div key={medicina.id} class="max-w-sm p-6 bg-white border border-gray-200 rounded-lg shadow dark:bg-gray-800 dark:border-gray-700">
                <a href="#">
                    <h5 class="mb-2 text-2xl font-bold tracking-tight text-gray-900 dark:text-white">{medicina.nombre}</h5>
                </a>
                <p class="mb-3 font-normal text-gray-700 dark:text-gray-400">{medicina.descripcion}</p>
                <button class="inline-flex items-center px-3 py-2 text-sm font-medium text-center text-white bg-blue-700 rounded-lg hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800"
                    onClick={() => handleCompraMedicina(medicina.id)}>
                    Q.{medicina.precio}
                    <svg class="w-3.5 h-3.5 ml-2" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 14 10">
                        <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M1 5h12m0 0L9 1m4 4L9 9"/>
                    </svg>
                </button>
            </div>
                ))
            }

        </div>
    )
}