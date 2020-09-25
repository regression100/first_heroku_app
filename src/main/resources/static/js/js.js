function getOdam() {

    axios.get("/api/odam").then(function (response) {

        console.log(response);

    })

}