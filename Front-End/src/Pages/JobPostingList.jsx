import React, { useState, useEffect } from 'react'
import { Button, Card, Image } from 'semantic-ui-react'
import JobpostingService from '../Services/JobpostingService'

export default function JobPostingList() {

    const [jobPostings, setJobPostings] = useState([])

    useEffect(() => {
        let jobpostingService = new JobpostingService()
        jobpostingService.getJobPostings().then(result => setJobPostings(result.data.data))
    }, [])

    return (
        <div>
            <Card.Group itemsPerRow={3}>
                {
                    jobPostings.map(jobPostings => (
                        <Card key={jobPostings.id}>
                            <Card.Content>
                                <Image
                                    floated='right'
                                    size='mini'
                                    src='https://react.semantic-ui.com/images/avatar/large/matthew.png'
                                />
                                <Card.Header>{jobPostings.jobName}</Card.Header>
                                <Card.Meta>{jobPostings.companyName}</Card.Meta>
                                <Card.Description>
                                    Açık Pozisyon Adedi : {jobPostings.openPositions}
                                    <br />
                                    Yayınlanma Tarihi : {jobPostings.releaseDate}
                                    <br />
                                    Son Başvuru Tarihi : {jobPostings.applicationDeadline}
                                </Card.Description>
                            </Card.Content>
                            <Card.Content extra>
                                <Button basic color='green'>
                                    CV Gönder
                                </Button>
                                <Button basic color='blue'>
                                    Detay
                                </Button>
                            </Card.Content>
                        </Card>
                    ))
                }

            </Card.Group>
        </div>
    )
}
