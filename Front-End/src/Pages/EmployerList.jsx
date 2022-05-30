import React, { useState, useEffect } from 'react'
import EmployerService from '../Services/EmployerService'
import { Card, Image } from 'semantic-ui-react'

export default function EmployerList() {

    const [employers, setEmployers] = useState([])

    useEffect(() => {
        let employerService = new EmployerService()
        employerService.getEmployers().then(result => setEmployers(result.data.data))
    }, [])
    return (
        <div>
            <Card.Group itemsPerRow={3}>
                {
                    employers.map(employers => (
                        <Card
                            key={employers.user_id}
                            image='https://react.semantic-ui.com/images/avatar/large/matthew.png'
                            meta={employers.companyTelephone}
                            header={employers.companyName}
                            description={employers.companyWebsite}
                        />
                    ))
                }
            </Card.Group>
        </div>
    )
}
