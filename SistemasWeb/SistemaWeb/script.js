const h1 = document.querySelector("h1");
document.addEventListener('DOMContentLoaded', () => {
    h1.innerHTML = "Adeus"
})
document.addEventListener('click' , () =>{
    h1.innerHTML = "Clicando"
})
document.addEventListener('dblclick', () => {
        h1.innerHTML = "cricou duas vzs"
        const entrada = window.prompt("Digite seu nome")
        h1.innerHTML = entrada

        
    })