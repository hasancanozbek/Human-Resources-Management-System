import React from 'react'
import { Button, Icon } from 'semantic-ui-react'

export default function SignedOut({ signIn }) {
    return (
        <div>
            <Button primary icon>
                <Icon name='signup' />
                Kayıt Ol
            </Button>

            <Button onClick={signIn} color='green' icon>
                <Icon name='sign in' />
                Giriş Yap
            </Button>
        </div>
    )
}
