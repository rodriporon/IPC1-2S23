const users = [
    //doctores
    {
        id: 1,
        firstName: 'Juan',
        lastName: 'López',
        username: 'juanca',
        birthDate: '1990-01-01',
        genre: 'M',
        password: '1234',
        phone: '12345678',
        role: 'doctor'
    },
    {
        id: 2,
        firstName: 'Ana',
        lastName: 'López',
        username: 'ana',
        birthDate: '1990-01-01',
        genre: 'F',
        password: '1234',
        phone: '12345678',
        role: 'nurse'
    },
    // OJO: no tienen que ir quemados los usuarios:
    {
        id:3,
        firstName: 'Rodrigo',
        lastName: 'Porón',
        username: 'rodri',
        birthDate: '1990-01-01',
        genre: 'M',
        password: '1234',
        phone: '12345678',
        role: 'patient'
    },
    {
        id:4,
        firstName: 'Rodrigo',
        lastName: 'Porón',
        username: 'rodri',
        birthDate: '1990-01-01',
        genre: 'M',
        password: '1234',
        phone: '12345678',
        role: 'patient'
    }
]

const findUser = (username, password) => {
    return users.find(user => user.username === username && user.password === password)
}

const getPatiens = () => {
    return users.filter(user => user.role === 'patient')
}

export { users, findUser, getPatiens }