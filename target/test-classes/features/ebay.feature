Feature: Ebayda Arama
    @ebayarama
    Scenario Outline:
      Given kullanici "http://ebay.com" adresine gider
      And kullanici bayda arama kutusuna "<urunler>" yazar
      Then sonuc sayilarini ekrana yazdirir

      Examples: arama yapilacaklar

      |urunler    |
      |akulu araba|
      |yaris seti |
      |besik      |