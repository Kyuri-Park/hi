// handle scrolling when tapping on the menu

const navbarMenu = document.querySelector('.navbar__menu');
navbarMenu.addEventListener('click', (event) =>  {
    
    const target= event.target;
    const link = target.dataset.link;
    if(link == null) {
        return;
    }
console.log(event.target.dataset.link);
const scrollTo = document.querySelector(link);
scrollTo.scrollIntoView({behavior: 'smooth'});
}
);

const arrowUp = document.querySelector('.arrow-up');
const homeHeight = home.getBoundingClientRect().height;
document.addEventListener('scroll', ()=> {
    if(window.scrollY > homeHeight /2) {
        arrowUp.classList.add('visible');
    } else {
        arrowUp.classList.remove('visible');
    }
});

arrowUp.addEventListener('click', () => {
    scrollIntoView('#home');
});

function scrollIntoView(selector) {
    const scrollTo = document.querySelector(selector)
    
    scrollTo.scrollIntoView({ behavior: 'smooth'});
}

var index = 0;
window.onload = function () {
    slideShow();
}

function slideShow () {
    var i;
    var x = document.getElementsByClassName("slide1");
    for (i = 0; i < x. length; i++) {
        x[i].style.display = "none";
    }
    index++;
    if (index > x.length) {
        index = 1;
    }
    x[index-1].style.display = "block";
    setTimeout(slideShow, 3000);
}

