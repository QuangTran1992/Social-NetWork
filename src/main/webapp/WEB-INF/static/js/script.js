const settings = document.querySelector(".settings-menu");
const showSettings = document.querySelector(".nav-user-icon");
const darkMode = document.querySelector(".dark-btn");
const postContent = document.querySelector(".post-content");
const postBtn = document.querySelector(".post-btn");

showSettings.onclick = function() {
    settings.classList.toggle("active");
}

darkMode.onclick = function() {
    darkMode.classList.toggle("active");
    document.body.classList.toggle("dark-theme");

    if(localStorage.getItem("theme") === "light") {
        localStorage.setItem("theme", "dark");
    } else {
        localStorage.setItem("theme", "light");
    }
}

if (localStorage.getItem("theme") === "light") {
    darkMode.classList.remove("active");
    document.body.classList.remove("dark-theme");
} else if (localStorage.getItem("theme") === "dark") {
    darkMode.classList.add("active");
    document.body.classList.add("dark-theme");
} else {
    localStorage.setItem("theme", "light");
}

postContent.oninput = () => {
    if(postContent.value !== "") {
        postBtn.classList.add("active");
    } else {
        postBtn.classList.remove("active");
    }
};

post = (content) => {
    $(".main-content .post").prepend(`
        <div class="post-container">
             <div class="post-row">
                    <div class="user-profile">
                    <img src="images/profile-pic.png" alt="">
                    <div>
                        <p>John Nicholson</p>
                        <span>Jun 24 2021, 13:40</span>
                    </div>
                </div>
                <a href="#"><i class="fas fa-ellipsis-h"></i></a>
            </div>
            
            <p class="post-text">${content}</p>
            <img src="images/feed-image-1.png" class="post-img">

            <div class="post-row">
                <div class="activity-icons">
                    <div><img src="images/like-blue.png" alt=""> 120</div>
                    <div><img src="images/comments.png" alt=""> 45</div>
                    <div><img src="images/share.png" alt=""> 20</div>
                </div>
                <div class="post-profile-icon">
                    <img src="images/profile-pic.png" alt=""> <i class="fas fa-caret-down"></i>
                </div>
            </div>
        </div>
    `)
}


$(".post-btn").on("click", (e) => {
    e.preventDefault();
    let content = postContent.value;

    if (content !== "") {
        post(content);
    }
   
});

$(function() {
    $('.lazy').lazy();
});
