import React from 'react'
import { Dropdown, Icon } from 'semantic-ui-react'

export default function SignedIn(props) {
    return (
        <div>
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
                    <Dropdown.Item icon onClick={props.signOut}>
                        <Icon name='sign out' />
                        Çıkış Yap
                    </Dropdown.Item>
                </Dropdown.Menu>
            </Dropdown>
        </div>
    )
}
