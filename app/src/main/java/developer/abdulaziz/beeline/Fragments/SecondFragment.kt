package developer.abdulaziz.beeline.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import developer.abdulaziz.beeline.Adapters.MyClick
import developer.abdulaziz.beeline.Adapters.SecondAdapter
import developer.abdulaziz.beeline.Models.MyBeeline
import developer.abdulaziz.beeline.MyData
import developer.abdulaziz.beeline.R
import developer.abdulaziz.beeline.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private lateinit var list1: ArrayList<MyBeeline>
    private lateinit var list2: ArrayList<MyBeeline>
    private lateinit var list3: ArrayList<MyBeeline>
    private lateinit var list4: ArrayList<MyBeeline>
    private lateinit var list5: ArrayList<MyBeeline>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater)

        when (arguments?.getInt("key")) {
            1 -> {
                tariflar1()
                binding.secondListItem.adapter =
                    SecondAdapter(binding.root.context, list1, object : MyClick {
                        override fun onClick(item: ArrayList<MyBeeline>, position: Int) {
                            MyData.list = item
                            MyData.position = position
                            findNavController().navigate(
                                R.id.thirdFragment
                            )
                        }
                    })
            }
            2 -> {
                internet2()
                binding.secondListItem.adapter =
                    SecondAdapter(binding.root.context, list2, object : MyClick {
                        override fun onClick(item: ArrayList<MyBeeline>, position: Int) {
                            MyData.list = item
                            MyData.position = position
                            findNavController().navigate(
                                R.id.thirdFragment
                            )
                        }
                    })
            }
            4 -> {
                xizmatlar3()
                binding.secondListItem.adapter =
                    SecondAdapter(binding.root.context, list3, object : MyClick {
                        override fun onClick(item: ArrayList<MyBeeline>, position: Int) {
                            MyData.list = item
                            MyData.position = position
                            findNavController().navigate(
                                R.id.thirdFragment
                            )
                        }
                    })
            }
            5 -> {
                sms4()
                binding.secondListItem.adapter =
                    SecondAdapter(binding.root.context, list4, object : MyClick {
                        override fun onClick(item: ArrayList<MyBeeline>, position: Int) {
                            MyData.list = item
                            MyData.position = position
                            findNavController().navigate(
                                R.id.thirdFragment
                            )
                        }
                    })
            }
            6 -> {
                ilovalar5()
                binding.secondListItem.adapter =
                    SecondAdapter(binding.root.context, list5, object : MyClick {
                        override fun onClick(item: ArrayList<MyBeeline>, position: Int) {
                            MyData.list = item
                            MyData.position = position
                            findNavController().navigate(
                                R.id.thirdFragment
                            )
                        }
                    })
            }
        }

        return binding.root
    }

    private fun tariflar1() {
        list1 = ArrayList()
        list1.add(
            MyBeeline(
                "ZO'R 1", "*2*3#", "Oylik abonent to’lovi = 20 000 so'm/oy\n" +
                        "O'zbekiston bo'yicha daqiqalar = 1500 daq/oy\n" +
                        "Internet barcha yo’nalishlarga = 3 GB/oy\n" +
                        "Tungi bonusli trafik (01:00-08:00) = 3 GB/oy\n" +
                        "O'zbekiston bo'yicha SMS = 500 SMS/oy"
            )
        )
        list1.add(
            MyBeeline(
                "ZO'R 2", "*2*5#", "Oylik abonent to’lovi = 30 000 so'm/oy\n" +
                        "O'zbekiston bo'yicha daqiqalar = 2500 daq/oy\n" +
                        "Internet barcha yo’nalishlarga = 5 GB/oy\n" +
                        "Tungi bonusli trafik (01:00-08:00) = 5 GB/oy\n" +
                        "O'zbekiston bo'yicha SMS = 500 SMS/oy\n" +
                        "Beeline TV: Telekanallar = ${R.string.base}"
            )
        )
        list1.add(
            MyBeeline(
                "ZO'R 3", "*2*8#", "Oylik abonent to’lovi = 40 000 so'm/oy\n" +
                        "O'zbekiston bo'yicha daqiqalar = ${R.string.base}\n" +
                        "Internet barcha yo’nalishlarga = 8 GB/oy\n" +
                        "Tungi bonusli trafik (01:00-08:00) = 8 GB/oy\n" +
                        "O'zbekiston bo'yicha SMS = 1000 SMS/oy\n" +
                        "Beeline TV: Telekanallar = ${R.string.base}\n" +
                        "Beeline Music = ${R.string.base}"
            )
        )
        list1.add(
            MyBeeline(
                "ZO'R 4", "*2*15#", "Oylik abonent to’lovi = 60 000 so'm/oy\n" +
                        "O'zbekiston bo'yicha daqiqalar = ${R.string.base}\n" +
                        "Internet barcha yo’nalishlarga = 15 GB/oy\n" +
                        "Tungi bonusli trafik (01:00-08:00) = 15 GB/oy\n" +
                        "O'zbekiston bo'yicha SMS = 1000 SMS/oy\n" +
                        "Beeline TV: Telekanallar va Amediateka = ${R.string.base}\n" +
                        "Beeline Music = ${R.string.base}"
            )
        )
        list1.add(
            MyBeeline(
                "OSON 1", "*2*01#", "Oylik abonent to’lovi = 40 000 so'm/oy\n" +
                        "O'zbekiston bo'yicha ckeksiz qong'iroqlar = ${R.string.base} daq/oy\n" +
                        "Internet, 1 MB = 1 so'm\n" +
                        "O'zbekiston bo'yicha 1 SMS = 1 so'm"
            )
        )
        list1.add(
            MyBeeline(
                "OSON 10", "*110*61#", "Oylik abonent to’lovi = 10 000 so'm/oy\n" +
                        "O'zbekiston bo'yicha daqiqalar paketi = 10 daq/oy\n" +
                        "Internet = 10 Mb/oy\n" +
                        "O'zbekiston bo'yicha SMS = 10 SMS/oy\n" +
                        "1 Daqiqa = 10 so'm\n1 Sms = 10 so'm\n1 Mb = 10 so'm"
            )
        )
        list1.add(
            MyBeeline(
                "Bolajon", "*110*538#", "Oylik abonent to’lovi = 11 500 so'm/oy\n" +
                        "Internet = 1500 Mb/oy\n" +
                        "Tarmoq ichida chiqish qo'ng'iroqlari uchun = 500 daq/oy\n" +
                        "1 chiquvchi Sms = 85 so'm"
            )
        )
    }

    private fun internet2() {
        list2 = ArrayList()
        list2.add(
            MyBeeline(
                "Kunlik 100 MB", "*1*0*1#", "Ulanish narxi = 2000 so'm/kun\n" +
                        "MB barcha yo'nalishlarga = 100 Mb/kun\n" +
                        "Ulanish uchun hisobdagi minimal mablag’ miqdori = 2100 so'm"
            )
        )
        list2.add(
            MyBeeline(
                "Kunlik 200 MB", "*1*0*2#", "Ulanish narxi = 3000 so'm/kun\n" +
                        "MB barcha yo'nalishlarga = 200 Mb/kun\n" +
                        "Ulanish uchun hisobdagi minimal mablag’ miqdori = 3100 so'm"
            )
        )
        list2.add(
            MyBeeline(
                "Kunlik 500 MB", "*1*0*3#", "Ulanish narxi = 5000 so'm/kun\n" +
                        "MB barcha yo'nalishlarga = 500 Mb/kun\n" +
                        "Ulanish uchun hisobdagi minimal mablag’ miqdori = 5100 so'm"
            )
        )
        list2.add(
            MyBeeline(
                "Haftalik 1500 MB", "*1*0*5#", "Ulanish narxi = 10000 so'm/hafta\n" +
                        "MB barcha yo'nalishlarga = 1500 Mb/hafta\n" +
                        "Ulanish uchun hisobdagi minimal mablag’ miqdori = 10100 so'm"
            )
        )
        list2.add(
            MyBeeline(
                "Haftalik 2500 MB", "*1*0*6#", "Ulanish narxi = 15000 so'm/hafta\n" +
                        "MB barcha yo'nalishlarga = 2500 Mb/hafta\n" +
                        "Ulanish uchun hisobdagi minimal mablag’ miqdori = 15100 so'm"
            )
        )
        list2.add(
            MyBeeline(
                "Oylik 1000 MB", "*1*1#", "Ulanish narxi = 10000 so'm/oy\n" +
                        "MB barcha yo'nalishlarga = 1000 Mb/oy\n" +
                        "Ulanish uchun hisobdagi minimal mablag’ miqdori = 10200 so'm"
            )
        )
        list2.add(
            MyBeeline(
                "Oylik 2000 MB", "*1*2#", "Ulanish narxi = 15000 so'm/oy\n" +
                        "MB barcha yo'nalishlarga = 2000 Mb/oy\n" +
                        "Ulanish uchun hisobdagi minimal mablag’ miqdori = 15200 so'm"
            )
        )
        list2.add(
            MyBeeline(
                "Oylik 5000 MB", "*1*5#", "Ulanish narxi = 25000 so'm/oy\n" +
                        "MB barcha yo'nalishlarga = 5000 Mb/oy\n" +
                        "Ulanish uchun hisobdagi minimal mablag’ miqdori = 25200 so'm"
            )
        )
    }

    private fun xizmatlar3() {
        list3 = ArrayList()
        list3.add(
            MyBeeline(
                "Kodni aniqlash",
                "*998*",
                "Endi shahar va mobil telefon raqamlarining kodini aniqlash yanada oson bo’ldi!\n" +
                        "\n" +
                        "Buning uchun o’z telefon raqamingizdan *998* abonentning 7 raqami # kodini tersangiz kifoya.\n" +
                        "\n" +
                        "Misol uchun *998*1234567# chaqiruv tugmasi."
            )
        )
        list3.add(
            MyBeeline(
                "BeeGudok",
                "19100",
                "Kunlik obuna = 1000 so'm\nOylik obuna = 5000 so'm\n" +
                        "1. Quyidagi manzilga kiring https://beegudok.beeline.uz\n" +
                        "2. Obuna variantini tanlang.\n" +
                        "3. Tizim avtomatik ravishda sizni avtorizatsiyadan o’tkazadi.\n" +
                        "4. Tabriklaymiz, obunani muvaffaqiyatli faollashtirdingiz! Endi sizda musiqalarning kengaytirilgan katalogi mavjud.\n" +
                        "\n" +
                        "yoki\n" +
                        "\n" +
                        "1 sonini SMS xabar orqali kunlik obuna uchun 19100 yoki oylik obuna uchun 19101 qisqa raqamlariga yuboring"
            )
        )
        list3.add(
            MyBeeline(
                "Do it!",
                "*110*0*0#",
                "- Cheksiz Internet soat 01:00 dan 08:59 gacha taqdim etiladi;\n" +
                        "- Xizmat uchun to'lov faqat xizmatdan foydalanilgan kunda tungi soat 1:00dan tonggi soat 08:59gacha 1 megabaytdan ko'proq internet ishlatilganda yechiladi.\n" +
                        "- Xizmat to'g'ri ishlashi uchun hisobda kamida 6 263 so'm bo'lishi kerak.\n" +
                        "- Xizmat «Status NEW», «Status», «Status+», «ProInternet», 2GB, 5GB, 15GB, 30GB tarif rejalar turkumi, «Bolajon», «Bayramga Marhamat», «Welcome», «Bir Oy», «Erkin muloqot» va «Shifokor», «OSON 1» tarif rejalaridan tashqari barcha oldindan to'lov tizimining tariflarida amal qiladi;  \n" +
                        "- Agar Internet paket yoqilgan bo'lsa,  tunda ushbu vaqt oralig'ida MBlar ishlatilmaydi.\n" +
                        "- «Do It»  xizmati yoqilganda, «Hamma tarmoqda»  xizmatidan foydalanib bo'lmaydi.\n" +
                        "- «Hamma tarmoqda» xizmati mavjud holatda «Do It» xizmatini yoqtirish mumkin. «Do It» xizmati yoqilishi bilan «Hamma tarmoqda» xizmati avtomatik ravishda o'chiriladi.\n" +
                        "- Tarif reja almashtirilganda, xizmatni qayta ulash kerak bo'ladi.\n" +
                        "- Xizmat to'g'ri ishlashi uchun joriy sessiyani uzib, tungi 01:00 dan keyingi vaqtda yangi sessiyani ishga tushirish lozim;.\n" +
                        "- Xizmat o‘chirilganda tarifikatsiya to'g'ri amalga oshirilishi uchun avval barcha faol Internet sessiyalarini yakunlash lozim.\n" +
                        "- Xizmat faqat O'zbekiston hududida amal qiladi.\n" +
                        "- Barcha narxlar QQS bilan keltirilgan." +
                        "Kunlik foydalanish uchun to‘lov = 5000 so'm/kun"
            )
        )
    }

    private fun sms4() {
        list4 = ArrayList()
        list4.add(MyBeeline("20 Sms", "*110*04#", "Mahalliy Sms Paket 20 Sms = 1000 so'm"))
        list4.add(MyBeeline("50 Sms", "*110*05#", "Mahalliy Sms Paket 50 Sms = 1500 so'm"))
        list4.add(MyBeeline("100 Sms", "*110*06#", "Mahalliy Sms Paket 100 Sms = 3500 so'm"))
        list4.add(MyBeeline("500 Sms", "*110*07#", "Mahalliy Sms Paket 500 Sms = 11000 so'm"))
        list4.add(MyBeeline("1000 Sms", "*110*08#", "Mahalliy Sms Paket 1000 Sms = 18000 so'm"))
        list4.add(MyBeeline("2000 Sms", "*110*09#", "Mahalliy Sms Paket 9000 Sms = 32000 so'm"))
    }

    private fun ilovalar5() {
        list5 = ArrayList()
        list5.add(
            MyBeeline(
                "Beeline Uzb.", "*1#", "Beeline Uzbekistan yordamida Siz istalgan vaqtda:\n" +
                        "- hisobni va joriy tarifni bilish;\n" +
                        "- qo'ng'iroqlar, SMS va internet detalizatsiya ma'lumotini olish;\n" +
                        "- qo'shimcha xizmatlarni ulash va o'chirish;\n" +
                        "- Qo'shimcha raqamlarni bog'lash, xizmatlarni ulash/o'chirish va detalizatsiya ma'lumotini olish;\n" +
                        "- Har kuni 10 000 qadam bosib o'tilganda, «Qadamlar uchun Giglar» aksiyasi bo’yicha qo’shimcha 100 Mb olish imkoniyati;\n" +
                        "- yaqinlaringiz va do'stlaringizga o'z hisobingizdan internet-paketlarni xarid qilish imkoniyati;\n" +
                        "- «Beeline Club 2.0» dasturning a'zosiga aylanib, hamkorlardan chegirmalar foydalanish"
            )
        )
        list5.add(
            MyBeeline(
                "Beepul", "*2#", "Beepulning asosiy afzalliklari:\n" +
                        "- Beeline abonentlari ilovadan foydalanganda tarif reja, internet-paketlar va mobil hisob bo'yicha trafik sarflamaydi;\n" +
                        "- ilovada O'zbekistonning istalgan mobil operatori raqamidan ro'yxatdan o'tish mumkin. Beepul sodiqlik dasturi ilovaning barcha foydalanuvchilari uchun amal qiladi. Dastur haqida batafsil ma’lumot;\n" +
                        "- «Beeline» ning oldindan to'lov tizimidagi raqam hisobini 8 420 so'm to'ldirilganda raqamga 50 MB, tarmoq ichida 50 daqiqa va O'zbekiston bo'yicha 50 SMS 7 kun muddatga taqdim etiladi.\n" +
                        "- Beeline abonentlari uchun internetga ulanish imkoni bo'lmagan holda ilova orqali to'lovlarni amalga oshirish imkoniyati;\n" +
                        "- avtomatik to'lovlarni osonlik sozlash;\n" +
                        "- bank kartasidan oldindan to'lov tizimining Beeline raqamlariga internet-paketlarni xarid qilish imkoniyati.\n" +
                        "- Komissiya haqi 0.5% bilan kartadan kartaga pul o'tkazmalar"
            )
        )
        list5.add(
            MyBeeline(
                "Beeline TV", "*6#", "TV (kunlik obuna) = 599 so'm/kun\n" +
                        "IVI (kunlik obuna) = 799 so'm/kun\n" +
                        "Milliy (kunlik obuna) = 699 so'm/kun\n" +
                        "Megogo (kunlik obuna) = 799 so'm/kun\n" +
                        "Start (kunlik obuna) = 799 so'm/kun\n" +
                        "PREMIER (kunlik obuna) = 799 so'm/kun\n" +
                        "GOLD (TV, IVI, Milliy) (kunlik obuna) = 1 499 so'm/kun\n" +
                        "VIP (TV, IVI, Start, Milliy) (kunlik obuna) = 1 999 so'm/kun"
            )
        )
        list5.add(
            MyBeeline(
                "Beeline Music", "*9#", "Kunlik obuna = 599 so'm/kun\n" +
                        "Oylik obuna = 14 999 so'm/oy\n" +
                        "\n" +
                        "Beeline o’z abonentlariga «Beeline Music & Radio» xizmatidan foydalanish uchun cheksiz trafikni taqdim etadi!\n" +
                        "Bu degani, xizmat orqali musiqani tinglaganda, Beeline abonentlaridan paketdagi internet trafikdan va internet xizmati uchun hisobdan mablag' sarflanmaydi.\n" +
                        "«Beeline Music & Radio» xizmati – xorijiy va o'zbek ijrochilarining musiqiy treklari va albomlarini tinglash, o'z ijro ro'yxatini tuzish, har kuni shaxsiy tavsiyalar olish, shuningdek, qo'shiqlarni smartfonga yuklab olish va ularni offlayn rejimida tinglash imkoniyati mavjud!"
            )
        )
        list5.add(
            MyBeeline(
                "Beeline App", "18100", "Kunlik obuna = 1 299 so'm/kun\n" +
                        "Oylik obuna = 24 999 so'm/oy\n" +
                        "Beeline o'z abonentlariga «Beeline App» xizmatiga cheksiz trafik taqdim etadi!\n" +
                        "Ya’ni, o'yinlarni yuklab olish yoki onlayn orqali o'ynashda Sizda internet-trafik sarflanmaydi!\n" +
                        "Beeline App – bu turli janrlardagi eng mashhur o'yinlarni o'z ichiga olgan o'yin portali bo’lib, haftalik o'yinlar katalogi yuqori reytingga ega bo’lgan yangi o'yinlar bilan to'ldirib boriladi."
            )
        )
        list5.add(
            MyBeeline(
                "Bookmate", "*14#", "Kunlik obuna = 599 so'm/kun\n" +
                        "Beeline o'z abonentlariga «Bookmate» xizmatidan foydalanish uchun cheksiz trafik taqdim etadi!\n" +
                        "Ya’ni, xizmat orqali kitoblarni o'qish va tinglashda sizdan internet-trafik sarflanmaydi!\n" +
                        "Va bu hammasi emas! Bundan tashqari, aynan siz uchun xizmatga obuna bo'lish uchun bonusli narx mavjud!\n" +
                        "Bookmate – bu rus tilidagi eng katta kitoblar kutubxonasi, shuningdek ingliz, ispan, turk, shved va boshqa tillardagi kitoblar bilan boyitilgan kitob xizmati."
            )
        )
    }
}