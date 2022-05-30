import React from 'react'
import { Button, Form } from 'semantic-ui-react'

export default function Contact() {
    return (
        <div>
            <Form>
                <Form.Group widths='equal'>
                    <Form.Input label='İsminiz' placeholder='Hasan Can' />
                    <Form.Input label='Soyisminiz' placeholder='Özbek' />
                    <Form.Input label='Mail Adresiniz' placeholder='ornek@mail.com' />
                </Form.Group>
                <Form.TextArea label='Mesaj' placeholder='Mesaj içeriğini giriniz' />
                <Button color='green' inverted content='Gönder' />
            </Form>
        </div>
    )
}
