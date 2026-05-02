async function fetchWeather() {
    try {
        const city = document.getElementById("city").value;

        if (!city) {
            alert("Please enter a city name");
            return;
        }

        const apiKey = "4d57a362ba674d92a36143924262704";

        const response = await fetch(
            `https://api.weatherapi.com/v1/current.json?key=${apiKey}&q=${city}&aqi=no`
        );

        const weatherData = await response.json();

        // Handle invalid city
        if (weatherData.error) {
            alert(weatherData.error.message);
            return;
        }

        const { current, location } = weatherData;
        const { name, region, country, localtime } = location;
        const { condition, temp_c, temp_f, wind_kph, wind_mph } = current;
        const { text, icon } = condition;

        // Update UI
        document.getElementById("city-name").innerText = name;
        document.getElementById("state-country").innerText = `${region}, ${country}`;
        document.getElementById("date-time").innerText = localtime;

        document.getElementById("weather-condition-image").src = `https:${icon}`;
        document.getElementById("weather-condition-text").innerText = text;
        document.getElementById("temp").innerText = `${temp_c}°C | ${temp_f}°F`;
        document.getElementById("wind-speed").innerText =
            `Wind Speed: ${wind_kph} KMPH | ${wind_mph} MPH`;

    } catch (error) {
        console.error(error);
        alert("Something went wrong!");
    }
}

// 🔥 Bonus: Press Enter to search
document.getElementById("city").addEventListener("keypress", function (e) {
    if (e.key === "Enter") {
        fetchWeather();
    }
});