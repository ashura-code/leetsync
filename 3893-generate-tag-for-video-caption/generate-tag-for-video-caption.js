var generateTag = function(caption) {
    let list = caption.trim().split(/\s+/);  // handles multiple spaces
    if (list.length === 0 || list[0] === "") return "#";
    
    list[0] = list[0].toLowerCase()
    list[0] = list[0][0].toLowerCase() + list[0].slice(1);
    let str = "#" + list[0];

    for (let i = 1; i < list.length; i++) {
        let word = list[i];
        if (word) {
            word = word.toLowerCase()
            str += word[0].toUpperCase() + word.slice(1);
        }
    }

    return str.substring(0, 100);
};
