# Open-Weather
 automation api menggunakan web open weather menggunakan Katalon Studio

# 1
 hal pertama yang dilakukan saat hit testing menggunakan openweathermap.org adalah chek longitude dan latitude dengan hit api 
 http://api.openweathermap.org/geo/1.0/direct?q={city name},{state code},{country code}&limit={limit}&appid={API key}

 # 2
 buat penyimpanan api yang akan di automation pada halaman object repository dengan, setelah itu jika ada value yang harus diisi maka di isi pada bagian variable, sedangkan pada query parameter pada bagian value jika tambahkan simnol dollar ($) contoh ${city name},${state code},${country code}

 # 3
 buat script pada menu test case dengan send request diambil dari object repository.
 

 

