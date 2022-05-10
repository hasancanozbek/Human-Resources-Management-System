import React from 'react'
import { Button, Icon } from 'semantic-ui-react'

export default function SignedOut(props) {
    return (
        <div>
            <Button primary icon>
                <Icon name='signup' />
                Kayıt Ol
            </Button>

            <Button onClick={props.signIn} color='green' icon>
                <Icon name='sign in' />
                Giriş Yap
            </Button>
        </div>
    )
}
