import React, { useState } from 'react'
import { Link, NavLink } from 'react-router-dom'
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
                    <Menu.Item as={NavLink} to="/">Ana Sayfa</Menu.Item>
                    <Menu.Item as={NavLink} to="/contact">İletişim</Menu.Item>
                    <Menu.Item as={NavLink} to="/aboutus">Hakkımızda</Menu.Item>
                    <Menu.Item as={NavLink} to='/employers'>Şirketler</Menu.Item>
                    <Menu.Item as={Link} to='/jobpostings'>İş İlanları</Menu.Item>
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
