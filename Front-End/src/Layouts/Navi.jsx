import React from 'react'
import { Button, Container, Dropdown, Icon, Menu } from 'semantic-ui-react'

export default function Navi() {
    return (
        <div>
            <Menu size='large' inverted >
                <Container>
                    <Menu.Item>İletişim</Menu.Item>
                    <Menu.Item>Hakkımızda</Menu.Item>
                    <Menu.Item>Şirketler</Menu.Item>
                    <Menu.Item>İş İlanları</Menu.Item>
                    <Menu.Menu position='right'>
                        <Menu.Item>
                            <Button primary icon>
                                <Icon name='signup' />
                                Kayıt Ol</Button>
                        </Menu.Item>
                        <Menu.Item>
                            <Button color='green' icon>
                                <Icon name='sign in' />
                                Giriş Yap</Button>
                        </Menu.Item>
                        <Dropdown item text='Profilim' icon={'user'} pointing='top right' >
                            <Dropdown.Menu>
                                <Dropdown.Item icon>
                                    <Icon name='info' />
                                    Bilgilerim
                                </Dropdown.Item>
                                <Dropdown.Item icon>
                                    <Icon name='star' />
                                    Favori Listem
                                </Dropdown.Item>
                                <Dropdown.Item icon>
                                    <Icon name='sign out' />
                                    Çıkış Yap
                                </Dropdown.Item>
                            </Dropdown.Menu>
                        </Dropdown>
                    </Menu.Menu>
                </Container>
            </Menu>
        </div>
    )
}
