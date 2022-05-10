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
                            Google ile back-end geliştirme fırsatı
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
                        <Card.Meta>Yemeksepeti</Card.Meta>
                        <Card.Description>
                            Yemeksepeti ekibinde çalışacak Web Developer aranıyor.
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
                        <Card.Meta>İnönü Üniversitesi</Card.Meta>
                        <Card.Description>
                            Danışmanlık yapacak akademisten aranıyor.
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
                        <Card.Meta>Getir</Card.Meta>
                        <Card.Description>
                            Adayların CV'lerini mail adresine göndermeleri gerekmektedir.
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
                        <Card.Header>Database Uzmanı</Card.Header>
                        <Card.Meta>Facebook</Card.Meta>
                        <Card.Description>
                            İngilizce şartı aranmaktadır.
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
                        <Card.Meta>ZBK Software</Card.Meta>
                        <Card.Description>
                            2 adet back-end geliştirici aranıyor.
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
