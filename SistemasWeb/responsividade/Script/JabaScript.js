const menu = document.querySelector('nav ul');
const menuBar = document.querySelector('nav .menuIcon');
const iconeMenu = document.querySelector('nav .menuIcon i');


menuBar.addEventListener('click', ()=>{
    if(iconeMenu.className == "fa fa-bars"){
        iconeMenu.className = "fa fa-times-circle";
    }else{
        iconeMenu.className = "fa fa-bars"
    }
    menu.classList.toggle('active');
});