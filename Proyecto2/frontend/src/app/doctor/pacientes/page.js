'use client'
import { useEffect, useState } from "react"

function PacientesPage () {
    const [pacientes, setPacientes] = useState([])

    useEffect(() => {
        const fetchPacientes = async () => {
            const response = await fetch('http://localhost:4000/patients')

            if (response.ok) {
                const data = await response.json()
                setPacientes(data)
            }
        }

        fetchPacientes()
    }, [])

    console.log({pacientes})

    return (
        // va a tener el mismo navbar
        <div>
            <h1>Pacientes en el sistema</h1>
            <div class="relative overflow-x-auto">
                <table class="w-full text-sm text-left text-gray-500 dark:text-gray-400">
                    <thead class="text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400">
                        <tr>
                            <th scope="col" class="px-6 py-3">
                                Id
                            </th>
                            <th scope="col" class="px-6 py-3">
                                Nombre
                            </th>
                            <th scope="col" class="px-6 py-3">
                                Apellido
                            </th>
                            <th scope="col" class="px-6 py-3">
                                Telefono
                            </th>
                        </tr>
                    </thead>
                    <tbody>
                            {pacientes.map((paciente) => (
                            <tr key={paciente.id} class="bg-white border-b dark:bg-gray-800 dark:border-gray-700">
                                <th scope="row" class="px-6 py-4 font-medium text-gray-900 whitespace-nowrap dark:text-white">
                                    {paciente.id}
                                </th>
                                <td class="px-6 py-4">
                                    {paciente.firstName}
                                </td>
                                <td class="px-6 py-4">
                                    {paciente.lastName}
                                </td>
                                <td class="px-6 py-4">
                                    {paciente.phone}
                                </td>
                            </tr>
                            ))}
                    </tbody>
                </table>
            </div>

        </div>
    )
}

export default PacientesPage