import React, { useState } from 'react'
import { Container, Menu } from 'semantic-ui-react'
import SignedIn from './SignedIn'
import SignedOut from './SignedOut'

export default function Navi() {
    const [isAuthenticated, setIsAuthenticated] = useState(false)

    function handleSignOut() {
        setIsAuthenticated(false)
    }
    function handleSignIn() {
        setIsAuthenticated(true)
    }
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
                            {isAuthenticated ? <SignedIn signOut={handleSignOut} /> : <SignedOut signIn={handleSignIn} />}
                        </Menu.Item>
                    </Menu.Menu>
                </Container>
            </Menu>
        </div>
    )
}
