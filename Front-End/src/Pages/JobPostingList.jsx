import React from 'react'
import { Button, Card, Icon } from 'semantic-ui-react'

export default function JobPostingList() {
    return (
        <div>
            <Card.Group itemsPerRow={3}>
                <Card>
                    <Card.Content>
                        <Icon corner name='user' />
                        <Card.Header>Back-End Geliştirici</Card.Header>
                        <Card.Meta>Google</Card.Meta>
                        <Card.Description>
                            Deneme
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
                <Card>
                    <Card.Content>
                        <Icon corner name='user' />
                        <Card.Header>Web Developer</Card.Header>
                        <Card.Meta>Google</Card.Meta>
                        <Card.Description>
                            Google ile çalışma fırsatı
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
                <Card>
                    <Card.Content>
                        <Icon corner name='user' />
                        <Card.Header>Proje Danışmanı</Card.Header>
                        <Card.Meta>Google</Card.Meta>
                        <Card.Description>
                            Google ile çalışma fırsatı
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
                <Card>
                    <Card.Content>
                        <Icon corner name='user' />
                        <Card.Header>Back-End Geliştirici</Card.Header>
                        <Card.Meta>Google</Card.Meta>
                        <Card.Description>
                            Google ile çalışma fırsatı
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
                <Card>
                    <Card.Content>
                        <Icon corner name='user' />
                        <Card.Header>Back-End Geliştirici</Card.Header>
                        <Card.Meta>Google</Card.Meta>
                        <Card.Description>
                            Google ile çalışma fırsatı
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
                <Card>
                    <Card.Content>
                        <Icon corner name='user' />
                        <Card.Header>Back-End Geliştirici</Card.Header>
                        <Card.Meta>Google</Card.Meta>
                        <Card.Description>
                            Google ile çalışma fırsatı
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
            </Card.Group>
        </div>
    )
}
