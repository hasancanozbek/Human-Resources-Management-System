import React from 'react'
import { Button } from 'semantic-ui-react'

export default function AboutUs() {
    return (
        <div>
            <h1>Hakkımda</h1>
            İnönü Üniversitesi/ Bilgisayar Mühendisliği 2. sınıf öğrencisiyim. Full stack developer olmak için çalışıyorum. <br />
            Eğer projeyi beğendiyseniz github üzerinden yıldız vermeyi unutmayınız.
            <br />
            <h2>İletişim Bilgilerim</h2>
            <h4>Mail : hasancanozbekk@gmail.com</h4>
            <h4>Telefon : +90 544 654 0580</h4>
            <h2>Sosyal Medya Hesaplarım </h2>
            <Button color='white'>
                <a href='https://github.com/hasancanozbek'>Github</a>
            </Button>
            <Button color='white'>
                <a href='https://www.linkedin.com/in/hasan-can-özbek-4b4a92211/'>LinkedIn</a>
            </Button>
            <Button color='white'>
                <a href='https://www.instagram.com/hasancanozbekk/'>Instagram</a>
            </Button>
        </div>
    )
}
