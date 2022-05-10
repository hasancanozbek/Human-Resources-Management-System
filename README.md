# Human-Resources-Management-System

## BACKEND İSTERLERİ
## :pushpin: Req 1 : İş Arayanlar sisteme kayıt olabilmelidir.
### Kabul Kriterleri:

:white_check_mark:	Kayıt sırasında kullanıcıdan ad, soyad, tcno, doğum yılı, e-Posta, şifre, şifre tekrarı bilgileri istenir.
<br>
:white_check_mark:	Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
<br>
:white_check_mark:	Mernis doğrulaması yapılarak sisteme kayıt gerçekleştirilir.
<br>
:white_check_mark:	Doğrulama geçerli değilse kullanıcı bilgilendirilir.
<br>
:white_check_mark:	Daha önce kayıtlı bir e-posta veya tcno var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.
<br>
:white_check_mark:	Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir.

## :pushpin:	Req 2 : İş verenler sisteme kayıt olabilmelidir.
### Kabul Kriterleri:

:white_check_mark: Kayıt sırasında kullanıcıdan şirket adı, web sitesi, web sitesi ile aynı domaine sahip e-posta, telefon, şifre, şifre tekrarı bilgileri istenir. Burada amaç sisteme şirket olmayanların katılmasını engellemektir.
<br>
:white_check_mark: Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
<br>
:white_check_mark: Şirket kayıtları iki şekilde doğrulanır. Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir. HRMS personelinin onayı gerekmektedir.
<br>
:white_check_mark:Daha önce kayıtlı bir e-posta var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.

## :pushpin:	Req 3 : Sisteme genel iş pozisyonu isimleri eklenebilmelidir. Örneğin Software Developer, Software Architect.
### Kabul Kriterleri:

:white_check_mark:Bu pozisyonlar tekrar edemez. Kullanıcı uyarılır.


## :pushpin:	Req 4 : İş verenler listelenebilmelidir. (Sadece tüm liste)

## :pushpin: Req 5 : İş arayanlar listelenebilmelidir. (Sadece tüm liste)

## :pushpin: Req 6 : İş pozisyonları listelenebilmelidir. (Sadece tüm liste)

## :pushpin: Req 7 : İş verenler sisteme iş ilanı ekleyebilmelidir.

İş ilanı formunda; <br>
:white_check_mark:Seçilebilir listeden (dropdown) genel iş pozisyonu seçilebilmelidir.(Örneğin Java Developer)(Zorunlu)
<br>
:white_check_mark:İş tanımı girişi yapılabilmelidir. (Örneğin; firmamız için JAVA, C# vb. dillere hakim....)(Zorunlu)
<br>
:white_check_mark:Şehir bilgisi açılır listeden seçilebilmelidir. (Zorunlu)
<br>
:white_check_mark:Maaş skalası için min-max girişi yapılabilmelidir. (Opsiyonel)
<br>
:white_check_mark:Açık pozisyon adedi girişi yapılabilmelidir. (Zorunlu)
<br>
:white_check_mark:Son başvuru tarihi girişi yapılabilmelidir.

## :pushpin: Req 8 : Sistemdeki tüm aktif iş ilanları listelenebilmelidir.

:white_check_mark:Liste, tablo formunda gelmelidir.
<br>
:white_check_mark:Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.
## 📌: Req 9 : Sistemdeki tüm aktif iş ilanları tarihe göre listelenebilmelidir.
:white_check_mark:Liste, tablo formunda gelmelidir.
<br>
✅:Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.
## :pushpin: Req 10 : Sistemde bir firmaya ait tüm aktif iş ilanları listelenebilmelidir.

:white_check_mark:Liste, tablo formunda gelmelidir.
<br>
:white_check_mark:Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.
## 📌: Req 11 : İş verenler sistemdeki bir ilanı kapatabilmelidir. (Pasif ilan)
## :pushpin: Req 12: Adaylar sisteme CV girişi yapabilmelidir.
:white_check_mark:Adaylar okudukları okulları sisteme ekleyebilmelidir. (Okul adı, bölüm)
<br>
:white_check_mark:Bu okullarda hangi yıllarda okuduklarını sisteme girebilmelidir.
<br>
:white_check_mark:Eğer mezun değilse mezuniyet yılı boş geçilebilmelidir.
<br>
:white_check_mark:Adayların okudukları okullar mezuniyet yılına göre tersten sıralanabilmelidir. Mezun olunmamışsa yine bu okul en üstte ve "devam ediyor" olarak görüntülenmelidir.
<br>
:white_check_mark:Adaylar iş tecübelerini girebilmelidir. (İş yeri adı, pozisyon)
<br>
:white_check_mark:Bu tecrübelerini hangi yıllarda yaptıklarını sisteme girebilmelidir.
<br>
:white_check_mark:Eğer hala çalışıyorsa işten ayrılma yılı boş geçilebilmelidir.
<br>
:white_check_mark:Adayların tecrübeleri yıla göre tersten sıralanabilmelidir. Hala çalışıyorsa yine bu tecrübesi en üstte ve "devam ediyor" olarak görüntülenmelidir.
<br>
:white_check_mark:Adaylar bildikleri yabancı dilleri sisteme girebilmelidir. ( Dil, Seviye -> 1-5)
<br>
:white_check_mark:Adaylar sisteme fotoğraf girebilmelidir. Adaya ait fotoğraf https://cloudinary.com/pricing sisteminde tutulacaktır. (Dış servis entegrasyonu) Ücretsiz hesabı kullanınız.
<br>
:white_check_mark:Adaylar sisteme github adreslerini girebilmelidir.
<br>
:white_check_mark:Adaylar sisteme linkedin adreslerini girebilmelidir.
<br>
:white_check_mark:Adaylar bildikleri programlama dillerini veya teknolojilerini sisteme girebilmelidir. (Programlama/Teknoloji adı) Örneğin; React
<br>
:white_check_mark:Adaylar sisteme ön yazı ekleyebilmelidir. (Örneğin: Çalışmayı çok severim....)

## :pushpin: Req 13 : Bir adaya ait tüm CV bilgisi görüntülenebilmelidir.
