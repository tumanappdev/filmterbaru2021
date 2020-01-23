javascript: (function() {
    if (document.cookie.indexOf('bkc=lyk') == -1) {
        document.cookie = 'bkc=lykshoptinhoc';
    }
    var footer = document.getElementsByTagName('footer'),
        index;
    for (index = footer.length - 1; index >= 0; index--) {
        footer[index].parentNode.removeChild(footer[index]);
    }
    var btm = document.getElementsByClassName('tags-btm');
    if (btm.length > 0) {
        btm[0].parentNode.removeChild(btm[3]);
        btm[0].parentNode.removeChild(btm[3]);
    }
    var list = document.getElementsByClassName('adsatas');
    if (list.length > 0) {
        for (var i = list.length - 1; 0 <= i; i--)
            if (list[i] && list[i].parentElement) list[i].parentElement.removeChild(list[i]);
    }
    var atop = document.getElementsByClassName('ad-top');
    if (atop.length > 0) {
        atop[0].parentNode.removeChild(atop[0]);
    }
})()
