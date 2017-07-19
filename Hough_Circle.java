





<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
  <link rel="dns-prefetch" href="https://assets-cdn.github.com">
  <link rel="dns-prefetch" href="https://avatars0.githubusercontent.com">
  <link rel="dns-prefetch" href="https://avatars1.githubusercontent.com">
  <link rel="dns-prefetch" href="https://avatars2.githubusercontent.com">
  <link rel="dns-prefetch" href="https://avatars3.githubusercontent.com">
  <link rel="dns-prefetch" href="https://github-cloud.s3.amazonaws.com">
  <link rel="dns-prefetch" href="https://user-images.githubusercontent.com/">



  <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/frameworks-4324702744188e5d6edc78c06517458705b8d6596db5054c244444b56c494c99.css" integrity="sha256-QyRwJ0QYjl1u3HjAZRdFhwW41llttQVMJEREtWxJTJk=" media="all" rel="stylesheet" />
  <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/github-dc68b8984be0bf4b18485cbbae5a1a783216fb2ff01cfa4758292684cbdd9605.css" integrity="sha256-3Gi4mEvgv0sYSFy7rloaeDIW+y/wHPpHWCkmhMvdlgU=" media="all" rel="stylesheet" />
  
  
  
  

  <meta name="viewport" content="width=device-width">
  
  <title>Local_Hough_Circle/Hough_Circle.java at master · Llamero/Local_Hough_Circle</title>
  <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub">
  <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub">
  <meta property="fb:app_id" content="1401488693436528">

    
    <meta content="https://avatars2.githubusercontent.com/u/4911046?v=4&amp;s=400" property="og:image" /><meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="Llamero/Local_Hough_Circle" property="og:title" /><meta content="https://github.com/Llamero/Local_Hough_Circle" property="og:url" /><meta content="Local_Hough_Circle - An improved implementation" property="og:description" />

  <link rel="assets" href="https://assets-cdn.github.com/">
  <link rel="web-socket" href="wss://live.github.com/_sockets/VjI6MTgyOTUxNTU4OmFjODM3NzdlMDYxYWE3MzY0YjI4N2ZkMGU0YWQ5Y2QxOTg1NTEzMTY3YjEwZDk1YmZhYWRjMGViNzZmMzA2ZDI=--54afe1ed8b3d7c3406c8c97d4c8b79ff3db4caf1">
  <meta name="pjax-timeout" content="1000">
  <link rel="sudo-modal" href="/sessions/sudo_modal">
  <meta name="request-id" content="B5BC:21EDB:2BFC99:526E67:596F6217" data-pjax-transient>
  

  <meta name="selected-link" value="repo_source" data-pjax-transient>

  <meta name="google-site-verification" content="KT5gs8h0wvaagLKAVWq8bbeNwnZZK1r1XQysX3xurLU">
<meta name="google-site-verification" content="ZzhVyEFwb7w3e0-uOTltm8Jsck2F5StVihD0exw2fsA">
    <meta name="google-analytics" content="UA-3769691-2">

<meta content="collector.githubapp.com" name="octolytics-host" /><meta content="github" name="octolytics-app-id" /><meta content="https://collector.githubapp.com/github-external/browser_event" name="octolytics-event-url" /><meta content="B5BC:21EDB:2BFC99:526E67:596F6217" name="octolytics-dimension-request_id" /><meta content="iad" name="octolytics-dimension-region_edge" /><meta content="iad" name="octolytics-dimension-region_render" /><meta content="24652584" name="octolytics-actor-id" /><meta content="richiemort79" name="octolytics-actor-login" /><meta content="6a01e2bc9f05ddaafb597e9e9d1a9114429b4530508c3d187b7a9966e5a0bd7d" name="octolytics-actor-hash" />
<meta content="/&lt;user-name&gt;/&lt;repo-name&gt;/blob/show" data-pjax-transient="true" name="analytics-location" />




  <meta class="js-ga-set" name="dimension1" content="Logged In">


  

      <meta name="hostname" content="github.com">
  <meta name="user-login" content="richiemort79">

      <meta name="expected-hostname" content="github.com">
    <meta name="js-proxy-site-detection-payload" content="NGQ4MDVjOWU2ZjEwZmZmOTgxNGQwNmQyOWVhZDhmMDU4ZmE0MDkwYjI2YmFjNDI0NzMxMTk2MmMyZTU3NTgwZnx7InJlbW90ZV9hZGRyZXNzIjoiMTQ4Ljg4LjIxMy4yMzYiLCJyZXF1ZXN0X2lkIjoiQjVCQzoyMUVEQjoyQkZDOTk6NTI2RTY3OjU5NkY2MjE3IiwidGltZXN0YW1wIjoxNTAwNDcxODMyLCJob3N0IjoiZ2l0aHViLmNvbSJ9">


  <meta name="html-safe-nonce" content="c99bf1bce746ae650196a04838b322b54b4b092a">

  <meta http-equiv="x-pjax-version" content="6c5477a88bf55cb71aea0d99703fc638">
  

      <link href="https://github.com/Llamero/Local_Hough_Circle/commits/master.atom" rel="alternate" title="Recent Commits to Local_Hough_Circle:master" type="application/atom+xml">

  <meta name="description" content="Local_Hough_Circle - An improved implementation">
  <meta name="go-import" content="github.com/Llamero/Local_Hough_Circle git https://github.com/Llamero/Local_Hough_Circle.git">

  <meta content="4911046" name="octolytics-dimension-user_id" /><meta content="Llamero" name="octolytics-dimension-user_login" /><meta content="84863518" name="octolytics-dimension-repository_id" /><meta content="Llamero/Local_Hough_Circle" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="84863518" name="octolytics-dimension-repository_network_root_id" /><meta content="Llamero/Local_Hough_Circle" name="octolytics-dimension-repository_network_root_nwo" /><meta content="false" name="octolytics-dimension-repository_explore_github_marketplace_ci_cta_shown" />


    <link rel="canonical" href="https://github.com/Llamero/Local_Hough_Circle/blob/master/src/main/java/Hough_Package/Hough_Circle.java" data-pjax-transient>


  <meta name="browser-stats-url" content="https://api.github.com/_private/browser/stats">

  <meta name="browser-errors-url" content="https://api.github.com/_private/browser/errors">

  <link rel="mask-icon" href="https://assets-cdn.github.com/pinned-octocat.svg" color="#000000">
  <link rel="icon" type="image/x-icon" href="https://assets-cdn.github.com/favicon.ico">

<meta name="theme-color" content="#1e2327">


  <meta name="u2f-support" content="true">

  </head>

  <body class="logged-in env-production page-blob">
    



  <div class="position-relative js-header-wrapper ">
    <a href="#start-of-content" tabindex="1" class="bg-black text-white p-3 show-on-focus js-skip-to-content">Skip to content</a>
    <div id="js-pjax-loader-bar" class="pjax-loader-bar"><div class="progress"></div></div>

    
    
    



        
<div class="header" role="banner">
  <div class="container clearfix">
    <a class="header-logo-invertocat" href="https://github.com/" data-hotkey="g d" aria-label="Homepage" data-ga-click="Header, go to dashboard, icon:logo">
  <svg aria-hidden="true" class="octicon octicon-mark-github" height="32" version="1.1" viewBox="0 0 16 16" width="32"><path fill-rule="evenodd" d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0 0 16 8c0-4.42-3.58-8-8-8z"/></svg>
</a>


        <div class="header-search scoped-search site-scoped-search js-site-search" role="search">
  <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/Llamero/Local_Hough_Circle/search" class="js-site-search-form" data-scoped-search-url="/Llamero/Local_Hough_Circle/search" data-unscoped-search-url="/search" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
    <label class="form-control header-search-wrapper js-chromeless-input-container">
        <a href="/Llamero/Local_Hough_Circle/blob/master/src/main/java/Hough_Package/Hough_Circle.java" class="header-search-scope no-underline">This repository</a>
      <input type="text"
        class="form-control header-search-input js-site-search-focus js-site-search-field is-clearable"
        data-hotkey="s"
        name="q"
        value=""
        placeholder="Search"
        aria-label="Search this repository"
        data-unscoped-placeholder="Search GitHub"
        data-scoped-placeholder="Search"
        autocapitalize="off">
        <input type="hidden" class="js-site-search-type-field" name="type" >
    </label>
</form></div>


      <ul class="header-nav float-left" role="navigation">
        <li class="header-nav-item">
          <a href="/pulls" aria-label="Pull requests you created" class="js-selected-navigation-item header-nav-link" data-ga-click="Header, click, Nav menu - item:pulls context:user" data-hotkey="g p" data-selected-links="/pulls /pulls/assigned /pulls/mentioned /pulls">
            Pull requests
</a>        </li>
        <li class="header-nav-item">
          <a href="/issues" aria-label="Issues you created" class="js-selected-navigation-item header-nav-link" data-ga-click="Header, click, Nav menu - item:issues context:user" data-hotkey="g i" data-selected-links="/issues /issues/assigned /issues/mentioned /issues">
            Issues
</a>        </li>
            <li class="header-nav-item">
              <a href="/marketplace" class="js-selected-navigation-item header-nav-link" data-ga-click="Header, click, Nav menu - item:marketplace context:user" data-selected-links=" /marketplace">
                Marketplace
</a>            </li>
          <li class="header-nav-item">
            <a class="header-nav-link" href="https://gist.github.com/" data-ga-click="Header, go to gist, text:gist">Gist</a>
          </li>
      </ul>

    
<ul class="header-nav user-nav float-right" id="user-links">
  <li class="header-nav-item">
    

  </li>

  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link tooltipped tooltipped-s js-menu-target" href="/new"
       aria-label="Create new…"
       aria-expanded="false"
       aria-haspopup="true"
       data-ga-click="Header, create new, icon:add">
      <svg aria-hidden="true" class="octicon octicon-plus float-left" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M12 9H7v5H5V9H0V7h5V2h2v5h5z"/></svg>
      <span class="dropdown-caret"></span>
    </a>

    <div class="dropdown-menu-content js-menu-content">
      <ul class="dropdown-menu dropdown-menu-sw">
        
<a class="dropdown-item" href="/new" data-ga-click="Header, create new repository">
  New repository
</a>

  <a class="dropdown-item" href="/new/import" data-ga-click="Header, import a repository">
    Import repository
  </a>

<a class="dropdown-item" href="https://gist.github.com/" data-ga-click="Header, create new gist">
  New gist
</a>

  <a class="dropdown-item" href="/organizations/new" data-ga-click="Header, create new organization">
    New organization
  </a>



  <div class="dropdown-divider"></div>
  <div class="dropdown-header">
    <span title="Llamero/Local_Hough_Circle">This repository</span>
  </div>
    <a class="dropdown-item" href="/Llamero/Local_Hough_Circle/issues/new" data-ga-click="Header, create new issue">
      New issue
    </a>

      </ul>
    </div>
  </li>

  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link name tooltipped tooltipped-sw js-menu-target" href="/richiemort79"
       aria-label="View profile and more"
       aria-expanded="false"
       aria-haspopup="true"
       data-ga-click="Header, show menu, icon:avatar">
      <img alt="@richiemort79" class="avatar" src="https://avatars1.githubusercontent.com/u/24652584?v=4&amp;s=40" height="20" width="20">
      <span class="dropdown-caret"></span>
    </a>

    <div class="dropdown-menu-content js-menu-content">
      <div class="dropdown-menu dropdown-menu-sw">
        <div class="dropdown-header header-nav-current-user css-truncate">
          Signed in as <strong class="css-truncate-target">richiemort79</strong>
        </div>

        <div class="dropdown-divider"></div>

        <a class="dropdown-item" href="/richiemort79" data-ga-click="Header, go to profile, text:your profile">
          Your profile
        </a>
        <a class="dropdown-item" href="/richiemort79?tab=stars" data-ga-click="Header, go to starred repos, text:your stars">
          Your stars
        </a>
        <a class="dropdown-item" href="/explore" data-ga-click="Header, go to explore, text:explore">
          Explore
        </a>
        <a class="dropdown-item" href="https://help.github.com" data-ga-click="Header, go to help, text:help">
          Help
        </a>

        <div class="dropdown-divider"></div>

        <a class="dropdown-item" href="/settings/profile" data-ga-click="Header, go to settings, icon:settings">
          Settings
        </a>

        <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/logout" class="logout-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="EWtG5n9BOL2TZCXLhzqQdbvpzskkBu3mM8AKL6ItWNtS8/yiPLk/pheQMuCkxtpE4pyrT8CimJvqvuffNJc0YA==" /></div>
          <button type="submit" class="dropdown-item dropdown-signout" data-ga-click="Header, sign out, icon:logout">
            Sign out
          </button>
</form>      </div>
    </div>
  </li>
</ul>


    <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/logout" class="sr-only right-0" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="tNR+JFOIkyAL8k0+pZ8bA0e4KazbwoRC3nrisxsk/x/3TMRgEHCUO48GWhWGY1EyHs1MKj9m8T8HBA9DjZ6TpA==" /></div>
      <button type="submit" class="dropdown-item dropdown-signout" data-ga-click="Header, sign out, icon:logout">
        Sign out
      </button>
</form>  </div>
</div>


      

  </div>

  <div id="start-of-content" class="show-on-focus"></div>

    <div id="js-flash-container">
</div>



  <div role="main">
        <div itemscope itemtype="http://schema.org/SoftwareSourceCode">
    <div id="js-repo-pjax-container" data-pjax-container>
      




    <div class="pagehead repohead instapaper_ignore readability-menu experiment-repo-nav">
      <div class="container repohead-details-container">

        <ul class="pagehead-actions">
  <li>
        <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="Km4KtPkTj6VzegwQDWkR0v5rUsbLIbfa8/NX3kyAKGYPEMz613es29tMxwDi1sbuHm2ooNQhT/1mIsIWx2Y5Rw==" /></div>      <input class="form-control" id="repository_id" name="repository_id" type="hidden" value="84863518" />

        <div class="select-menu js-menu-container js-select-menu">
          <a href="/Llamero/Local_Hough_Circle/subscription"
            class="btn btn-sm btn-with-count select-menu-button js-menu-target"
            role="button"
            aria-haspopup="true"
            aria-expanded="false"
            aria-label="Toggle repository notifications menu"
            data-ga-click="Repository, click Watch settings, action:blob#show">
            <span class="js-select-button">
                <svg aria-hidden="true" class="octicon octicon-eye" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path fill-rule="evenodd" d="M8.06 2C3 2 0 8 0 8s3 6 8.06 6C13 14 16 8 16 8s-3-6-7.94-6zM8 12c-2.2 0-4-1.78-4-4 0-2.2 1.8-4 4-4 2.22 0 4 1.8 4 4 0 2.22-1.78 4-4 4zm2-4c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z"/></svg>
                Watch
            </span>
          </a>
            <a class="social-count js-social-count"
              href="/Llamero/Local_Hough_Circle/watchers"
              aria-label="2 users are watching this repository">
              2
            </a>

        <div class="select-menu-modal-holder">
          <div class="select-menu-modal subscription-menu-modal js-menu-content">
            <div class="select-menu-header js-navigation-enable" tabindex="-1">
              <svg aria-label="Close" class="octicon octicon-x js-menu-close" height="16" role="img" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z"/></svg>
              <span class="select-menu-title">Notifications</span>
            </div>

              <div class="select-menu-list js-navigation-container" role="menu">

                <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
                  <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
                  <div class="select-menu-item-text">
                    <input checked="checked" id="do_included" name="do" type="radio" value="included" />
                    <span class="select-menu-item-heading">Not watching</span>
                    <span class="description">Be notified when participating or @mentioned.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <svg aria-hidden="true" class="octicon octicon-eye" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path fill-rule="evenodd" d="M8.06 2C3 2 0 8 0 8s3 6 8.06 6C13 14 16 8 16 8s-3-6-7.94-6zM8 12c-2.2 0-4-1.78-4-4 0-2.2 1.8-4 4-4 2.22 0 4 1.8 4 4 0 2.22-1.78 4-4 4zm2-4c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z"/></svg>
                      Watch
                    </span>
                  </div>
                </div>

                <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                  <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
                  <div class="select-menu-item-text">
                    <input id="do_subscribed" name="do" type="radio" value="subscribed" />
                    <span class="select-menu-item-heading">Watching</span>
                    <span class="description">Be notified of all conversations.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <svg aria-hidden="true" class="octicon octicon-eye" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path fill-rule="evenodd" d="M8.06 2C3 2 0 8 0 8s3 6 8.06 6C13 14 16 8 16 8s-3-6-7.94-6zM8 12c-2.2 0-4-1.78-4-4 0-2.2 1.8-4 4-4 2.22 0 4 1.8 4 4 0 2.22-1.78 4-4 4zm2-4c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z"/></svg>
                        Unwatch
                    </span>
                  </div>
                </div>

                <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                  <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
                  <div class="select-menu-item-text">
                    <input id="do_ignore" name="do" type="radio" value="ignore" />
                    <span class="select-menu-item-heading">Ignoring</span>
                    <span class="description">Never be notified.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <svg aria-hidden="true" class="octicon octicon-mute" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path fill-rule="evenodd" d="M8 2.81v10.38c0 .67-.81 1-1.28.53L3 10H1c-.55 0-1-.45-1-1V7c0-.55.45-1 1-1h2l3.72-3.72C7.19 1.81 8 2.14 8 2.81zm7.53 3.22l-1.06-1.06-1.97 1.97-1.97-1.97-1.06 1.06L11.44 8 9.47 9.97l1.06 1.06 1.97-1.97 1.97 1.97 1.06-1.06L13.56 8l1.97-1.97z"/></svg>
                        Stop ignoring
                    </span>
                  </div>
                </div>

              </div>

            </div>
          </div>
        </div>
</form>
  </li>

  <li>
    
  <div class="js-toggler-container js-social-container starring-container ">
    <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/Llamero/Local_Hough_Circle/unstar" class="starred" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="zg4dNL6Rvm0wOsf8/uyapRsXihJ/3HT+ZUgk+epCSI0lxvRjcVWVvV0WrvcuJAr/e4avJQYSmYe6dHo8XpMaCg==" /></div>
      <button
        type="submit"
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Unstar this repository" title="Unstar Llamero/Local_Hough_Circle"
        data-ga-click="Repository, click unstar button, action:blob#show; text:Unstar">
        <svg aria-hidden="true" class="octicon octicon-star" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path fill-rule="evenodd" d="M14 6l-4.9-.64L7 1 4.9 5.36 0 6l3.6 3.26L2.67 14 7 11.67 11.33 14l-.93-4.74z"/></svg>
        Unstar
      </button>
        <a class="social-count js-social-count" href="/Llamero/Local_Hough_Circle/stargazers"
           aria-label="2 users starred this repository">
          2
        </a>
</form>
    <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/Llamero/Local_Hough_Circle/star" class="unstarred" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="D32L8BgmV/eUj25fJaYpf/JMeOcrW/KUlj1K2lsBN7JxYu+brBE719ytDSVjkESBPj53gVhUEVFoLUL0etvCYw==" /></div>
      <button
        type="submit"
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Star this repository" title="Star Llamero/Local_Hough_Circle"
        data-ga-click="Repository, click star button, action:blob#show; text:Star">
        <svg aria-hidden="true" class="octicon octicon-star" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path fill-rule="evenodd" d="M14 6l-4.9-.64L7 1 4.9 5.36 0 6l3.6 3.26L2.67 14 7 11.67 11.33 14l-.93-4.74z"/></svg>
        Star
      </button>
        <a class="social-count js-social-count" href="/Llamero/Local_Hough_Circle/stargazers"
           aria-label="2 users starred this repository">
          2
        </a>
</form>  </div>

  </li>

  <li>
          <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/Llamero/Local_Hough_Circle/fork" class="btn-with-count" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="KAZjgY/0HFDdsi4IqEhnF0lFt5BhdWiioT/GJ9cz9Xwf+zqPoyCk9tHcAvZqbRqe7Xxtb26xp2qQGklsLfMftg==" /></div>
            <button
                type="submit"
                class="btn btn-sm btn-with-count"
                data-ga-click="Repository, show fork modal, action:blob#show; text:Fork"
                title="Fork your own copy of Llamero/Local_Hough_Circle to your account"
                aria-label="Fork your own copy of Llamero/Local_Hough_Circle to your account">
              <svg aria-hidden="true" class="octicon octicon-repo-forked" height="16" version="1.1" viewBox="0 0 10 16" width="10"><path fill-rule="evenodd" d="M8 1a1.993 1.993 0 0 0-1 3.72V6L5 8 3 6V4.72A1.993 1.993 0 0 0 2 1a1.993 1.993 0 0 0-1 3.72V6.5l3 3v1.78A1.993 1.993 0 0 0 5 15a1.993 1.993 0 0 0 1-3.72V9.5l3-3V4.72A1.993 1.993 0 0 0 8 1zM2 4.2C1.34 4.2.8 3.65.8 3c0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zm3 10c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zm3-10c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2z"/></svg>
              Fork
            </button>
</form>
    <a href="/Llamero/Local_Hough_Circle/network" class="social-count"
       aria-label="0 users forked this repository">
      0
    </a>
  </li>
</ul>

        <h1 class="public ">
  <svg aria-hidden="true" class="octicon octicon-repo" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M4 9H3V8h1v1zm0-3H3v1h1V6zm0-2H3v1h1V4zm0-2H3v1h1V2zm8-1v12c0 .55-.45 1-1 1H6v2l-1.5-1.5L3 16v-2H1c-.55 0-1-.45-1-1V1c0-.55.45-1 1-1h10c.55 0 1 .45 1 1zm-1 10H1v2h2v-1h3v1h5v-2zm0-10H2v9h9V1z"/></svg>
  <span class="author" itemprop="author"><a href="/Llamero" class="url fn" rel="author">Llamero</a></span><!--
--><span class="path-divider">/</span><!--
--><strong itemprop="name"><a href="/Llamero/Local_Hough_Circle" data-pjax="#js-repo-pjax-container">Local_Hough_Circle</a></strong>

</h1>

      </div>
      <div class="container">
        
<nav class="reponav js-repo-nav js-sidenav-container-pjax"
     itemscope
     itemtype="http://schema.org/BreadcrumbList"
     role="navigation"
     data-pjax="#js-repo-pjax-container">

  <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
    <a href="/Llamero/Local_Hough_Circle" class="js-selected-navigation-item selected reponav-item" data-hotkey="g c" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches /Llamero/Local_Hough_Circle" itemprop="url">
      <svg aria-hidden="true" class="octicon octicon-code" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path fill-rule="evenodd" d="M9.5 3L8 4.5 11.5 8 8 11.5 9.5 13 14 8 9.5 3zm-5 0L0 8l4.5 5L6 11.5 2.5 8 6 4.5 4.5 3z"/></svg>
      <span itemprop="name">Code</span>
      <meta itemprop="position" content="1">
</a>  </span>

    <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
      <a href="/Llamero/Local_Hough_Circle/issues" class="js-selected-navigation-item reponav-item" data-hotkey="g i" data-selected-links="repo_issues repo_labels repo_milestones /Llamero/Local_Hough_Circle/issues" itemprop="url">
        <svg aria-hidden="true" class="octicon octicon-issue-opened" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path fill-rule="evenodd" d="M7 2.3c3.14 0 5.7 2.56 5.7 5.7s-2.56 5.7-5.7 5.7A5.71 5.71 0 0 1 1.3 8c0-3.14 2.56-5.7 5.7-5.7zM7 1C3.14 1 0 4.14 0 8s3.14 7 7 7 7-3.14 7-7-3.14-7-7-7zm1 3H6v5h2V4zm0 6H6v2h2v-2z"/></svg>
        <span itemprop="name">Issues</span>
        <span class="Counter">1</span>
        <meta itemprop="position" content="2">
</a>    </span>

  <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
    <a href="/Llamero/Local_Hough_Circle/pulls" class="js-selected-navigation-item reponav-item" data-hotkey="g p" data-selected-links="repo_pulls /Llamero/Local_Hough_Circle/pulls" itemprop="url">
      <svg aria-hidden="true" class="octicon octicon-git-pull-request" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M11 11.28V5c-.03-.78-.34-1.47-.94-2.06C9.46 2.35 8.78 2.03 8 2H7V0L4 3l3 3V4h1c.27.02.48.11.69.31.21.2.3.42.31.69v6.28A1.993 1.993 0 0 0 10 15a1.993 1.993 0 0 0 1-3.72zm-1 2.92c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zM4 3c0-1.11-.89-2-2-2a1.993 1.993 0 0 0-1 3.72v6.56A1.993 1.993 0 0 0 2 15a1.993 1.993 0 0 0 1-3.72V4.72c.59-.34 1-.98 1-1.72zm-.8 10c0 .66-.55 1.2-1.2 1.2-.65 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2zM2 4.2C1.34 4.2.8 3.65.8 3c0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2z"/></svg>
      <span itemprop="name">Pull requests</span>
      <span class="Counter">0</span>
      <meta itemprop="position" content="3">
</a>  </span>

    <a href="/Llamero/Local_Hough_Circle/projects" class="js-selected-navigation-item reponav-item" data-selected-links="repo_projects new_repo_project repo_project /Llamero/Local_Hough_Circle/projects">
      <svg aria-hidden="true" class="octicon octicon-project" height="16" version="1.1" viewBox="0 0 15 16" width="15"><path fill-rule="evenodd" d="M10 12h3V2h-3v10zm-4-2h3V2H6v8zm-4 4h3V2H2v12zm-1 1h13V1H1v14zM14 0H1a1 1 0 0 0-1 1v14a1 1 0 0 0 1 1h13a1 1 0 0 0 1-1V1a1 1 0 0 0-1-1z"/></svg>
      Projects
      <span class="Counter" >0</span>
</a>
    <a href="/Llamero/Local_Hough_Circle/wiki" class="js-selected-navigation-item reponav-item" data-hotkey="g w" data-selected-links="repo_wiki /Llamero/Local_Hough_Circle/wiki">
      <svg aria-hidden="true" class="octicon octicon-book" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path fill-rule="evenodd" d="M3 5h4v1H3V5zm0 3h4V7H3v1zm0 2h4V9H3v1zm11-5h-4v1h4V5zm0 2h-4v1h4V7zm0 2h-4v1h4V9zm2-6v9c0 .55-.45 1-1 1H9.5l-1 1-1-1H2c-.55 0-1-.45-1-1V3c0-.55.45-1 1-1h5.5l1 1 1-1H15c.55 0 1 .45 1 1zm-8 .5L7.5 3H2v9h6V3.5zm7-.5H9.5l-.5.5V12h6V3z"/></svg>
      Wiki
</a>

    <div class="reponav-dropdown js-menu-container">
      <button type="button" class="btn-link reponav-item reponav-dropdown js-menu-target " data-no-toggle aria-expanded="false" aria-haspopup="true">
        Insights
        <svg aria-hidden="true" class="octicon octicon-triangle-down v-align-middle text-gray" height="11" version="1.1" viewBox="0 0 12 16" width="8"><path fill-rule="evenodd" d="M0 5l6 6 6-6z"/></svg>
      </button>
      <div class="dropdown-menu-content js-menu-content">
        <div class="dropdown-menu dropdown-menu-sw">
          <a class="dropdown-item" href="/Llamero/Local_Hough_Circle/pulse" data-skip-pjax>
            <svg aria-hidden="true" class="octicon octicon-pulse" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path fill-rule="evenodd" d="M11.5 8L8.8 5.4 6.6 8.5 5.5 1.6 2.38 8H0v2h3.6l.9-1.8.9 5.4L9 8.5l1.6 1.5H14V8z"/></svg>
            Pulse
          </a>
          <a class="dropdown-item" href="/Llamero/Local_Hough_Circle/graphs" data-skip-pjax>
            <svg aria-hidden="true" class="octicon octicon-graph" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path fill-rule="evenodd" d="M16 14v1H0V0h1v14h15zM5 13H3V8h2v5zm4 0H7V3h2v10zm4 0h-2V6h2v7z"/></svg>
            Graphs
          </a>
        </div>
      </div>
    </div>
</nav>

      </div>
    </div>

<div class="container new-discussion-timeline experiment-repo-nav">
  <div class="repository-content">

    
  <a href="/Llamero/Local_Hough_Circle/blob/b292a143af891283c3bc56409fe73420e02c9db1/src/main/java/Hough_Package/Hough_Circle.java" class="d-none js-permalink-shortcut" data-hotkey="y">Permalink</a>

  <!-- blob contrib key: blob_contributors:v21:7c9885dbf3a31b5b026821fd4d6fd1e6 -->

  <div class="file-navigation js-zeroclipboard-container">
    
<div class="select-menu branch-select-menu js-menu-container js-select-menu float-left">
  <button class=" btn btn-sm select-menu-button js-menu-target css-truncate" data-hotkey="w"
    
    type="button" aria-label="Switch branches or tags" aria-expanded="false" aria-haspopup="true">
      <i>Branch:</i>
      <span class="js-select-button css-truncate-target">master</span>
  </button>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax>

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <svg aria-label="Close" class="octicon octicon-x js-menu-close" height="16" role="img" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z"/></svg>
        <span class="select-menu-title">Switch branches/tags</span>
      </div>

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Filter branches/tags" id="context-commitish-filter-field" class="form-control js-filterable-field js-navigation-enable" placeholder="Filter branches/tags">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" data-filter-placeholder="Filter branches/tags" class="js-select-menu-tab" role="tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" data-filter-placeholder="Find a tag…" class="js-select-menu-tab" role="tab">Tags</a>
            </li>
          </ul>
        </div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches" role="menu">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <a class="select-menu-item js-navigation-item js-navigation-open selected"
               href="/Llamero/Local_Hough_Circle/blob/master/src/main/java/Hough_Package/Hough_Circle.java"
               data-name="master"
               data-skip-pjax="true"
               rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target js-select-menu-filter-text">
                master
              </span>
            </a>
        </div>

          <div class="select-menu-no-results">Nothing to show</div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/Llamero/Local_Hough_Circle/tree/0.8.0/src/main/java/Hough_Package/Hough_Circle.java"
              data-name="0.8.0"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="0.8.0">
                0.8.0
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/Llamero/Local_Hough_Circle/tree/0.7.0/src/main/java/Hough_Package/Hough_Circle.java"
              data-name="0.7.0"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="0.7.0">
                0.7.0
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
              href="/Llamero/Local_Hough_Circle/tree/0.7.0b/src/main/java/Hough_Package/Hough_Circle.java"
              data-name="0.7.0b"
              data-skip-pjax="true"
              rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target" title="0.7.0b">
                0.7.0b
              </span>
            </a>
        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div>

    </div>
  </div>
</div>

    <div class="BtnGroup float-right">
      <a href="/Llamero/Local_Hough_Circle/find/master"
            class="js-pjax-capture-input btn btn-sm BtnGroup-item"
            data-pjax
            data-hotkey="t">
        Find file
      </a>
      <button aria-label="Copy file path to clipboard" class="js-zeroclipboard btn btn-sm BtnGroup-item tooltipped tooltipped-s" data-copied-hint="Copied!" type="button">Copy path</button>
    </div>
    <div class="breadcrumb js-zeroclipboard-target">
      <span class="repo-root js-repo-root"><span class="js-path-segment"><a href="/Llamero/Local_Hough_Circle"><span>Local_Hough_Circle</span></a></span></span><span class="separator">/</span><span class="js-path-segment"><a href="/Llamero/Local_Hough_Circle/tree/master/src"><span>src</span></a></span><span class="separator">/</span><span class="js-path-segment"><a href="/Llamero/Local_Hough_Circle/tree/master/src/main"><span>main</span></a></span><span class="separator">/</span><span class="js-path-segment"><a href="/Llamero/Local_Hough_Circle/tree/master/src/main/java"><span>java</span></a></span><span class="separator">/</span><span class="js-path-segment"><a href="/Llamero/Local_Hough_Circle/tree/master/src/main/java/Hough_Package"><span>Hough_Package</span></a></span><span class="separator">/</span><strong class="final-path">Hough_Circle.java</strong>
    </div>
  </div>


  <include-fragment class="commit-tease" src="/Llamero/Local_Hough_Circle/contributors/master/src/main/java/Hough_Package/Hough_Circle.java">
    <div>
      Fetching contributors&hellip;
    </div>

    <div class="commit-tease-contributors">
      <img alt="" class="loader-loading float-left" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32-EAF2F5.gif" width="16" />
      <span class="loader-error">Cannot retrieve contributors at this time</span>
    </div>
</include-fragment>
  <div class="file">
    <div class="file-header">
  <div class="file-actions">

    <div class="BtnGroup">
      <a href="/Llamero/Local_Hough_Circle/raw/master/src/main/java/Hough_Package/Hough_Circle.java" class="btn btn-sm BtnGroup-item" id="raw-url">Raw</a>
        <a href="/Llamero/Local_Hough_Circle/blame/master/src/main/java/Hough_Package/Hough_Circle.java" class="btn btn-sm js-update-url-with-hash BtnGroup-item" data-hotkey="b">Blame</a>
      <a href="/Llamero/Local_Hough_Circle/commits/master/src/main/java/Hough_Package/Hough_Circle.java" class="btn btn-sm BtnGroup-item" rel="nofollow">History</a>
    </div>


        <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/Llamero/Local_Hough_Circle/edit/master/src/main/java/Hough_Package/Hough_Circle.java" class="inline-form js-update-url-with-hash" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="rjBRfUapoQm1Pmnw45bE5A7G6rEcK5VK7pJtLdTXwqZbpaDI1T2u2IOA54wgsJfmYxAseJmuUkKgvI2uP4eRxQ==" /></div>
          <button class="btn-octicon tooltipped tooltipped-nw" type="submit"
            aria-label="Fork this project and edit the file" data-hotkey="e" data-disable-with>
            <svg aria-hidden="true" class="octicon octicon-pencil" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path fill-rule="evenodd" d="M0 12v3h3l8-8-3-3-8 8zm3 2H1v-2h1v1h1v1zm10.3-9.3L12 6 9 3l1.3-1.3a.996.996 0 0 1 1.41 0l1.59 1.59c.39.39.39 1.02 0 1.41z"/></svg>
          </button>
</form>        <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/Llamero/Local_Hough_Circle/delete/master/src/main/java/Hough_Package/Hough_Circle.java" class="inline-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="Wk+OY9wYI+JlqyS6tIMpcwSTEj1nwgxsLpYwfdGINQmlQVKBeJs1TrynbZ9hIvT4D7btbh3R1jeiwjQA9xKhyw==" /></div>
          <button class="btn-octicon btn-octicon-danger tooltipped tooltipped-nw" type="submit"
            aria-label="Fork this project and delete the file" data-disable-with>
            <svg aria-hidden="true" class="octicon octicon-trashcan" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M11 2H9c0-.55-.45-1-1-1H5c-.55 0-1 .45-1 1H2c-.55 0-1 .45-1 1v1c0 .55.45 1 1 1v9c0 .55.45 1 1 1h7c.55 0 1-.45 1-1V5c.55 0 1-.45 1-1V3c0-.55-.45-1-1-1zm-1 12H3V5h1v8h1V5h1v8h1V5h1v8h1V5h1v9zm1-10H2V3h9v1z"/></svg>
          </button>
</form>  </div>

  <div class="file-info">
      1482 lines (1259 sloc)
      <span class="file-info-divider"></span>
    84.5 KB
  </div>
</div>

    

  <div itemprop="text" class="blob-wrapper data type-java">
      <table class="highlight tab-size js-file-line-container" data-tab-size="8">
      <tr>
        <td id="L1" class="blob-num js-line-number" data-line-number="1"></td>
        <td id="LC1" class="blob-code blob-code-inner js-file-line"><span class="pl-k">package</span> <span class="pl-smi">Hough_Package</span>;</td>
      </tr>
      <tr>
        <td id="L2" class="blob-num js-line-number" data-line-number="2"></td>
        <td id="LC2" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L3" class="blob-num js-line-number" data-line-number="3"></td>
        <td id="LC3" class="blob-code blob-code-inner js-file-line"><span class="pl-c"><span class="pl-c">/*</span>* Hough_Circle.java:</span></td>
      </tr>
      <tr>
        <td id="L4" class="blob-num js-line-number" data-line-number="4"></td>
        <td id="LC4" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> </span></td>
      </tr>
      <tr>
        <td id="L5" class="blob-num js-line-number" data-line-number="5"></td>
        <td id="LC5" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> This program is free software; you can redistribute it and/or modify</span></td>
      </tr>
      <tr>
        <td id="L6" class="blob-num js-line-number" data-line-number="6"></td>
        <td id="LC6" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> it under the terms of the GNU General Public License as published by</span></td>
      </tr>
      <tr>
        <td id="L7" class="blob-num js-line-number" data-line-number="7"></td>
        <td id="LC7" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> the Free Software Foundation; either version 2 of the License, or</span></td>
      </tr>
      <tr>
        <td id="L8" class="blob-num js-line-number" data-line-number="8"></td>
        <td id="LC8" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> (at your option) any later version.</span></td>
      </tr>
      <tr>
        <td id="L9" class="blob-num js-line-number" data-line-number="9"></td>
        <td id="LC9" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> </span></td>
      </tr>
      <tr>
        <td id="L10" class="blob-num js-line-number" data-line-number="10"></td>
        <td id="LC10" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> This program is distributed in the hope that it will be useful,</span></td>
      </tr>
      <tr>
        <td id="L11" class="blob-num js-line-number" data-line-number="11"></td>
        <td id="LC11" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> but WITHOUT ANY WARRANTY; without even the implied warranty of</span></td>
      </tr>
      <tr>
        <td id="L12" class="blob-num js-line-number" data-line-number="12"></td>
        <td id="LC12" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the</span></td>
      </tr>
      <tr>
        <td id="L13" class="blob-num js-line-number" data-line-number="13"></td>
        <td id="LC13" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> GNU General Public License for more details.</span></td>
      </tr>
      <tr>
        <td id="L14" class="blob-num js-line-number" data-line-number="14"></td>
        <td id="LC14" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> </span></td>
      </tr>
      <tr>
        <td id="L15" class="blob-num js-line-number" data-line-number="15"></td>
        <td id="LC15" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> @author Ben Smith (benjamin.smith@berkeley.edu)</span></td>
      </tr>
      <tr>
        <td id="L16" class="blob-num js-line-number" data-line-number="16"></td>
        <td id="LC16" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> @Based on original plugin implementation by Hemerson Pistori (pistori@ec.ucdb.br) and Eduardo Rocha Costa</span></td>
      </tr>
      <tr>
        <td id="L17" class="blob-num js-line-number" data-line-number="17"></td>
        <td id="LC17" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> @created February 4, 2017</span></td>
      </tr>
      <tr>
        <td id="L18" class="blob-num js-line-number" data-line-number="18"></td>
        <td id="LC18" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> </span></td>
      </tr>
      <tr>
        <td id="L19" class="blob-num js-line-number" data-line-number="19"></td>
        <td id="LC19" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> The Hough Transform implementation was based on </span></td>
      </tr>
      <tr>
        <td id="L20" class="blob-num js-line-number" data-line-number="20"></td>
        <td id="LC20" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> Mark A. Schulze applet (http://www.markschulze.net/)</span></td>
      </tr>
      <tr>
        <td id="L21" class="blob-num js-line-number" data-line-number="21"></td>
        <td id="LC21" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> </span></td>
      </tr>
      <tr>
        <td id="L22" class="blob-num js-line-number" data-line-number="22"></td>
        <td id="LC22" class="blob-code blob-code-inner js-file-line"><span class="pl-c"><span class="pl-c">*/</span></span></td>
      </tr>
      <tr>
        <td id="L23" class="blob-num js-line-number" data-line-number="23"></td>
        <td id="LC23" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L24" class="blob-num js-line-number" data-line-number="24"></td>
        <td id="LC24" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">ij.*</span>;</td>
      </tr>
      <tr>
        <td id="L25" class="blob-num js-line-number" data-line-number="25"></td>
        <td id="LC25" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">ij.measure.Calibration</span>;</td>
      </tr>
      <tr>
        <td id="L26" class="blob-num js-line-number" data-line-number="26"></td>
        <td id="LC26" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">ij.process.*</span>;</td>
      </tr>
      <tr>
        <td id="L27" class="blob-num js-line-number" data-line-number="27"></td>
        <td id="LC27" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.awt.*</span>;</td>
      </tr>
      <tr>
        <td id="L28" class="blob-num js-line-number" data-line-number="28"></td>
        <td id="LC28" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">ij.plugin.HyperStackConverter</span>;</td>
      </tr>
      <tr>
        <td id="L29" class="blob-num js-line-number" data-line-number="29"></td>
        <td id="LC29" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">ij.plugin.frame.*</span>;</td>
      </tr>
      <tr>
        <td id="L30" class="blob-num js-line-number" data-line-number="30"></td>
        <td id="LC30" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.util.concurrent.atomic.AtomicInteger</span>;</td>
      </tr>
      <tr>
        <td id="L31" class="blob-num js-line-number" data-line-number="31"></td>
        <td id="LC31" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">javax.swing.*</span>;</td>
      </tr>
      <tr>
        <td id="L32" class="blob-num js-line-number" data-line-number="32"></td>
        <td id="LC32" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">ij.measure.ResultsTable</span>;</td>
      </tr>
      <tr>
        <td id="L33" class="blob-num js-line-number" data-line-number="33"></td>
        <td id="LC33" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">ij.plugin.filter.Analyzer</span>;</td>
      </tr>
      <tr>
        <td id="L34" class="blob-num js-line-number" data-line-number="34"></td>
        <td id="LC34" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.util.Arrays</span>;</td>
      </tr>
      <tr>
        <td id="L35" class="blob-num js-line-number" data-line-number="35"></td>
        <td id="LC35" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.util.List</span>;</td>
      </tr>
      <tr>
        <td id="L36" class="blob-num js-line-number" data-line-number="36"></td>
        <td id="LC36" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L37" class="blob-num js-line-number" data-line-number="37"></td>
        <td id="LC37" class="blob-code blob-code-inner js-file-line"><span class="pl-c"><span class="pl-c">/*</span>*</span></td>
      </tr>
      <tr>
        <td id="L38" class="blob-num js-line-number" data-line-number="38"></td>
        <td id="LC38" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> *</span></td>
      </tr>
      <tr>
        <td id="L39" class="blob-num js-line-number" data-line-number="39"></td>
        <td id="LC39" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * @author Ben</span></td>
      </tr>
      <tr>
        <td id="L40" class="blob-num js-line-number" data-line-number="40"></td>
        <td id="LC40" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> <span class="pl-c">*/</span></span></td>
      </tr>
      <tr>
        <td id="L41" class="blob-num js-line-number" data-line-number="41"></td>
        <td id="LC41" class="blob-code blob-code-inner js-file-line"><span class="pl-k">public</span> <span class="pl-k">class</span> <span class="pl-en">Hough_Circle</span> <span class="pl-k">extends</span> <span class="pl-e">SwingWorker&lt;<span class="pl-smi">Integer</span>, <span class="pl-smi">String</span>&gt;</span>{</td>
      </tr>
      <tr>
        <td id="L42" class="blob-num js-line-number" data-line-number="42"></td>
        <td id="LC42" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>Input parameters</span></td>
      </tr>
      <tr>
        <td id="L43" class="blob-num js-line-number" data-line-number="43"></td>
        <td id="LC43" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> radiusMin;  <span class="pl-c"><span class="pl-c">//</span> Find circles with radius grater or equal radiusMin - argument syntax: &quot;min=#&quot;</span></td>
      </tr>
      <tr>
        <td id="L44" class="blob-num js-line-number" data-line-number="44"></td>
        <td id="LC44" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> radiusMax;  <span class="pl-c"><span class="pl-c">//</span> Find circles with radius less or equal radiusMax - argument syntax: &quot;max=#&quot;</span></td>
      </tr>
      <tr>
        <td id="L45" class="blob-num js-line-number" data-line-number="45"></td>
        <td id="LC45" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> radiusInc;  <span class="pl-c"><span class="pl-c">//</span> Increment used to go from radiusMin to radiusMax - argument syntax: &quot;inc=#&quot;</span></td>
      </tr>
      <tr>
        <td id="L46" class="blob-num js-line-number" data-line-number="46"></td>
        <td id="LC46" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> minCircles; <span class="pl-c"><span class="pl-c">//</span> Minumum number of circles to be found - argument syntax: &quot;minCircles=#&quot;    </span></td>
      </tr>
      <tr>
        <td id="L47" class="blob-num js-line-number" data-line-number="47"></td>
        <td id="LC47" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> maxCircles; <span class="pl-c"><span class="pl-c">//</span> Maximum number of circles to be found - argument syntax: &quot;maxCircles=#&quot;</span></td>
      </tr>
      <tr>
        <td id="L48" class="blob-num js-line-number" data-line-number="48"></td>
        <td id="LC48" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> threshold <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>; <span class="pl-c"><span class="pl-c">//</span> An alternative to maxCircles. All circles with a value in the hough space greater then threshold are marked. Higher thresholds result in fewer circles. - argument syntax: &quot;threshold=#&quot;</span></td>
      </tr>
      <tr>
        <td id="L49" class="blob-num js-line-number" data-line-number="49"></td>
        <td id="LC49" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">double</span> thresholdRatio; <span class="pl-c"><span class="pl-c">//</span>Ratio input from GUI that expresses threshold as ratio of resolution (highest possible # of votes)</span></td>
      </tr>
      <tr>
        <td id="L50" class="blob-num js-line-number" data-line-number="50"></td>
        <td id="LC50" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> resolution; <span class="pl-c"><span class="pl-c">//</span>The number of steps to use per transform (i.e. number of voting rounds)</span></td>
      </tr>
      <tr>
        <td id="L51" class="blob-num js-line-number" data-line-number="51"></td>
        <td id="LC51" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">double</span> ratio; <span class="pl-c"><span class="pl-c">//</span> Ratio of found circle radius to clear out surrounding neighbors</span></td>
      </tr>
      <tr>
        <td id="L52" class="blob-num js-line-number" data-line-number="52"></td>
        <td id="LC52" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> searchBand <span class="pl-k">=</span> <span class="pl-c1">0</span>; <span class="pl-c"><span class="pl-c">//</span>The +/- range of radii to search for relative to the last found radius - argument syntax: &quot;bandwidth=#&quot;</span></td>
      </tr>
      <tr>
        <td id="L53" class="blob-num js-line-number" data-line-number="53"></td>
        <td id="LC53" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> searchRadius <span class="pl-k">=</span> <span class="pl-c1">0</span>; <span class="pl-c"><span class="pl-c">//</span>The search radius to look for the next centroid relative to the last found centroid - argument syntax: &quot;radius=#&quot;</span></td>
      </tr>
      <tr>
        <td id="L54" class="blob-num js-line-number" data-line-number="54"></td>
        <td id="LC54" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">boolean</span> reduce <span class="pl-k">=</span> <span class="pl-c1">false</span>; <span class="pl-c"><span class="pl-c">//</span>Cap the transform resolution by removeing redundant steps</span></td>
      </tr>
      <tr>
        <td id="L55" class="blob-num js-line-number" data-line-number="55"></td>
        <td id="LC55" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">boolean</span> local <span class="pl-k">=</span> <span class="pl-c1">false</span>; <span class="pl-c"><span class="pl-c">//</span>Whether or not the search is going to be local</span></td>
      </tr>
      <tr>
        <td id="L56" class="blob-num js-line-number" data-line-number="56"></td>
        <td id="LC56" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L57" class="blob-num js-line-number" data-line-number="57"></td>
        <td id="LC57" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>Output parameters</span></td>
      </tr>
      <tr>
        <td id="L58" class="blob-num js-line-number" data-line-number="58"></td>
        <td id="LC58" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">boolean</span> houghSeries <span class="pl-k">=</span> <span class="pl-c1">false</span>; <span class="pl-c"><span class="pl-c">//</span>Contains whether the user wants the Hough series stack as an output - argument syntax: &quot;show_raw&quot;</span></td>
      </tr>
      <tr>
        <td id="L59" class="blob-num js-line-number" data-line-number="59"></td>
        <td id="LC59" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">boolean</span> showCircles <span class="pl-k">=</span> <span class="pl-c1">false</span>; <span class="pl-c"><span class="pl-c">//</span>Contains whether the user wants the circles found as an output - argument syntax: &quot;show_mask&quot;</span></td>
      </tr>
      <tr>
        <td id="L60" class="blob-num js-line-number" data-line-number="60"></td>
        <td id="LC60" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">boolean</span> showID <span class="pl-k">=</span> <span class="pl-c1">false</span>; <span class="pl-c"><span class="pl-c">//</span>Contains whether the user wants a map of centroids and radii outputed from search - argument syntax: &quot;show_centroids&quot;</span></td>
      </tr>
      <tr>
        <td id="L61" class="blob-num js-line-number" data-line-number="61"></td>
        <td id="LC61" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">boolean</span> showScores <span class="pl-k">=</span> <span class="pl-c1">false</span>; <span class="pl-c"><span class="pl-c">//</span>Contains whether the user wants a map of centroids and Hough scores outputed from search - argument syntax: &quot;show_scores&quot;</span></td>
      </tr>
      <tr>
        <td id="L62" class="blob-num js-line-number" data-line-number="62"></td>
        <td id="LC62" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">boolean</span> results <span class="pl-k">=</span> <span class="pl-c1">false</span>; <span class="pl-c"><span class="pl-c">//</span>Contains whether the user wants to export the measurements to a reuslts table </span></td>
      </tr>
      <tr>
        <td id="L63" class="blob-num js-line-number" data-line-number="63"></td>
        <td id="LC63" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">Calibration</span> pixelCal;</td>
      </tr>
      <tr>
        <td id="L64" class="blob-num js-line-number" data-line-number="64"></td>
        <td id="LC64" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">String</span> pixelUnits; <span class="pl-c"><span class="pl-c">//</span>Stores the unit of measurement fo the pixels</span></td>
      </tr>
      <tr>
        <td id="L65" class="blob-num js-line-number" data-line-number="65"></td>
        <td id="LC65" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">double</span> pixelDimensions; <span class="pl-c"><span class="pl-c">//</span>Stores the size of each pixel</span></td>
      </tr>
      <tr>
        <td id="L66" class="blob-num js-line-number" data-line-number="66"></td>
        <td id="LC66" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span>[] imageDimensions; <span class="pl-c"><span class="pl-c">//</span>Pixel dimensions of stack</span></td>
      </tr>
      <tr>
        <td id="L67" class="blob-num js-line-number" data-line-number="67"></td>
        <td id="LC67" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">String</span> timeUnits; <span class="pl-c"><span class="pl-c">//</span>Frame units</span></td>
      </tr>
      <tr>
        <td id="L68" class="blob-num js-line-number" data-line-number="68"></td>
        <td id="LC68" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">double</span> timeDimension; <span class="pl-c"><span class="pl-c">//</span>Time step per frame</span></td>
      </tr>
      <tr>
        <td id="L69" class="blob-num js-line-number" data-line-number="69"></td>
        <td id="LC69" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L70" class="blob-num js-line-number" data-line-number="70"></td>
        <td id="LC70" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">String</span> currentStatus <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span><span class="pl-pds">&quot;</span></span>; <span class="pl-c"><span class="pl-c">//</span>String for outputting current status</span></td>
      </tr>
      <tr>
        <td id="L71" class="blob-num js-line-number" data-line-number="71"></td>
        <td id="LC71" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">boolean</span> isGUI; <span class="pl-c"><span class="pl-c">//</span>Whether a GUI is active (or a macro called the plugin)</span></td>
      </tr>
      <tr>
        <td id="L72" class="blob-num js-line-number" data-line-number="72"></td>
        <td id="LC72" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">final</span> <span class="pl-k">static</span> <span class="pl-k">int</span> <span class="pl-c1">GUI_UPDATE_DELAY</span> <span class="pl-k">=</span> <span class="pl-c1">100</span>; <span class="pl-c"><span class="pl-c">//</span>How long to wait between GUI updates</span></td>
      </tr>
      <tr>
        <td id="L73" class="blob-num js-line-number" data-line-number="73"></td>
        <td id="LC73" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">boolean</span> cancelThread <span class="pl-k">=</span> <span class="pl-c1">false</span>;</td>
      </tr>
      <tr>
        <td id="L74" class="blob-num js-line-number" data-line-number="74"></td>
        <td id="LC74" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L75" class="blob-num js-line-number" data-line-number="75"></td>
        <td id="LC75" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>Hough transform variables</span></td>
      </tr>
      <tr>
        <td id="L76" class="blob-num js-line-number" data-line-number="76"></td>
        <td id="LC76" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">ImagePlus</span> imp; <span class="pl-c"><span class="pl-c">//</span>Initalize the variable to hold the image</span></td>
      </tr>
      <tr>
        <td id="L77" class="blob-num js-line-number" data-line-number="77"></td>
        <td id="LC77" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">boolean</span> isStack <span class="pl-k">=</span> <span class="pl-c1">false</span>; <span class="pl-c"><span class="pl-c">//</span>True if there is more than one slice in the input data</span></td>
      </tr>
      <tr>
        <td id="L78" class="blob-num js-line-number" data-line-number="78"></td>
        <td id="LC78" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> stackSlices; <span class="pl-c"><span class="pl-c">//</span>number of slices in the stack</span></td>
      </tr>
      <tr>
        <td id="L79" class="blob-num js-line-number" data-line-number="79"></td>
        <td id="LC79" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> maxHough; <span class="pl-c"><span class="pl-c">//</span>Contains the brights pixel in the entire Hough array</span></td>
      </tr>
      <tr>
        <td id="L80" class="blob-num js-line-number" data-line-number="80"></td>
        <td id="LC80" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">Point</span> maxPoint; <span class="pl-c"><span class="pl-c">//</span>Stores the location of the brightest pixel in the Hough array</span></td>
      </tr>
      <tr>
        <td id="L81" class="blob-num js-line-number" data-line-number="81"></td>
        <td id="LC81" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> maxRadius; <span class="pl-c"><span class="pl-c">//</span>Stores the radius of the brightest pixel in the Hough array</span></td>
      </tr>
      <tr>
        <td id="L82" class="blob-num js-line-number" data-line-number="82"></td>
        <td id="LC82" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">Rectangle</span> r; <span class="pl-c"><span class="pl-c">//</span>Stores the ROI on the original image</span></td>
      </tr>
      <tr>
        <td id="L83" class="blob-num js-line-number" data-line-number="83"></td>
        <td id="LC83" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">float</span> imageValues[]; <span class="pl-c"><span class="pl-c">//</span> Raw image (returned by ip.getPixels()) - float is used to allow 8, 16 or 32 bit images</span></td>
      </tr>
      <tr>
        <td id="L84" class="blob-num js-line-number" data-line-number="84"></td>
        <td id="LC84" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> houghValues[][][]; <span class="pl-c"><span class="pl-c">//</span> Hough Space Values [X coord][Y coord][radius index]</span></td>
      </tr>
      <tr>
        <td id="L85" class="blob-num js-line-number" data-line-number="85"></td>
        <td id="LC85" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> localHoughValues[][][][]; <span class="pl-c"><span class="pl-c">//</span>Local Hough space [circle#][X coord][Y coord][radius index]</span></td>
      </tr>
      <tr>
        <td id="L86" class="blob-num js-line-number" data-line-number="86"></td>
        <td id="LC86" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> localHoughParameters[][]; <span class="pl-c"><span class="pl-c">//</span>Array to pass local Hough space parameters to centroid search [circle#][parameter vector]</span></td>
      </tr>
      <tr>
        <td id="L87" class="blob-num js-line-number" data-line-number="87"></td>
        <td id="LC87" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> width; <span class="pl-c"><span class="pl-c">//</span> ROI width</span></td>
      </tr>
      <tr>
        <td id="L88" class="blob-num js-line-number" data-line-number="88"></td>
        <td id="LC88" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> height;  <span class="pl-c"><span class="pl-c">//</span> ROI height</span></td>
      </tr>
      <tr>
        <td id="L89" class="blob-num js-line-number" data-line-number="89"></td>
        <td id="LC89" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> depth;  <span class="pl-c"><span class="pl-c">//</span> Number of slices</span></td>
      </tr>
      <tr>
        <td id="L90" class="blob-num js-line-number" data-line-number="90"></td>
        <td id="LC90" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> fullWidth; <span class="pl-c"><span class="pl-c">//</span> Image Width</span></td>
      </tr>
      <tr>
        <td id="L91" class="blob-num js-line-number" data-line-number="91"></td>
        <td id="LC91" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> fullHeight; <span class="pl-c"><span class="pl-c">//</span>Image Height</span></td>
      </tr>
      <tr>
        <td id="L92" class="blob-num js-line-number" data-line-number="92"></td>
        <td id="LC92" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> offx;   <span class="pl-c"><span class="pl-c">//</span> ROI x origin position</span></td>
      </tr>
      <tr>
        <td id="L93" class="blob-num js-line-number" data-line-number="93"></td>
        <td id="LC93" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> offy;   <span class="pl-c"><span class="pl-c">//</span> ROI y origin position</span></td>
      </tr>
      <tr>
        <td id="L94" class="blob-num js-line-number" data-line-number="94"></td>
        <td id="LC94" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">Point</span> centerPoint[]; <span class="pl-c"><span class="pl-c">//</span> Center Points of the Circles Found.</span></td>
      </tr>
      <tr>
        <td id="L95" class="blob-num js-line-number" data-line-number="95"></td>
        <td id="LC95" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> centerRadii[]; <span class="pl-c"><span class="pl-c">//</span>Corresponding radii of the cricles marked by the center points</span></td>
      </tr>
      <tr>
        <td id="L96" class="blob-num js-line-number" data-line-number="96"></td>
        <td id="LC96" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> houghScores[]; <span class="pl-c"><span class="pl-c">//</span>Corresponding Hough scores for each centroid</span></td>
      </tr>
      <tr>
        <td id="L97" class="blob-num js-line-number" data-line-number="97"></td>
        <td id="LC97" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> circleID[]; <span class="pl-c"><span class="pl-c">//</span>Corresponding ID # for each centroid</span></td>
      </tr>
      <tr>
        <td id="L98" class="blob-num js-line-number" data-line-number="98"></td>
        <td id="LC98" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> circleIDcounter; <span class="pl-c"><span class="pl-c">//</span>Counter for keeping track of current max ID #</span></td>
      </tr>
      <tr>
        <td id="L99" class="blob-num js-line-number" data-line-number="99"></td>
        <td id="LC99" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> lut[][][]; <span class="pl-c"><span class="pl-c">//</span> LookUp Table for x and y tranform shifts in an octahedral manner</span></td>
      </tr>
      <tr>
        <td id="L100" class="blob-num js-line-number" data-line-number="100"></td>
        <td id="LC100" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> lutSize; <span class="pl-c"><span class="pl-c">//</span>Stores the actual number of transforms performed (&lt;=selected resolution)</span></td>
      </tr>
      <tr>
        <td id="L101" class="blob-num js-line-number" data-line-number="101"></td>
        <td id="LC101" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> nCircles; <span class="pl-c"><span class="pl-c">//</span>Number of circles found during search - &lt;= maxCircles</span></td>
      </tr>
      <tr>
        <td id="L102" class="blob-num js-line-number" data-line-number="102"></td>
        <td id="LC102" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> nCirlcesPrev; <span class="pl-c"><span class="pl-c">//</span>Stores nCirlces from last iteration</span></td>
      </tr>
      <tr>
        <td id="L103" class="blob-num js-line-number" data-line-number="103"></td>
        <td id="LC103" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">boolean</span> localSearch <span class="pl-k">=</span> <span class="pl-c1">false</span>; <span class="pl-c"><span class="pl-c">//</span>Record whether a local-only search was done for the frame</span></td>
      </tr>
      <tr>
        <td id="L104" class="blob-num js-line-number" data-line-number="104"></td>
        <td id="LC104" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L105" class="blob-num js-line-number" data-line-number="105"></td>
        <td id="LC105" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>Variables for storing the results and exporting result images</span></td>
      </tr>
      <tr>
        <td id="L106" class="blob-num js-line-number" data-line-number="106"></td>
        <td id="LC106" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">ImagePlus</span> houghPlus;</td>
      </tr>
      <tr>
        <td id="L107" class="blob-num js-line-number" data-line-number="107"></td>
        <td id="LC107" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">ImageStack</span> houghStack;</td>
      </tr>
      <tr>
        <td id="L108" class="blob-num js-line-number" data-line-number="108"></td>
        <td id="LC108" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">ImagePlus</span> circlePlus;</td>
      </tr>
      <tr>
        <td id="L109" class="blob-num js-line-number" data-line-number="109"></td>
        <td id="LC109" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">ImageStack</span> circleStack;</td>
      </tr>
      <tr>
        <td id="L110" class="blob-num js-line-number" data-line-number="110"></td>
        <td id="LC110" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">ImagePlus</span> idPlus;</td>
      </tr>
      <tr>
        <td id="L111" class="blob-num js-line-number" data-line-number="111"></td>
        <td id="LC111" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">ImageStack</span> idStack;</td>
      </tr>
      <tr>
        <td id="L112" class="blob-num js-line-number" data-line-number="112"></td>
        <td id="LC112" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">ImagePlus</span> scorePlus;</td>
      </tr>
      <tr>
        <td id="L113" class="blob-num js-line-number" data-line-number="113"></td>
        <td id="LC113" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">ImageStack</span> scoreStack;</td>
      </tr>
      <tr>
        <td id="L114" class="blob-num js-line-number" data-line-number="114"></td>
        <td id="LC114" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">ImageProcessor</span> circlesip;</td>
      </tr>
      <tr>
        <td id="L115" class="blob-num js-line-number" data-line-number="115"></td>
        <td id="LC115" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">ImageProcessor</span> <span class="pl-smi">IDip</span>;</td>
      </tr>
      <tr>
        <td id="L116" class="blob-num js-line-number" data-line-number="116"></td>
        <td id="LC116" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">ImageProcessor</span> scoresip;</td>
      </tr>
      <tr>
        <td id="L117" class="blob-num js-line-number" data-line-number="117"></td>
        <td id="LC117" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">ResultsTable</span> rt; </td>
      </tr>
      <tr>
        <td id="L118" class="blob-num js-line-number" data-line-number="118"></td>
        <td id="LC118" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">String</span> method;</td>
      </tr>
      <tr>
        <td id="L119" class="blob-num js-line-number" data-line-number="119"></td>
        <td id="LC119" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L120" class="blob-num js-line-number" data-line-number="120"></td>
        <td id="LC120" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>Build LUTs for colorimetric output</span></td>
      </tr>
      <tr>
        <td id="L121" class="blob-num js-line-number" data-line-number="121"></td>
        <td id="LC121" class="blob-code blob-code-inner js-file-line">    private final static byte[] RAND_R = new byte[] {(byte) 0, (byte) 231, (byte) 25, (byte) 27, (byte) 112, (byte) 89, (byte) 53, (byte) 77, (byte) 155, (byte) 153, (byte) 91, (byte) 19, (byte) 25, (byte) 135, (byte) 187, (byte) 40, (byte) 52, (byte) 39, (byte) 147, (byte) 72, (byte) 92, (byte) 23, (byte) 5, (byte) 202, (byte) 52, (byte) 50, (byte) 108, (byte) 66, (byte) 238, (byte) 46, (byte) 136, (byte) 8, (byte) 162, (byte) 126, (byte) 75, (byte) 60, (byte) 135, (byte) 167, (byte) 136, (byte) 244, (byte) 161, (byte) 204, (byte) 158, (byte) 112, (byte) 192, (byte) 2, (byte) 98, (byte) 207, (byte) 233, (byte) 121, (byte) 191, (byte) 18, (byte) 210, (byte) 151, (byte) 252, (byte) 155, (byte) 139, (byte) 42, (byte) 188, (byte) 170, (byte) 127, (byte) 151, (byte) 38, (byte) 16, (byte) 227, (byte) 120, (byte) 137, (byte) 2, (byte) 72, (byte) 71, (byte) 214, (byte) 130, (byte) 194, (byte) 96, (byte) 102, (byte) 33, (byte) 92, (byte) 47, (byte) 211, (byte) 226, (byte) 237, (byte) 132, (byte) 244, (byte) 45, (byte) 82, (byte) 73, (byte) 239, (byte) 198, (byte) 118, (byte) 191, (byte) 170, (byte) 238, (byte) 177, (byte) 246, (byte) 66, (byte) 5, (byte) 44, (byte) 3, (byte) 18, (byte) 40, (byte) 226, (byte) 94, (byte) 130, (byte) 216, (byte) 68, (byte) 89, (byte) 150, (byte) 40, (byte) 96, (byte) 155, (byte) 95, (byte) 5, (byte) 132, (byte) 88, (byte) 124, (byte) 241, (byte) 143, (byte) 15, (byte) 1, (byte) 220, (byte) 46, (byte) 220, (byte) 216, (byte) 155, (byte) 190, (byte) 4, (byte) 98, (byte) 33, (byte) 142, (byte) 153, (byte) 185, (byte) 61, (byte) 153, (byte) 160, (byte) 164, (byte) 102, (byte) 75, (byte) 8, (byte) 26, (byte) 231, (byte) 160, (byte) 245, (byte) 119, (byte) 69, (byte) 95, (byte) 137, (byte) 232, (byte) 249, (byte) 89, (byte) 220, (byte) 54, (byte) 3, (byte) 43, (byte) 134, (byte) 172, (byte) 31, (byte) 106, (byte) 234, (byte) 132, (byte) 1, (byte) 29, (byte) 65, (byte) 12, (byte) 107, (byte) 52, (byte) 196, (byte) 95, (byte) 165, (byte) 4, (byte) 101, (byte) 124, (byte) 240, (byte) 203, (byte) 50, (byte) 142, (byte) 231, (byte) 5, (byte) 23, (byte) 43, (byte) 198, (byte) 41, (byte) 80, (byte) 66, (byte) 232, (byte) 86, (byte) 151, (byte) 126, (byte) 51, (byte) 122, (byte) 111, (byte) 162, (byte) 192, (byte) 148, (byte) 210, (byte) 5, (byte) 251, (byte) 40, (byte) 176, (byte) 32, (byte) 2, (byte) 22, (byte) 91, (byte) 180, (byte) 31, (byte) 218, (byte) 9, (byte) 10, (byte) 178, (byte) 27, (byte) 115, (byte) 54, (byte) 199, (byte) 163, (byte) 10, (byte) 180, (byte) 222, (byte) 102, (byte) 198, (byte) 202, (byte) 220, (byte) 96, (byte) 145, (byte) 237, (byte) 127, (byte) 172, (byte) 51, (byte) 64, (byte) 47, (byte) 84, (byte) 37, (byte) 196, (byte) 147, (byte) 244, (byte) 206, (byte) 244, (byte) 43, (byte) 170, (byte) 186, (byte) 162, (byte) 157, (byte) 125, (byte) 230, (byte) 212, (byte) 140, (byte) 186, (byte) 127, (byte) 12, (byte) 48, (byte) 0, (byte) 92, (byte) 168, (byte) 73, (byte) 228, (byte) 121, (byte) 248, (byte) 255}; </td>
      </tr>
      <tr>
        <td id="L122" class="blob-num js-line-number" data-line-number="122"></td>
        <td id="LC122" class="blob-code blob-code-inner js-file-line">    private final static byte[] RAND_G = new byte[] {(byte) 0, (byte) 217, (byte) 131, (byte) 18, (byte) 66, (byte) 198, (byte) 59, (byte) 170, (byte) 108, (byte) 8, (byte) 167, (byte) 207, (byte) 248, (byte) 138, (byte) 215, (byte) 204, (byte) 95, (byte) 249, (byte) 102, (byte) 66, (byte) 1, (byte) 138, (byte) 71, (byte) 33, (byte) 209, (byte) 80, (byte) 72, (byte) 87, (byte) 129, (byte) 24, (byte) 200, (byte) 98, (byte) 16, (byte) 160, (byte) 47, (byte) 1, (byte) 224, (byte) 49, (byte) 126, (byte) 41, (byte) 235, (byte) 205, (byte) 84, (byte) 249, (byte) 222, (byte) 125, (byte) 5, (byte) 58, (byte) 90, (byte) 137, (byte) 73, (byte) 98, (byte) 109, (byte) 167, (byte) 91, (byte) 106, (byte) 68, (byte) 23, (byte) 10, (byte) 241, (byte) 51, (byte) 35, (byte) 77, (byte) 112, (byte) 243, (byte) 235, (byte) 53, (byte) 41, (byte) 21, (byte) 134, (byte) 106, (byte) 60, (byte) 231, (byte) 107, (byte) 124, (byte) 96, (byte) 131, (byte) 62, (byte) 213, (byte) 220, (byte) 78, (byte) 96, (byte) 44, (byte) 106, (byte) 128, (byte) 96, (byte) 129, (byte) 164, (byte) 59, (byte) 86, (byte) 45, (byte) 87, (byte) 237, (byte) 192, (byte) 171, (byte) 93, (byte) 223, (byte) 206, (byte) 158, (byte) 42, (byte) 255, (byte) 175, (byte) 142, (byte) 177, (byte) 48, (byte) 67, (byte) 221, (byte) 123, (byte) 125, (byte) 182, (byte) 135, (byte) 31, (byte) 163, (byte) 211, (byte) 220, (byte) 28, (byte) 81, (byte) 113, (byte) 235, (byte) 236, (byte) 30, (byte) 104, (byte) 238, (byte) 227, (byte) 18, (byte) 134, (byte) 193, (byte) 15, (byte) 122, (byte) 151, (byte) 6, (byte) 132, (byte) 0, (byte) 128, (byte) 88, (byte) 20, (byte) 130, (byte) 87, (byte) 127, (byte) 55, (byte) 13, (byte) 76, (byte) 15, (byte) 124, (byte) 251, (byte) 160, (byte) 177, (byte) 179, (byte) 14, (byte) 7, (byte) 189, (byte) 49, (byte) 210, (byte) 77, (byte) 63, (byte) 132, (byte) 17, (byte) 84, (byte) 214, (byte) 63, (byte) 206, (byte) 252, (byte) 184, (byte) 168, (byte) 109, (byte) 129, (byte) 89, (byte) 70, (byte) 66, (byte) 151, (byte) 151, (byte) 100, (byte) 27, (byte) 123, (byte) 35, (byte) 210, (byte) 112, (byte) 183, (byte) 135, (byte) 97, (byte) 19, (byte) 7, (byte) 159, (byte) 221, (byte) 46, (byte) 253, (byte) 42, (byte) 229, (byte) 101, (byte) 187, (byte) 10, (byte) 33, (byte) 152, (byte) 138, (byte) 236, (byte) 208, (byte) 117, (byte) 230, (byte) 98, (byte) 200, (byte) 139, (byte) 200, (byte) 255, (byte) 19, (byte) 219, (byte) 183, (byte) 181, (byte) 3, (byte) 43, (byte) 143, (byte) 130, (byte) 75, (byte) 21, (byte) 228, (byte) 121, (byte) 208, (byte) 51, (byte) 82, (byte) 41, (byte) 233, (byte) 56, (byte) 220, (byte) 190, (byte) 176, (byte) 136, (byte) 108, (byte) 88, (byte) 118, (byte) 228, (byte) 206, (byte) 11, (byte) 170, (byte) 236, (byte) 232, (byte) 204, (byte) 241, (byte) 241, (byte) 69, (byte) 71, (byte) 28, (byte) 143, (byte) 207, (byte) 52, (byte) 188, (byte) 183, (byte) 80, (byte) 4, (byte) 222, (byte) 162, (byte) 30, (byte) 213, (byte) 228, (byte) 119, (byte) 142, (byte) 10, (byte) 255};</td>
      </tr>
      <tr>
        <td id="L123" class="blob-num js-line-number" data-line-number="123"></td>
        <td id="LC123" class="blob-code blob-code-inner js-file-line">    private final static byte[] RAND_B = new byte[] {(byte) 0, (byte) 43, (byte) 203, (byte) 219, (byte) 253, (byte) 158, (byte) 5, (byte) 190, (byte) 72, (byte) 11, (byte) 23, (byte) 233, (byte) 220, (byte) 246, (byte) 53, (byte) 10, (byte) 90, (byte) 49, (byte) 215, (byte) 182, (byte) 74, (byte) 50, (byte) 27, (byte) 107, (byte) 39, (byte) 48, (byte) 192, (byte) 134, (byte) 247, (byte) 89, (byte) 14, (byte) 3, (byte) 67, (byte) 65, (byte) 30, (byte) 136, (byte) 78, (byte) 129, (byte) 178, (byte) 138, (byte) 186, (byte) 204, (byte) 5, (byte) 160, (byte) 18, (byte) 103, (byte) 255, (byte) 162, (byte) 42, (byte) 128, (byte) 213, (byte) 204, (byte) 49, (byte) 80, (byte) 181, (byte) 130, (byte) 60, (byte) 185, (byte) 31, (byte) 203, (byte) 184, (byte) 89, (byte) 108, (byte) 190, (byte) 109, (byte) 157, (byte) 231, (byte) 62, (byte) 128, (byte) 96, (byte) 150, (byte) 153, (byte) 160, (byte) 54, (byte) 24, (byte) 143, (byte) 90, (byte) 216, (byte) 128, (byte) 120, (byte) 87, (byte) 244, (byte) 15, (byte) 213, (byte) 235, (byte) 142, (byte) 140, (byte) 33, (byte) 98, (byte) 164, (byte) 202, (byte) 38, (byte) 84, (byte) 63, (byte) 229, (byte) 163, (byte) 28, (byte) 239, (byte) 210, (byte) 131, (byte) 79, (byte) 83, (byte) 168, (byte) 79, (byte) 89, (byte) 170, (byte) 26, (byte) 168, (byte) 149, (byte) 217, (byte) 31, (byte) 20, (byte) 11, (byte) 141, (byte) 121, (byte) 139, (byte) 21, (byte) 58, (byte) 194, (byte) 75, (byte) 110, (byte) 234, (byte) 16, (byte) 126, (byte) 24, (byte) 41, (byte) 62, (byte) 88, (byte) 232, (byte) 38, (byte) 243, (byte) 83, (byte) 195, (byte) 58, (byte) 84, (byte) 106, (byte) 151, (byte) 32, (byte) 146, (byte) 24, (byte) 140, (byte) 217, (byte) 176, (byte) 186, (byte) 174, (byte) 170, (byte) 250, (byte) 1, (byte) 48, (byte) 141, (byte) 99, (byte) 213, (byte) 127, (byte) 46, (byte) 97, (byte) 12, (byte) 143, (byte) 237, (byte) 153, (byte) 185, (byte) 72, (byte) 170, (byte) 23, (byte) 222, (byte) 216, (byte) 23, (byte) 92, (byte) 232, (byte) 54, (byte) 64, (byte) 72, (byte) 128, (byte) 182, (byte) 38, (byte) 192, (byte) 138, (byte) 115, (byte) 162, (byte) 231, (byte) 2, (byte) 143, (byte) 117, (byte) 167, (byte) 196, (byte) 4, (byte) 182, (byte) 220, (byte) 52, (byte) 252, (byte) 34, (byte) 2, (byte) 233, (byte) 132, (byte) 135, (byte) 230, (byte) 36, (byte) 199, (byte) 228, (byte) 222, (byte) 43, (byte) 119, (byte) 7, (byte) 148, (byte) 59, (byte) 10, (byte) 35, (byte) 158, (byte) 237, (byte) 17, (byte) 116, (byte) 110, (byte) 129, (byte) 172, (byte) 233, (byte) 172, (byte) 47, (byte) 114, (byte) 26, (byte) 115, (byte) 212, (byte) 177, (byte) 157, (byte) 74, (byte) 183, (byte) 102, (byte) 132, (byte) 151, (byte) 18, (byte) 242, (byte) 242, (byte) 12, (byte) 138, (byte) 21, (byte) 159, (byte) 165, (byte) 213, (byte) 230, (byte) 147, (byte) 174, (byte) 206, (byte) 116, (byte) 9, (byte) 242, (byte) 233, (byte) 202, (byte) 205, (byte) 116, (byte) 169, (byte) 80, (byte) 53, (byte) 161, (byte) 239, (byte) 211, (byte) 73, (byte) 96, (byte) 255};</td>
      </tr>
      <tr>
        <td id="L124" class="blob-num js-line-number" data-line-number="124"></td>
        <td id="LC124" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">final</span> <span class="pl-k">static</span> <span class="pl-smi">LUT</span> <span class="pl-c1">RAND_LUT</span> <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">LUT</span>(<span class="pl-c1">RAND_R</span>, <span class="pl-c1">RAND_G</span>, <span class="pl-c1">RAND_B</span>);</td>
      </tr>
      <tr>
        <td id="L125" class="blob-num js-line-number" data-line-number="125"></td>
        <td id="LC125" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L126" class="blob-num js-line-number" data-line-number="126"></td>
        <td id="LC126" class="blob-code blob-code-inner js-file-line">    private final static byte[] GYR_R = new byte[] {(byte) 0, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 253, (byte) 251, (byte) 249, (byte) 247, (byte) 245, (byte) 243, (byte) 241, (byte) 239, (byte) 237, (byte) 235, (byte) 233, (byte) 231, (byte) 229, (byte) 227, (byte) 225, (byte) 223, (byte) 221, (byte) 219, (byte) 217, (byte) 215, (byte) 213, (byte) 211, (byte) 209, (byte) 207, (byte) 205, (byte) 203, (byte) 201, (byte) 199, (byte) 197, (byte) 195, (byte) 193, (byte) 191, (byte) 189, (byte) 187, (byte) 185, (byte) 183, (byte) 181, (byte) 179, (byte) 177, (byte) 175, (byte) 173, (byte) 171, (byte) 169, (byte) 167, (byte) 165, (byte) 163, (byte) 161, (byte) 159, (byte) 157, (byte) 155, (byte) 153, (byte) 151, (byte) 149, (byte) 147, (byte) 145, (byte) 143, (byte) 141, (byte) 139, (byte) 137, (byte) 135, (byte) 133, (byte) 131, (byte) 129, (byte) 127, (byte) 125, (byte) 123, (byte) 121, (byte) 119, (byte) 117, (byte) 115, (byte) 113, (byte) 111, (byte) 109, (byte) 107, (byte) 105, (byte) 103, (byte) 101, (byte) 99, (byte) 97, (byte) 95, (byte) 93, (byte) 91, (byte) 89, (byte) 87, (byte) 85, (byte) 83, (byte) 81, (byte) 79, (byte) 77, (byte) 75, (byte) 73, (byte) 71, (byte) 69, (byte) 67, (byte) 65, (byte) 63, (byte) 61, (byte) 59, (byte) 57, (byte) 55, (byte) 53, (byte) 51, (byte) 49, (byte) 47, (byte) 45, (byte) 43, (byte) 41, (byte) 39, (byte) 37, (byte) 35, (byte) 33, (byte) 31, (byte) 29, (byte) 27, (byte) 25, (byte) 23, (byte) 21, (byte) 19, (byte) 17, (byte) 15, (byte) 13, (byte) 11, (byte) 9, (byte) 7, (byte) 5, (byte) 3, (byte) 1};</td>
      </tr>
      <tr>
        <td id="L127" class="blob-num js-line-number" data-line-number="127"></td>
        <td id="LC127" class="blob-code blob-code-inner js-file-line">    private final static byte[] GYR_G = new byte[] {(byte) 0, (byte) 1, (byte) 3, (byte) 5, (byte) 7, (byte) 9, (byte) 11, (byte) 13, (byte) 15, (byte) 17, (byte) 19, (byte) 21, (byte) 23, (byte) 25, (byte) 27, (byte) 29, (byte) 31, (byte) 33, (byte) 35, (byte) 37, (byte) 39, (byte) 41, (byte) 43, (byte) 45, (byte) 47, (byte) 49, (byte) 51, (byte) 53, (byte) 55, (byte) 57, (byte) 59, (byte) 61, (byte) 63, (byte) 65, (byte) 67, (byte) 69, (byte) 71, (byte) 73, (byte) 75, (byte) 77, (byte) 79, (byte) 81, (byte) 83, (byte) 85, (byte) 87, (byte) 89, (byte) 91, (byte) 93, (byte) 95, (byte) 97, (byte) 99, (byte) 101, (byte) 103, (byte) 105, (byte) 107, (byte) 109, (byte) 111, (byte) 113, (byte) 115, (byte) 117, (byte) 119, (byte) 121, (byte) 123, (byte) 125, (byte) 127, (byte) 129, (byte) 131, (byte) 133, (byte) 135, (byte) 137, (byte) 139, (byte) 141, (byte) 143, (byte) 145, (byte) 147, (byte) 149, (byte) 151, (byte) 153, (byte) 155, (byte) 157, (byte) 159, (byte) 161, (byte) 163, (byte) 165, (byte) 167, (byte) 169, (byte) 171, (byte) 173, (byte) 175, (byte) 177, (byte) 179, (byte) 181, (byte) 183, (byte) 185, (byte) 187, (byte) 189, (byte) 191, (byte) 193, (byte) 195, (byte) 197, (byte) 199, (byte) 201, (byte) 203, (byte) 205, (byte) 207, (byte) 209, (byte) 211, (byte) 213, (byte) 215, (byte) 217, (byte) 219, (byte) 221, (byte) 223, (byte) 225, (byte) 227, (byte) 229, (byte) 231, (byte) 233, (byte) 235, (byte) 237, (byte) 239, (byte) 241, (byte) 243, (byte) 245, (byte) 247, (byte) 249, (byte) 251, (byte) 253, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255}; </td>
      </tr>
      <tr>
        <td id="L128" class="blob-num js-line-number" data-line-number="128"></td>
        <td id="LC128" class="blob-code blob-code-inner js-file-line">    private final static byte[] GYR_B = new byte[] {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};</td>
      </tr>
      <tr>
        <td id="L129" class="blob-num js-line-number" data-line-number="129"></td>
        <td id="LC129" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">final</span> <span class="pl-k">static</span> <span class="pl-smi">LUT</span> <span class="pl-c1">GYR_LUT</span> <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">LUT</span>(<span class="pl-c1">GYR_R</span>, <span class="pl-c1">GYR_G</span>, <span class="pl-c1">GYR_B</span>);</td>
      </tr>
      <tr>
        <td id="L130" class="blob-num js-line-number" data-line-number="130"></td>
        <td id="LC130" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L131" class="blob-num js-line-number" data-line-number="131"></td>
        <td id="LC131" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>Variables for max Hough score search</span></td>
      </tr>
      <tr>
        <td id="L132" class="blob-num js-line-number" data-line-number="132"></td>
        <td id="LC132" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> maxHoughArray[][]; <span class="pl-c"><span class="pl-c">//</span>Matrix to store hough scores, radii, and points from multi-threaded max search</span></td>
      </tr>
      <tr>
        <td id="L133" class="blob-num js-line-number" data-line-number="133"></td>
        <td id="LC133" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> ithread;</td>
      </tr>
      <tr>
        <td id="L134" class="blob-num js-line-number" data-line-number="134"></td>
        <td id="LC134" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>private int totalTime = 0; //Variable to test beenfits of multithreading</span></td>
      </tr>
      <tr>
        <td id="L135" class="blob-num js-line-number" data-line-number="135"></td>
        <td id="LC135" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span> &lt;/editor-fold&gt;</span></td>
      </tr>
      <tr>
        <td id="L136" class="blob-num js-line-number" data-line-number="136"></td>
        <td id="LC136" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L137" class="blob-num js-line-number" data-line-number="137"></td>
        <td id="LC137" class="blob-code blob-code-inner js-file-line">   </td>
      </tr>
      <tr>
        <td id="L138" class="blob-num js-line-number" data-line-number="138"></td>
        <td id="LC138" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>Import values from GUI class before starting the analysis thread</span></td>
      </tr>
      <tr>
        <td id="L139" class="blob-num js-line-number" data-line-number="139"></td>
        <td id="LC139" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">public</span> <span class="pl-k">void</span> <span class="pl-en">setParameters</span>(<span class="pl-k">int</span> <span class="pl-v">radiusMin</span>, <span class="pl-k">int</span> <span class="pl-v">radiusMax</span>, <span class="pl-k">int</span> <span class="pl-v">radiusInc</span>, <span class="pl-k">int</span> <span class="pl-v">minCircles</span>, <span class="pl-k">int</span> <span class="pl-v">maxCircles</span>, <span class="pl-k">double</span> <span class="pl-v">thresholdRatio</span>, <span class="pl-k">int</span> <span class="pl-v">resolution</span>, <span class="pl-k">double</span> <span class="pl-v">ratio</span>, <span class="pl-k">int</span> <span class="pl-v">searchBand</span>, </td>
      </tr>
      <tr>
        <td id="L140" class="blob-num js-line-number" data-line-number="140"></td>
        <td id="LC140" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">int</span> <span class="pl-v">searchRadius</span>, <span class="pl-k">boolean</span> <span class="pl-v">reduce</span>, <span class="pl-k">boolean</span> <span class="pl-v">local</span>, <span class="pl-k">boolean</span> <span class="pl-v">houghSeries</span>, <span class="pl-k">boolean</span> <span class="pl-v">showCircles</span>, <span class="pl-k">boolean</span> <span class="pl-v">showID</span>, <span class="pl-k">boolean</span> <span class="pl-v">showScores</span>, <span class="pl-k">boolean</span> <span class="pl-v">results</span>, <span class="pl-k">boolean</span> <span class="pl-v">isGUI</span>){</td>
      </tr>
      <tr>
        <td id="L141" class="blob-num js-line-number" data-line-number="141"></td>
        <td id="LC141" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L142" class="blob-num js-line-number" data-line-number="142"></td>
        <td id="LC142" class="blob-code blob-code-inner js-file-line">        <span class="pl-c1">this</span><span class="pl-k">.</span>radiusMin <span class="pl-k">=</span> radiusMin;</td>
      </tr>
      <tr>
        <td id="L143" class="blob-num js-line-number" data-line-number="143"></td>
        <td id="LC143" class="blob-code blob-code-inner js-file-line">        <span class="pl-c1">this</span><span class="pl-k">.</span>radiusMax <span class="pl-k">=</span> radiusMax;</td>
      </tr>
      <tr>
        <td id="L144" class="blob-num js-line-number" data-line-number="144"></td>
        <td id="LC144" class="blob-code blob-code-inner js-file-line">        <span class="pl-c1">this</span><span class="pl-k">.</span>radiusInc <span class="pl-k">=</span> radiusInc;</td>
      </tr>
      <tr>
        <td id="L145" class="blob-num js-line-number" data-line-number="145"></td>
        <td id="LC145" class="blob-code blob-code-inner js-file-line">        <span class="pl-c1">this</span><span class="pl-k">.</span>minCircles <span class="pl-k">=</span> minCircles;</td>
      </tr>
      <tr>
        <td id="L146" class="blob-num js-line-number" data-line-number="146"></td>
        <td id="LC146" class="blob-code blob-code-inner js-file-line">        <span class="pl-c1">this</span><span class="pl-k">.</span>maxCircles <span class="pl-k">=</span> maxCircles;</td>
      </tr>
      <tr>
        <td id="L147" class="blob-num js-line-number" data-line-number="147"></td>
        <td id="LC147" class="blob-code blob-code-inner js-file-line">        <span class="pl-c1">this</span><span class="pl-k">.</span>thresholdRatio <span class="pl-k">=</span> thresholdRatio;</td>
      </tr>
      <tr>
        <td id="L148" class="blob-num js-line-number" data-line-number="148"></td>
        <td id="LC148" class="blob-code blob-code-inner js-file-line">        <span class="pl-c1">this</span><span class="pl-k">.</span>resolution <span class="pl-k">=</span> resolution;</td>
      </tr>
      <tr>
        <td id="L149" class="blob-num js-line-number" data-line-number="149"></td>
        <td id="LC149" class="blob-code blob-code-inner js-file-line">        <span class="pl-c1">this</span><span class="pl-k">.</span>ratio <span class="pl-k">=</span> ratio;</td>
      </tr>
      <tr>
        <td id="L150" class="blob-num js-line-number" data-line-number="150"></td>
        <td id="LC150" class="blob-code blob-code-inner js-file-line">        <span class="pl-c1">this</span><span class="pl-k">.</span>searchBand <span class="pl-k">=</span> searchBand;</td>
      </tr>
      <tr>
        <td id="L151" class="blob-num js-line-number" data-line-number="151"></td>
        <td id="LC151" class="blob-code blob-code-inner js-file-line">        <span class="pl-c1">this</span><span class="pl-k">.</span>searchRadius <span class="pl-k">=</span> searchRadius;</td>
      </tr>
      <tr>
        <td id="L152" class="blob-num js-line-number" data-line-number="152"></td>
        <td id="LC152" class="blob-code blob-code-inner js-file-line">        <span class="pl-c1">this</span><span class="pl-k">.</span>reduce <span class="pl-k">=</span> reduce;</td>
      </tr>
      <tr>
        <td id="L153" class="blob-num js-line-number" data-line-number="153"></td>
        <td id="LC153" class="blob-code blob-code-inner js-file-line">        <span class="pl-c1">this</span><span class="pl-k">.</span>local <span class="pl-k">=</span> local;</td>
      </tr>
      <tr>
        <td id="L154" class="blob-num js-line-number" data-line-number="154"></td>
        <td id="LC154" class="blob-code blob-code-inner js-file-line">        <span class="pl-c1">this</span><span class="pl-k">.</span>houghSeries <span class="pl-k">=</span> houghSeries;</td>
      </tr>
      <tr>
        <td id="L155" class="blob-num js-line-number" data-line-number="155"></td>
        <td id="LC155" class="blob-code blob-code-inner js-file-line">        <span class="pl-c1">this</span><span class="pl-k">.</span>showCircles <span class="pl-k">=</span> showCircles;</td>
      </tr>
      <tr>
        <td id="L156" class="blob-num js-line-number" data-line-number="156"></td>
        <td id="LC156" class="blob-code blob-code-inner js-file-line">        <span class="pl-c1">this</span><span class="pl-k">.</span>showID <span class="pl-k">=</span> showID;</td>
      </tr>
      <tr>
        <td id="L157" class="blob-num js-line-number" data-line-number="157"></td>
        <td id="LC157" class="blob-code blob-code-inner js-file-line">        <span class="pl-c1">this</span><span class="pl-k">.</span>showScores <span class="pl-k">=</span> showScores;</td>
      </tr>
      <tr>
        <td id="L158" class="blob-num js-line-number" data-line-number="158"></td>
        <td id="LC158" class="blob-code blob-code-inner js-file-line">        <span class="pl-c1">this</span><span class="pl-k">.</span>results <span class="pl-k">=</span> results;</td>
      </tr>
      <tr>
        <td id="L159" class="blob-num js-line-number" data-line-number="159"></td>
        <td id="LC159" class="blob-code blob-code-inner js-file-line">        <span class="pl-c1">this</span><span class="pl-k">.</span>isGUI <span class="pl-k">=</span> isGUI;</td>
      </tr>
      <tr>
        <td id="L160" class="blob-num js-line-number" data-line-number="160"></td>
        <td id="LC160" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L161" class="blob-num js-line-number" data-line-number="161"></td>
        <td id="LC161" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L162" class="blob-num js-line-number" data-line-number="162"></td>
        <td id="LC162" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">@Override</span></td>
      </tr>
      <tr>
        <td id="L163" class="blob-num js-line-number" data-line-number="163"></td>
        <td id="LC163" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>Start the Hough transform on a separate thread from the GUI</span></td>
      </tr>
      <tr>
        <td id="L164" class="blob-num js-line-number" data-line-number="164"></td>
        <td id="LC164" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">protected</span> <span class="pl-smi">Integer</span> <span class="pl-en">doInBackground</span>() <span class="pl-k">throws</span> <span class="pl-smi">Exception</span>{ </td>
      </tr>
      <tr>
        <td id="L165" class="blob-num js-line-number" data-line-number="165"></td>
        <td id="LC165" class="blob-code blob-code-inner js-file-line">        startTransform();</td>
      </tr>
      <tr>
        <td id="L166" class="blob-num js-line-number" data-line-number="166"></td>
        <td id="LC166" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">return</span> <span class="pl-c1">100</span>; </td>
      </tr>
      <tr>
        <td id="L167" class="blob-num js-line-number" data-line-number="167"></td>
        <td id="LC167" class="blob-code blob-code-inner js-file-line">     }</td>
      </tr>
      <tr>
        <td id="L168" class="blob-num js-line-number" data-line-number="168"></td>
        <td id="LC168" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L169" class="blob-num js-line-number" data-line-number="169"></td>
        <td id="LC169" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">public</span> <span class="pl-k">void</span> <span class="pl-en">startTransform</span>(){</td>
      </tr>
      <tr>
        <td id="L170" class="blob-num js-line-number" data-line-number="170"></td>
        <td id="LC170" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Initialize the results table</span></td>
      </tr>
      <tr>
        <td id="L171" class="blob-num js-line-number" data-line-number="171"></td>
        <td id="LC171" class="blob-code blob-code-inner js-file-line">        rt <span class="pl-k">=</span> <span class="pl-smi">Analyzer</span><span class="pl-k">.</span>getResultsTable();</td>
      </tr>
      <tr>
        <td id="L172" class="blob-num js-line-number" data-line-number="172"></td>
        <td id="LC172" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span> (rt <span class="pl-k">==</span> <span class="pl-c1">null</span>) {</td>
      </tr>
      <tr>
        <td id="L173" class="blob-num js-line-number" data-line-number="173"></td>
        <td id="LC173" class="blob-code blob-code-inner js-file-line">                rt <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">ResultsTable</span>();</td>
      </tr>
      <tr>
        <td id="L174" class="blob-num js-line-number" data-line-number="174"></td>
        <td id="LC174" class="blob-code blob-code-inner js-file-line">                <span class="pl-smi">Analyzer</span><span class="pl-k">.</span>setResultsTable(rt);</td>
      </tr>
      <tr>
        <td id="L175" class="blob-num js-line-number" data-line-number="175"></td>
        <td id="LC175" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L176" class="blob-num js-line-number" data-line-number="176"></td>
        <td id="LC176" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L177" class="blob-num js-line-number" data-line-number="177"></td>
        <td id="LC177" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Initialize variables</span></td>
      </tr>
      <tr>
        <td id="L178" class="blob-num js-line-number" data-line-number="178"></td>
        <td id="LC178" class="blob-code blob-code-inner js-file-line">        nCircles <span class="pl-k">=</span> <span class="pl-c1">0</span>;</td>
      </tr>
      <tr>
        <td id="L179" class="blob-num js-line-number" data-line-number="179"></td>
        <td id="LC179" class="blob-code blob-code-inner js-file-line">        circleIDcounter <span class="pl-k">=</span> <span class="pl-c1">0</span>;</td>
      </tr>
      <tr>
        <td id="L180" class="blob-num js-line-number" data-line-number="180"></td>
        <td id="LC180" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L181" class="blob-num js-line-number" data-line-number="181"></td>
        <td id="LC181" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Calculate Hough parameters</span></td>
      </tr>
      <tr>
        <td id="L182" class="blob-num js-line-number" data-line-number="182"></td>
        <td id="LC182" class="blob-code blob-code-inner js-file-line">        depth <span class="pl-k">=</span> ((radiusMax<span class="pl-k">-</span>radiusMin)<span class="pl-k">/</span>radiusInc)<span class="pl-k">+</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L183" class="blob-num js-line-number" data-line-number="183"></td>
        <td id="LC183" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L184" class="blob-num js-line-number" data-line-number="184"></td>
        <td id="LC184" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>If radiusInc is not a divisor of radiusMax-radiusMin, return error</span></td>
      </tr>
      <tr>
        <td id="L185" class="blob-num js-line-number" data-line-number="185"></td>
        <td id="LC185" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>((radiusMax<span class="pl-k">-</span>radiusMin)<span class="pl-k">%</span>radiusInc <span class="pl-k">!=</span> <span class="pl-c1">0</span>){</td>
      </tr>
      <tr>
        <td id="L186" class="blob-num js-line-number" data-line-number="186"></td>
        <td id="LC186" class="blob-code blob-code-inner js-file-line">            <span class="pl-c1">IJ</span><span class="pl-k">.</span>showMessage(<span class="pl-s"><span class="pl-pds">&quot;</span>Error: Radius increment must be a divisor of maximum radius - minimum radius.<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L187" class="blob-num js-line-number" data-line-number="187"></td>
        <td id="LC187" class="blob-code blob-code-inner js-file-line">            <span class="pl-c1">IJ</span><span class="pl-k">.</span>showMessage(<span class="pl-s"><span class="pl-pds">&quot;</span>radiusMin=<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> radiusMin <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span>, radiusMax=<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> radiusMax <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span>, radiusInc=<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> radiusInc);</td>
      </tr>
      <tr>
        <td id="L188" class="blob-num js-line-number" data-line-number="188"></td>
        <td id="LC188" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">return</span>;          </td>
      </tr>
      <tr>
        <td id="L189" class="blob-num js-line-number" data-line-number="189"></td>
        <td id="LC189" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L190" class="blob-num js-line-number" data-line-number="190"></td>
        <td id="LC190" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L191" class="blob-num js-line-number" data-line-number="191"></td>
        <td id="LC191" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Build the transform LUT (all necessary translations in Cartesian coordinates)</span></td>
      </tr>
      <tr>
        <td id="L192" class="blob-num js-line-number" data-line-number="192"></td>
        <td id="LC192" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>NOTE: This step must precede the calculatation of the threshold, as it can change the resolution from the original input value </span></td>
      </tr>
      <tr>
        <td id="L193" class="blob-num js-line-number" data-line-number="193"></td>
        <td id="LC193" class="blob-code blob-code-inner js-file-line">        lutSize <span class="pl-k">=</span> buildLookUpTable();</td>
      </tr>
      <tr>
        <td id="L194" class="blob-num js-line-number" data-line-number="194"></td>
        <td id="LC194" class="blob-code blob-code-inner js-file-line">          </td>
      </tr>
      <tr>
        <td id="L195" class="blob-num js-line-number" data-line-number="195"></td>
        <td id="LC195" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Calculate the threshold based off the the actual resolution</span></td>
      </tr>
      <tr>
        <td id="L196" class="blob-num js-line-number" data-line-number="196"></td>
        <td id="LC196" class="blob-code blob-code-inner js-file-line">        threshold <span class="pl-k">=</span> (<span class="pl-k">int</span>) <span class="pl-smi">Math</span><span class="pl-k">.</span>round(thresholdRatio <span class="pl-k">*</span> resolution);</td>
      </tr>
      <tr>
        <td id="L197" class="blob-num js-line-number" data-line-number="197"></td>
        <td id="LC197" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L198" class="blob-num js-line-number" data-line-number="198"></td>
        <td id="LC198" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>If the threshold rounds to 0, set threshold to 1 as 0 is nonsensical</span></td>
      </tr>
      <tr>
        <td id="L199" class="blob-num js-line-number" data-line-number="199"></td>
        <td id="LC199" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(threshold <span class="pl-k">&lt;=</span> <span class="pl-c1">0</span>) {</td>
      </tr>
      <tr>
        <td id="L200" class="blob-num js-line-number" data-line-number="200"></td>
        <td id="LC200" class="blob-code blob-code-inner js-file-line">            threshold <span class="pl-k">=</span> <span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L201" class="blob-num js-line-number" data-line-number="201"></td>
        <td id="LC201" class="blob-code blob-code-inner js-file-line">        }        </td>
      </tr>
      <tr>
        <td id="L202" class="blob-num js-line-number" data-line-number="202"></td>
        <td id="LC202" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span> &lt;editor-fold desc=&quot;Send arguments to record&quot;&gt;</span></td>
      </tr>
      <tr>
        <td id="L203" class="blob-num js-line-number" data-line-number="203"></td>
        <td id="LC203" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>If the macro was being recorded, return the set values to the recorder</span></td>
      </tr>
      <tr>
        <td id="L204" class="blob-num js-line-number" data-line-number="204"></td>
        <td id="LC204" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span> (<span class="pl-smi">Recorder</span><span class="pl-k">.</span>record){</td>
      </tr>
      <tr>
        <td id="L205" class="blob-num js-line-number" data-line-number="205"></td>
        <td id="LC205" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">String</span> <span class="pl-smi">Command</span>  <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>run(<span class="pl-cce">\&quot;</span>Hough Circle Transform<span class="pl-cce">\&quot;</span>,<span class="pl-cce">\&quot;</span>minRadius=<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> radiusMin <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span>, maxRadius=<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> radiusMax <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span>, inc=<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> radiusInc <span class="pl-k">+</span> </td>
      </tr>
      <tr>
        <td id="L206" class="blob-num js-line-number" data-line-number="206"></td>
        <td id="LC206" class="blob-code blob-code-inner js-file-line">                    <span class="pl-s"><span class="pl-pds">&quot;</span>, minCircles=<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> minCircles <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span>, maxCircles=<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> maxCircles <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span>, threshold=<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> thresholdRatio <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span>, resolution=<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> resolution <span class="pl-k">+</span></td>
      </tr>
      <tr>
        <td id="L207" class="blob-num js-line-number" data-line-number="207"></td>
        <td id="LC207" class="blob-code blob-code-inner js-file-line">                     <span class="pl-s"><span class="pl-pds">&quot;</span>, ratio=<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> ratio <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span>, bandwidth=<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> searchBand <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span>, local_radius=<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> searchRadius <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span>, <span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L208" class="blob-num js-line-number" data-line-number="208"></td>
        <td id="LC208" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(reduce) <span class="pl-smi">Command</span> <span class="pl-k">+=</span> <span class="pl-s"><span class="pl-pds">&quot;</span> reduce<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L209" class="blob-num js-line-number" data-line-number="209"></td>
        <td id="LC209" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(local) <span class="pl-smi">Command</span> <span class="pl-k">+=</span> <span class="pl-s"><span class="pl-pds">&quot;</span> local_search<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L210" class="blob-num js-line-number" data-line-number="210"></td>
        <td id="LC210" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(houghSeries) <span class="pl-smi">Command</span> <span class="pl-k">+=</span> <span class="pl-s"><span class="pl-pds">&quot;</span> show_raw<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L211" class="blob-num js-line-number" data-line-number="211"></td>
        <td id="LC211" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(showCircles) <span class="pl-smi">Command</span> <span class="pl-k">+=</span> <span class="pl-s"><span class="pl-pds">&quot;</span> show_mask<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L212" class="blob-num js-line-number" data-line-number="212"></td>
        <td id="LC212" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(showID) <span class="pl-smi">Command</span> <span class="pl-k">+=</span> <span class="pl-s"><span class="pl-pds">&quot;</span> show_centroids<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L213" class="blob-num js-line-number" data-line-number="213"></td>
        <td id="LC213" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(showScores) <span class="pl-smi">Command</span> <span class="pl-k">+=</span> <span class="pl-s"><span class="pl-pds">&quot;</span> show_scores<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L214" class="blob-num js-line-number" data-line-number="214"></td>
        <td id="LC214" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(results) <span class="pl-smi">Command</span> <span class="pl-k">+=</span> <span class="pl-s"><span class="pl-pds">&quot;</span> results_table<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L215" class="blob-num js-line-number" data-line-number="215"></td>
        <td id="LC215" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">Command</span> <span class="pl-k">+=</span> <span class="pl-s"><span class="pl-pds">&quot;</span><span class="pl-cce">\&quot;</span>);<span class="pl-cce">\r\n</span><span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L216" class="blob-num js-line-number" data-line-number="216"></td>
        <td id="LC216" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">Recorder</span><span class="pl-k">.</span>recordString(<span class="pl-smi">Command</span>);</td>
      </tr>
      <tr>
        <td id="L217" class="blob-num js-line-number" data-line-number="217"></td>
        <td id="LC217" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L218" class="blob-num js-line-number" data-line-number="218"></td>
        <td id="LC218" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span> &lt;/editor-fold&gt;</span></td>
      </tr>
      <tr>
        <td id="L219" class="blob-num js-line-number" data-line-number="219"></td>
        <td id="LC219" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L220" class="blob-num js-line-number" data-line-number="220"></td>
        <td id="LC220" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Create an ImagePlus instance of the currently active image</span></td>
      </tr>
      <tr>
        <td id="L221" class="blob-num js-line-number" data-line-number="221"></td>
        <td id="LC221" class="blob-code blob-code-inner js-file-line">        imp <span class="pl-k">=</span> <span class="pl-smi">WindowManager</span><span class="pl-k">.</span>getCurrentImage();</td>
      </tr>
      <tr>
        <td id="L222" class="blob-num js-line-number" data-line-number="222"></td>
        <td id="LC222" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L223" class="blob-num js-line-number" data-line-number="223"></td>
        <td id="LC223" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Import the ImagePlus as a stack</span></td>
      </tr>
      <tr>
        <td id="L224" class="blob-num js-line-number" data-line-number="224"></td>
        <td id="LC224" class="blob-code blob-code-inner js-file-line">        <span class="pl-smi">ImageStack</span> stack <span class="pl-k">=</span> imp<span class="pl-k">.</span>getStack();</td>
      </tr>
      <tr>
        <td id="L225" class="blob-num js-line-number" data-line-number="225"></td>
        <td id="LC225" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L226" class="blob-num js-line-number" data-line-number="226"></td>
        <td id="LC226" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Get pixel dimensions and units</span></td>
      </tr>
      <tr>
        <td id="L227" class="blob-num js-line-number" data-line-number="227"></td>
        <td id="LC227" class="blob-code blob-code-inner js-file-line">        pixelCal <span class="pl-k">=</span> imp<span class="pl-k">.</span>getCalibration();</td>
      </tr>
      <tr>
        <td id="L228" class="blob-num js-line-number" data-line-number="228"></td>
        <td id="LC228" class="blob-code blob-code-inner js-file-line">        pixelUnits <span class="pl-k">=</span> pixelCal<span class="pl-k">.</span>getUnits();</td>
      </tr>
      <tr>
        <td id="L229" class="blob-num js-line-number" data-line-number="229"></td>
        <td id="LC229" class="blob-code blob-code-inner js-file-line">        pixelDimensions <span class="pl-k">=</span> pixelCal<span class="pl-k">.</span>pixelWidth;</td>
      </tr>
      <tr>
        <td id="L230" class="blob-num js-line-number" data-line-number="230"></td>
        <td id="LC230" class="blob-code blob-code-inner js-file-line">        imageDimensions <span class="pl-k">=</span> imp<span class="pl-k">.</span>getDimensions(); <span class="pl-c"><span class="pl-c">//</span>(width, height, nChannels, nSlices, nFrames)</span></td>
      </tr>
      <tr>
        <td id="L231" class="blob-num js-line-number" data-line-number="231"></td>
        <td id="LC231" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L232" class="blob-num js-line-number" data-line-number="232"></td>
        <td id="LC232" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>If the stack has frames, get the time units and step size</span></td>
      </tr>
      <tr>
        <td id="L233" class="blob-num js-line-number" data-line-number="233"></td>
        <td id="LC233" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(imageDimensions[<span class="pl-c1">2</span>] <span class="pl-k">==</span> <span class="pl-c1">1</span> <span class="pl-k">&amp;</span> imageDimensions[<span class="pl-c1">3</span>] <span class="pl-k">==</span> <span class="pl-c1">1</span> <span class="pl-k">&amp;</span> imageDimensions[<span class="pl-c1">4</span>] <span class="pl-k">&gt;</span> <span class="pl-c1">1</span>){</td>
      </tr>
      <tr>
        <td id="L234" class="blob-num js-line-number" data-line-number="234"></td>
        <td id="LC234" class="blob-code blob-code-inner js-file-line">            timeUnits <span class="pl-k">=</span> pixelCal<span class="pl-k">.</span>getTimeUnit();</td>
      </tr>
      <tr>
        <td id="L235" class="blob-num js-line-number" data-line-number="235"></td>
        <td id="LC235" class="blob-code blob-code-inner js-file-line">            timeDimension <span class="pl-k">=</span> pixelCal<span class="pl-k">.</span>frameInterval;</td>
      </tr>
      <tr>
        <td id="L236" class="blob-num js-line-number" data-line-number="236"></td>
        <td id="LC236" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L237" class="blob-num js-line-number" data-line-number="237"></td>
        <td id="LC237" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>If the time dimension is zero, then use slice # instead</span></td>
      </tr>
      <tr>
        <td id="L238" class="blob-num js-line-number" data-line-number="238"></td>
        <td id="LC238" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(timeDimension <span class="pl-k">==</span> <span class="pl-c1">0</span>){</td>
      </tr>
      <tr>
        <td id="L239" class="blob-num js-line-number" data-line-number="239"></td>
        <td id="LC239" class="blob-code blob-code-inner js-file-line">                timeUnits <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>slice #<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L240" class="blob-num js-line-number" data-line-number="240"></td>
        <td id="LC240" class="blob-code blob-code-inner js-file-line">                timeDimension <span class="pl-k">=</span> <span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L241" class="blob-num js-line-number" data-line-number="241"></td>
        <td id="LC241" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L242" class="blob-num js-line-number" data-line-number="242"></td>
        <td id="LC242" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L243" class="blob-num js-line-number" data-line-number="243"></td>
        <td id="LC243" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Put frames into slice dimension to keep things constant</span></td>
      </tr>
      <tr>
        <td id="L244" class="blob-num js-line-number" data-line-number="244"></td>
        <td id="LC244" class="blob-code blob-code-inner js-file-line">            imp<span class="pl-k">.</span>setDimensions(<span class="pl-c1">1</span>, imageDimensions[<span class="pl-c1">4</span>], <span class="pl-c1">1</span>);</td>
      </tr>
      <tr>
        <td id="L245" class="blob-num js-line-number" data-line-number="245"></td>
        <td id="LC245" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L246" class="blob-num js-line-number" data-line-number="246"></td>
        <td id="LC246" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L247" class="blob-num js-line-number" data-line-number="247"></td>
        <td id="LC247" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>If the stack has Z-steps then use slice # as units </span></td>
      </tr>
      <tr>
        <td id="L248" class="blob-num js-line-number" data-line-number="248"></td>
        <td id="LC248" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">else</span> <span class="pl-k">if</span>(imageDimensions[<span class="pl-c1">2</span>] <span class="pl-k">==</span> <span class="pl-c1">1</span> <span class="pl-k">&amp;</span> imageDimensions[<span class="pl-c1">3</span>] <span class="pl-k">&gt;=</span> <span class="pl-c1">1</span> <span class="pl-k">&amp;</span> imageDimensions[<span class="pl-c1">4</span>] <span class="pl-k">==</span> <span class="pl-c1">1</span>){</td>
      </tr>
      <tr>
        <td id="L249" class="blob-num js-line-number" data-line-number="249"></td>
        <td id="LC249" class="blob-code blob-code-inner js-file-line">            timeUnits <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>slice #<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L250" class="blob-num js-line-number" data-line-number="250"></td>
        <td id="LC250" class="blob-code blob-code-inner js-file-line">            timeDimension <span class="pl-k">=</span> <span class="pl-c1">1</span>;  </td>
      </tr>
      <tr>
        <td id="L251" class="blob-num js-line-number" data-line-number="251"></td>
        <td id="LC251" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L252" class="blob-num js-line-number" data-line-number="252"></td>
        <td id="LC252" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L253" class="blob-num js-line-number" data-line-number="253"></td>
        <td id="LC253" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>If the stack is a hyper-stack, then abort analysis</span></td>
      </tr>
      <tr>
        <td id="L254" class="blob-num js-line-number" data-line-number="254"></td>
        <td id="LC254" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">else</span>{</td>
      </tr>
      <tr>
        <td id="L255" class="blob-num js-line-number" data-line-number="255"></td>
        <td id="LC255" class="blob-code blob-code-inner js-file-line">            <span class="pl-c1">IJ</span><span class="pl-k">.</span>showMessage(<span class="pl-s"><span class="pl-pds">&quot;</span>Error: This stack is a hyperstack.  Please convert to stack before processing.<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L256" class="blob-num js-line-number" data-line-number="256"></td>
        <td id="LC256" class="blob-code blob-code-inner js-file-line">            <span class="pl-c1">IJ</span><span class="pl-k">.</span>showMessage(<span class="pl-s"><span class="pl-pds">&quot;</span>nChannels=<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> imageDimensions[<span class="pl-c1">2</span>] <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span>, nSlices=<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> imageDimensions[<span class="pl-c1">3</span>] <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span>, nFrames=<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> imageDimensions[<span class="pl-c1">4</span>]);</td>
      </tr>
      <tr>
        <td id="L257" class="blob-num js-line-number" data-line-number="257"></td>
        <td id="LC257" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">return</span>;</td>
      </tr>
      <tr>
        <td id="L258" class="blob-num js-line-number" data-line-number="258"></td>
        <td id="LC258" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L259" class="blob-num js-line-number" data-line-number="259"></td>
        <td id="LC259" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L260" class="blob-num js-line-number" data-line-number="260"></td>
        <td id="LC260" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Get the ROI dimensions - no ROI = full image</span></td>
      </tr>
      <tr>
        <td id="L261" class="blob-num js-line-number" data-line-number="261"></td>
        <td id="LC261" class="blob-code blob-code-inner js-file-line">        r <span class="pl-k">=</span> stack<span class="pl-k">.</span>getRoi();</td>
      </tr>
      <tr>
        <td id="L262" class="blob-num js-line-number" data-line-number="262"></td>
        <td id="LC262" class="blob-code blob-code-inner js-file-line">        offx <span class="pl-k">=</span> r<span class="pl-k">.</span>x;</td>
      </tr>
      <tr>
        <td id="L263" class="blob-num js-line-number" data-line-number="263"></td>
        <td id="LC263" class="blob-code blob-code-inner js-file-line">        offy <span class="pl-k">=</span> r<span class="pl-k">.</span>y;</td>
      </tr>
      <tr>
        <td id="L264" class="blob-num js-line-number" data-line-number="264"></td>
        <td id="LC264" class="blob-code blob-code-inner js-file-line">        width <span class="pl-k">=</span> r<span class="pl-k">.</span>width;</td>
      </tr>
      <tr>
        <td id="L265" class="blob-num js-line-number" data-line-number="265"></td>
        <td id="LC265" class="blob-code blob-code-inner js-file-line">        height <span class="pl-k">=</span> r<span class="pl-k">.</span>height;</td>
      </tr>
      <tr>
        <td id="L266" class="blob-num js-line-number" data-line-number="266"></td>
        <td id="LC266" class="blob-code blob-code-inner js-file-line">        fullWidth <span class="pl-k">=</span> stack<span class="pl-k">.</span>getWidth();</td>
      </tr>
      <tr>
        <td id="L267" class="blob-num js-line-number" data-line-number="267"></td>
        <td id="LC267" class="blob-code blob-code-inner js-file-line">        fullHeight <span class="pl-k">=</span> stack<span class="pl-k">.</span>getHeight();      </td>
      </tr>
      <tr>
        <td id="L268" class="blob-num js-line-number" data-line-number="268"></td>
        <td id="LC268" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L269" class="blob-num js-line-number" data-line-number="269"></td>
        <td id="LC269" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Convert the stack to float (allows 8, 16, and 32 stacks to all be processed as one type)</span></td>
      </tr>
      <tr>
        <td id="L270" class="blob-num js-line-number" data-line-number="270"></td>
        <td id="LC270" class="blob-code blob-code-inner js-file-line">        <span class="pl-smi">ImageStack</span> stackCopy <span class="pl-k">=</span> stack<span class="pl-k">.</span>duplicate();</td>
      </tr>
      <tr>
        <td id="L271" class="blob-num js-line-number" data-line-number="271"></td>
        <td id="LC271" class="blob-code blob-code-inner js-file-line">        <span class="pl-smi">ImageStack</span> floatStack <span class="pl-k">=</span> stackCopy<span class="pl-k">.</span>convertToFloat();</td>
      </tr>
      <tr>
        <td id="L272" class="blob-num js-line-number" data-line-number="272"></td>
        <td id="LC272" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L273" class="blob-num js-line-number" data-line-number="273"></td>
        <td id="LC273" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(houghSeries){</td>
      </tr>
      <tr>
        <td id="L274" class="blob-num js-line-number" data-line-number="274"></td>
        <td id="LC274" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Frames is transform dimension</span></td>
      </tr>
      <tr>
        <td id="L275" class="blob-num js-line-number" data-line-number="275"></td>
        <td id="LC275" class="blob-code blob-code-inner js-file-line">            houghStack <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">ImageStack</span>(width, height, depth<span class="pl-k">*</span>imp<span class="pl-k">.</span>getNSlices());</td>
      </tr>
      <tr>
        <td id="L276" class="blob-num js-line-number" data-line-number="276"></td>
        <td id="LC276" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L277" class="blob-num js-line-number" data-line-number="277"></td>
        <td id="LC277" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(showCircles){</td>
      </tr>
      <tr>
        <td id="L278" class="blob-num js-line-number" data-line-number="278"></td>
        <td id="LC278" class="blob-code blob-code-inner js-file-line">            circleStack <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">ImageStack</span>(width, height, imp<span class="pl-k">.</span>getNSlices());</td>
      </tr>
      <tr>
        <td id="L279" class="blob-num js-line-number" data-line-number="279"></td>
        <td id="LC279" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L280" class="blob-num js-line-number" data-line-number="280"></td>
        <td id="LC280" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(showID){</td>
      </tr>
      <tr>
        <td id="L281" class="blob-num js-line-number" data-line-number="281"></td>
        <td id="LC281" class="blob-code blob-code-inner js-file-line">            idStack <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">ImageStack</span>(width, height, imp<span class="pl-k">.</span>getNSlices());</td>
      </tr>
      <tr>
        <td id="L282" class="blob-num js-line-number" data-line-number="282"></td>
        <td id="LC282" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L283" class="blob-num js-line-number" data-line-number="283"></td>
        <td id="LC283" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(showScores){</td>
      </tr>
      <tr>
        <td id="L284" class="blob-num js-line-number" data-line-number="284"></td>
        <td id="LC284" class="blob-code blob-code-inner js-file-line">            scoreStack <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">ImageStack</span>(width, height, imp<span class="pl-k">.</span>getNSlices());</td>
      </tr>
      <tr>
        <td id="L285" class="blob-num js-line-number" data-line-number="285"></td>
        <td id="LC285" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L286" class="blob-num js-line-number" data-line-number="286"></td>
        <td id="LC286" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L287" class="blob-num js-line-number" data-line-number="287"></td>
        <td id="LC287" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>See if input is stack</span></td>
      </tr>
      <tr>
        <td id="L288" class="blob-num js-line-number" data-line-number="288"></td>
        <td id="LC288" class="blob-code blob-code-inner js-file-line">        stackSlices <span class="pl-k">=</span> imp<span class="pl-k">.</span>getStackSize();</td>
      </tr>
      <tr>
        <td id="L289" class="blob-num js-line-number" data-line-number="289"></td>
        <td id="LC289" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(stackSlices <span class="pl-k">&gt;</span> <span class="pl-c1">1</span>) isStack <span class="pl-k">=</span> <span class="pl-c1">true</span>;</td>
      </tr>
      <tr>
        <td id="L290" class="blob-num js-line-number" data-line-number="290"></td>
        <td id="LC290" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L291" class="blob-num js-line-number" data-line-number="291"></td>
        <td id="LC291" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Build arrays for storing the circle result parameters</span></td>
      </tr>
      <tr>
        <td id="L292" class="blob-num js-line-number" data-line-number="292"></td>
        <td id="LC292" class="blob-code blob-code-inner js-file-line">        houghScores <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">int</span> [maxCircles];</td>
      </tr>
      <tr>
        <td id="L293" class="blob-num js-line-number" data-line-number="293"></td>
        <td id="LC293" class="blob-code blob-code-inner js-file-line">        centerRadii <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">int</span> [maxCircles];</td>
      </tr>
      <tr>
        <td id="L294" class="blob-num js-line-number" data-line-number="294"></td>
        <td id="LC294" class="blob-code blob-code-inner js-file-line">        centerPoint <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Point</span>[maxCircles];</td>
      </tr>
      <tr>
        <td id="L295" class="blob-num js-line-number" data-line-number="295"></td>
        <td id="LC295" class="blob-code blob-code-inner js-file-line">        circleID <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">int</span> [maxCircles];</td>
      </tr>
      <tr>
        <td id="L296" class="blob-num js-line-number" data-line-number="296"></td>
        <td id="LC296" class="blob-code blob-code-inner js-file-line">        <span class="pl-smi">Arrays</span><span class="pl-k">.</span>fill(circleID, <span class="pl-k">-</span><span class="pl-c1">1</span>); <span class="pl-c"><span class="pl-c">//</span>Flag indeces as -1 = no circle found for this index</span></td>
      </tr>
      <tr>
        <td id="L297" class="blob-num js-line-number" data-line-number="297"></td>
        <td id="LC297" class="blob-code blob-code-inner js-file-line">        <span class="pl-smi">Arrays</span><span class="pl-k">.</span>fill(centerRadii, <span class="pl-k">-</span><span class="pl-c1">1</span>);</td>
      </tr>
      <tr>
        <td id="L298" class="blob-num js-line-number" data-line-number="298"></td>
        <td id="LC298" class="blob-code blob-code-inner js-file-line">        <span class="pl-smi">Arrays</span><span class="pl-k">.</span>fill(centerPoint, <span class="pl-k">new</span> <span class="pl-smi">Point</span>(<span class="pl-k">-</span><span class="pl-c1">1</span>,<span class="pl-k">-</span><span class="pl-c1">1</span>));</td>
      </tr>
      <tr>
        <td id="L299" class="blob-num js-line-number" data-line-number="299"></td>
        <td id="LC299" class="blob-code blob-code-inner js-file-line">        <span class="pl-smi">Arrays</span><span class="pl-k">.</span>fill(houghScores, <span class="pl-k">-</span><span class="pl-c1">1</span>);</td>
      </tr>
      <tr>
        <td id="L300" class="blob-num js-line-number" data-line-number="300"></td>
        <td id="LC300" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L301" class="blob-num js-line-number" data-line-number="301"></td>
        <td id="LC301" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Start timer to delay log outputs</span></td>
      </tr>
      <tr>
        <td id="L302" class="blob-num js-line-number" data-line-number="302"></td>
        <td id="LC302" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">long</span> startTime <span class="pl-k">=</span> <span class="pl-smi">System</span><span class="pl-k">.</span>currentTimeMillis();</td>
      </tr>
      <tr>
        <td id="L303" class="blob-num js-line-number" data-line-number="303"></td>
        <td id="LC303" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L304" class="blob-num js-line-number" data-line-number="304"></td>
        <td id="LC304" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Retrieve the current slice in the stack as an ImageProcessor</span></td>
      </tr>
      <tr>
        <td id="L305" class="blob-num js-line-number" data-line-number="305"></td>
        <td id="LC305" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">for</span>(<span class="pl-k">int</span> slice <span class="pl-k">=</span> <span class="pl-c1">1</span>; slice <span class="pl-k">&lt;=</span> stackSlices; slice<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L306" class="blob-num js-line-number" data-line-number="306"></td>
        <td id="LC306" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Store and then reset nCircles</span></td>
      </tr>
      <tr>
        <td id="L307" class="blob-num js-line-number" data-line-number="307"></td>
        <td id="LC307" class="blob-code blob-code-inner js-file-line">            nCirlcesPrev <span class="pl-k">=</span> nCircles;</td>
      </tr>
      <tr>
        <td id="L308" class="blob-num js-line-number" data-line-number="308"></td>
        <td id="LC308" class="blob-code blob-code-inner js-file-line">            nCircles <span class="pl-k">=</span> <span class="pl-c1">0</span>;</td>
      </tr>
      <tr>
        <td id="L309" class="blob-num js-line-number" data-line-number="309"></td>
        <td id="LC309" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L310" class="blob-num js-line-number" data-line-number="310"></td>
        <td id="LC310" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Set houghMaximum to -1 so that it can be determined whether the maximum has already been found</span></td>
      </tr>
      <tr>
        <td id="L311" class="blob-num js-line-number" data-line-number="311"></td>
        <td id="LC311" class="blob-code blob-code-inner js-file-line">            maxHough <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L312" class="blob-num js-line-number" data-line-number="312"></td>
        <td id="LC312" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L313" class="blob-num js-line-number" data-line-number="313"></td>
        <td id="LC313" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Initialize local search to false to record whether a local search was performed</span></td>
      </tr>
      <tr>
        <td id="L314" class="blob-num js-line-number" data-line-number="314"></td>
        <td id="LC314" class="blob-code blob-code-inner js-file-line">            localSearch <span class="pl-k">=</span> <span class="pl-c1">false</span>;</td>
      </tr>
      <tr>
        <td id="L315" class="blob-num js-line-number" data-line-number="315"></td>
        <td id="LC315" class="blob-code blob-code-inner js-file-line">         </td>
      </tr>
      <tr>
        <td id="L316" class="blob-num js-line-number" data-line-number="316"></td>
        <td id="LC316" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Show tranform status if there is more than one slice</span></td>
      </tr>
      <tr>
        <td id="L317" class="blob-num js-line-number" data-line-number="317"></td>
        <td id="LC317" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(isStack){</td>
      </tr>
      <tr>
        <td id="L318" class="blob-num js-line-number" data-line-number="318"></td>
        <td id="LC318" class="blob-code blob-code-inner js-file-line">               <span class="pl-k">if</span>((<span class="pl-smi">System</span><span class="pl-k">.</span>currentTimeMillis() <span class="pl-k">-</span> startTime) <span class="pl-k">&gt;</span> <span class="pl-c1">GUI_UPDATE_DELAY</span>){</td>
      </tr>
      <tr>
        <td id="L319" class="blob-num js-line-number" data-line-number="319"></td>
        <td id="LC319" class="blob-code blob-code-inner js-file-line">                   <span class="pl-k">if</span>(isGUI){</td>
      </tr>
      <tr>
        <td id="L320" class="blob-num js-line-number" data-line-number="320"></td>
        <td id="LC320" class="blob-code blob-code-inner js-file-line">                       <span class="pl-c"><span class="pl-c">//</span>Update GUI progress bar</span></td>
      </tr>
      <tr>
        <td id="L321" class="blob-num js-line-number" data-line-number="321"></td>
        <td id="LC321" class="blob-code blob-code-inner js-file-line">                       publish(<span class="pl-s"><span class="pl-pds">&quot;</span>Processing frame: <span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> slice <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span> of <span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> stackSlices <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span><span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L322" class="blob-num js-line-number" data-line-number="322"></td>
        <td id="LC322" class="blob-code blob-code-inner js-file-line">                       setProgress(<span class="pl-smi">Math</span><span class="pl-k">.</span>round(<span class="pl-c1">100</span><span class="pl-k">*</span>slice<span class="pl-k">/</span>stackSlices));</td>
      </tr>
      <tr>
        <td id="L323" class="blob-num js-line-number" data-line-number="323"></td>
        <td id="LC323" class="blob-code blob-code-inner js-file-line">                   }</td>
      </tr>
      <tr>
        <td id="L324" class="blob-num js-line-number" data-line-number="324"></td>
        <td id="LC324" class="blob-code blob-code-inner js-file-line">                   </td>
      </tr>
      <tr>
        <td id="L325" class="blob-num js-line-number" data-line-number="325"></td>
        <td id="LC325" class="blob-code blob-code-inner js-file-line">                   <span class="pl-c"><span class="pl-c">//</span>Update IJ status bar</span></td>
      </tr>
      <tr>
        <td id="L326" class="blob-num js-line-number" data-line-number="326"></td>
        <td id="LC326" class="blob-code blob-code-inner js-file-line">                   <span class="pl-c1">IJ</span><span class="pl-k">.</span>showStatus(<span class="pl-s"><span class="pl-pds">&quot;</span>Hough tranform - processing frame: <span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> slice <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span> of <span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> stackSlices <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span><span class="pl-pds">&quot;</span></span>); </td>
      </tr>
      <tr>
        <td id="L327" class="blob-num js-line-number" data-line-number="327"></td>
        <td id="LC327" class="blob-code blob-code-inner js-file-line">                   <span class="pl-c1">IJ</span><span class="pl-k">.</span>showProgress(slice, stackSlices);</td>
      </tr>
      <tr>
        <td id="L328" class="blob-num js-line-number" data-line-number="328"></td>
        <td id="LC328" class="blob-code blob-code-inner js-file-line">  </td>
      </tr>
      <tr>
        <td id="L329" class="blob-num js-line-number" data-line-number="329"></td>
        <td id="LC329" class="blob-code blob-code-inner js-file-line">                   <span class="pl-c"><span class="pl-c">//</span>Reset timer</span></td>
      </tr>
      <tr>
        <td id="L330" class="blob-num js-line-number" data-line-number="330"></td>
        <td id="LC330" class="blob-code blob-code-inner js-file-line">                   startTime <span class="pl-k">=</span> <span class="pl-smi">System</span><span class="pl-k">.</span>currentTimeMillis();</td>
      </tr>
      <tr>
        <td id="L331" class="blob-num js-line-number" data-line-number="331"></td>
        <td id="LC331" class="blob-code blob-code-inner js-file-line">               }</td>
      </tr>
      <tr>
        <td id="L332" class="blob-num js-line-number" data-line-number="332"></td>
        <td id="LC332" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L333" class="blob-num js-line-number" data-line-number="333"></td>
        <td id="LC333" class="blob-code blob-code-inner js-file-line"> </td>
      </tr>
      <tr>
        <td id="L334" class="blob-num js-line-number" data-line-number="334"></td>
        <td id="LC334" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">ImageProcessor</span> ip <span class="pl-k">=</span> floatStack<span class="pl-k">.</span>getProcessor(slice);</td>
      </tr>
      <tr>
        <td id="L335" class="blob-num js-line-number" data-line-number="335"></td>
        <td id="LC335" class="blob-code blob-code-inner js-file-line">            imageValues <span class="pl-k">=</span> (<span class="pl-k">float</span>[]) ip<span class="pl-k">.</span>getPixels();</td>
      </tr>
      <tr>
        <td id="L336" class="blob-num js-line-number" data-line-number="336"></td>
        <td id="LC336" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L337" class="blob-num js-line-number" data-line-number="337"></td>
        <td id="LC337" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span> &lt;editor-fold desc=&quot;Local search&quot;&gt;</span></td>
      </tr>
      <tr>
        <td id="L338" class="blob-num js-line-number" data-line-number="338"></td>
        <td id="LC338" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>If the number of circles is greater than min circles - speed up the search by looking locally for each next circle</span></td>
      </tr>
      <tr>
        <td id="L339" class="blob-num js-line-number" data-line-number="339"></td>
        <td id="LC339" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Multithread by giving each core a subset of the total number of circles</span></td>
      </tr>
      <tr>
        <td id="L340" class="blob-num js-line-number" data-line-number="340"></td>
        <td id="LC340" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(local <span class="pl-k">&amp;</span> slice <span class="pl-k">&gt;</span> <span class="pl-c1">1</span>){</td>
      </tr>
      <tr>
        <td id="L341" class="blob-num js-line-number" data-line-number="341"></td>
        <td id="LC341" class="blob-code blob-code-inner js-file-line">                <span class="pl-c"><span class="pl-c">//</span>If there are still a sufficient number of circles, perform an exclusively local search</span></td>
      </tr>
      <tr>
        <td id="L342" class="blob-num js-line-number" data-line-number="342"></td>
        <td id="LC342" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">if</span>(nCirlcesPrev<span class="pl-k">&gt;=</span>minCircles){</td>
      </tr>
      <tr>
        <td id="L343" class="blob-num js-line-number" data-line-number="343"></td>
        <td id="LC343" class="blob-code blob-code-inner js-file-line">                    method <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>Local<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L344" class="blob-num js-line-number" data-line-number="344"></td>
        <td id="LC344" class="blob-code blob-code-inner js-file-line">                    </td>
      </tr>
      <tr>
        <td id="L345" class="blob-num js-line-number" data-line-number="345"></td>
        <td id="LC345" class="blob-code blob-code-inner js-file-line">                    <span class="pl-c"><span class="pl-c">//</span>Set local search to true</span></td>
      </tr>
      <tr>
        <td id="L346" class="blob-num js-line-number" data-line-number="346"></td>
        <td id="LC346" class="blob-code blob-code-inner js-file-line">                    localSearch <span class="pl-k">=</span> <span class="pl-c1">true</span>;</td>
      </tr>
      <tr>
        <td id="L347" class="blob-num js-line-number" data-line-number="347"></td>
        <td id="LC347" class="blob-code blob-code-inner js-file-line">                    startLocalTransform();</td>
      </tr>
      <tr>
        <td id="L348" class="blob-num js-line-number" data-line-number="348"></td>
        <td id="LC348" class="blob-code blob-code-inner js-file-line">                   </td>
      </tr>
      <tr>
        <td id="L349" class="blob-num js-line-number" data-line-number="349"></td>
        <td id="LC349" class="blob-code blob-code-inner js-file-line">                    <span class="pl-c"><span class="pl-c">//</span>Rebuild the local searches into a full transform if the Hough Series is desired</span></td>
      </tr>
      <tr>
        <td id="L350" class="blob-num js-line-number" data-line-number="350"></td>
        <td id="LC350" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">if</span>(houghSeries){</td>
      </tr>
      <tr>
        <td id="L351" class="blob-num js-line-number" data-line-number="351"></td>
        <td id="LC351" class="blob-code blob-code-inner js-file-line">                        convertLocaltoFullHough(slice, houghStack);</td>
      </tr>
      <tr>
        <td id="L352" class="blob-num js-line-number" data-line-number="352"></td>
        <td id="LC352" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L353" class="blob-num js-line-number" data-line-number="353"></td>
        <td id="LC353" class="blob-code blob-code-inner js-file-line">                    }</td>
      </tr>
      <tr>
        <td id="L354" class="blob-num js-line-number" data-line-number="354"></td>
        <td id="LC354" class="blob-code blob-code-inner js-file-line">                }</td>
      </tr>
      <tr>
        <td id="L355" class="blob-num js-line-number" data-line-number="355"></td>
        <td id="LC355" class="blob-code blob-code-inner js-file-line">                </td>
      </tr>
      <tr>
        <td id="L356" class="blob-num js-line-number" data-line-number="356"></td>
        <td id="LC356" class="blob-code blob-code-inner js-file-line">                <span class="pl-c"><span class="pl-c">//</span>Otherwise, if there still are valid circles, perform the full Hough transform, but perform a local search for the valid circles first before continuing onto a full search </span></td>
      </tr>
      <tr>
        <td id="L357" class="blob-num js-line-number" data-line-number="357"></td>
        <td id="LC357" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">else</span> <span class="pl-k">if</span>(nCirlcesPrev <span class="pl-k">&gt;</span> <span class="pl-c1">0</span>){</td>
      </tr>
      <tr>
        <td id="L358" class="blob-num js-line-number" data-line-number="358"></td>
        <td id="LC358" class="blob-code blob-code-inner js-file-line">                    method <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>Partial Local<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L359" class="blob-num js-line-number" data-line-number="359"></td>
        <td id="LC359" class="blob-code blob-code-inner js-file-line">                    houghTransform();</td>
      </tr>
      <tr>
        <td id="L360" class="blob-num js-line-number" data-line-number="360"></td>
        <td id="LC360" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">if</span> (houghSeries){</td>
      </tr>
      <tr>
        <td id="L361" class="blob-num js-line-number" data-line-number="361"></td>
        <td id="LC361" class="blob-code blob-code-inner js-file-line">                        <span class="pl-c"><span class="pl-c">//</span>Create the hyperstach to put into the result if needed</span></td>
      </tr>
      <tr>
        <td id="L362" class="blob-num js-line-number" data-line-number="362"></td>
        <td id="LC362" class="blob-code blob-code-inner js-file-line">                        HoughSpaceSeries(slice, houghStack);</td>
      </tr>
      <tr>
        <td id="L363" class="blob-num js-line-number" data-line-number="363"></td>
        <td id="LC363" class="blob-code blob-code-inner js-file-line">                    }</td>
      </tr>
      <tr>
        <td id="L364" class="blob-num js-line-number" data-line-number="364"></td>
        <td id="LC364" class="blob-code blob-code-inner js-file-line">                    startPartialLocalSearch();</td>
      </tr>
      <tr>
        <td id="L365" class="blob-num js-line-number" data-line-number="365"></td>
        <td id="LC365" class="blob-code blob-code-inner js-file-line">                    getCenterPoints();</td>
      </tr>
      <tr>
        <td id="L366" class="blob-num js-line-number" data-line-number="366"></td>
        <td id="LC366" class="blob-code blob-code-inner js-file-line">                }</td>
      </tr>
      <tr>
        <td id="L367" class="blob-num js-line-number" data-line-number="367"></td>
        <td id="LC367" class="blob-code blob-code-inner js-file-line">                 <span class="pl-c"><span class="pl-c">//</span>If there are no circles, and minCircles is 0, then return blank results</span></td>
      </tr>
      <tr>
        <td id="L368" class="blob-num js-line-number" data-line-number="368"></td>
        <td id="LC368" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">else</span> <span class="pl-k">if</span>(nCirlcesPrev <span class="pl-k">==</span> <span class="pl-c1">0</span> <span class="pl-k">&amp;</span> minCircles <span class="pl-k">==</span> <span class="pl-c1">0</span>){</td>
      </tr>
      <tr>
        <td id="L369" class="blob-num js-line-number" data-line-number="369"></td>
        <td id="LC369" class="blob-code blob-code-inner js-file-line">                    method <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>N/A<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L370" class="blob-num js-line-number" data-line-number="370"></td>
        <td id="LC370" class="blob-code blob-code-inner js-file-line">                    <span class="pl-c"><span class="pl-c">//</span>Create an empty Hough array</span></td>
      </tr>
      <tr>
        <td id="L371" class="blob-num js-line-number" data-line-number="371"></td>
        <td id="LC371" class="blob-code blob-code-inner js-file-line">                    houghValues <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">int</span>[width][height][depth];</td>
      </tr>
      <tr>
        <td id="L372" class="blob-num js-line-number" data-line-number="372"></td>
        <td id="LC372" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">if</span> (houghSeries){</td>
      </tr>
      <tr>
        <td id="L373" class="blob-num js-line-number" data-line-number="373"></td>
        <td id="LC373" class="blob-code blob-code-inner js-file-line">                        <span class="pl-c"><span class="pl-c">//</span>Create the hyperstach to put into the result if needed</span></td>
      </tr>
      <tr>
        <td id="L374" class="blob-num js-line-number" data-line-number="374"></td>
        <td id="LC374" class="blob-code blob-code-inner js-file-line">                        HoughSpaceSeries(slice, houghStack);</td>
      </tr>
      <tr>
        <td id="L375" class="blob-num js-line-number" data-line-number="375"></td>
        <td id="LC375" class="blob-code blob-code-inner js-file-line">                    }</td>
      </tr>
      <tr>
        <td id="L376" class="blob-num js-line-number" data-line-number="376"></td>
        <td id="LC376" class="blob-code blob-code-inner js-file-line">                    </td>
      </tr>
      <tr>
        <td id="L377" class="blob-num js-line-number" data-line-number="377"></td>
        <td id="LC377" class="blob-code blob-code-inner js-file-line">                    <span class="pl-c"><span class="pl-c">//</span>Set maxHough to an arbitrary value to flag that there is no need to find this value</span></td>
      </tr>
      <tr>
        <td id="L378" class="blob-num js-line-number" data-line-number="378"></td>
        <td id="LC378" class="blob-code blob-code-inner js-file-line">                    maxHough <span class="pl-k">=</span> <span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L379" class="blob-num js-line-number" data-line-number="379"></td>
        <td id="LC379" class="blob-code blob-code-inner js-file-line">                } </td>
      </tr>
      <tr>
        <td id="L380" class="blob-num js-line-number" data-line-number="380"></td>
        <td id="LC380" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L381" class="blob-num js-line-number" data-line-number="381"></td>
        <td id="LC381" class="blob-code blob-code-inner js-file-line">                <span class="pl-c"><span class="pl-c">//</span>If no circles are found, then revert to a full Hough</span></td>
      </tr>
      <tr>
        <td id="L382" class="blob-num js-line-number" data-line-number="382"></td>
        <td id="LC382" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">else</span>{</td>
      </tr>
      <tr>
        <td id="L383" class="blob-num js-line-number" data-line-number="383"></td>
        <td id="LC383" class="blob-code blob-code-inner js-file-line">                    method <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>Full<span class="pl-pds">&quot;</span></span>;                   </td>
      </tr>
      <tr>
        <td id="L384" class="blob-num js-line-number" data-line-number="384"></td>
        <td id="LC384" class="blob-code blob-code-inner js-file-line">                    houghTransform();</td>
      </tr>
      <tr>
        <td id="L385" class="blob-num js-line-number" data-line-number="385"></td>
        <td id="LC385" class="blob-code blob-code-inner js-file-line">                    </td>
      </tr>
      <tr>
        <td id="L386" class="blob-num js-line-number" data-line-number="386"></td>
        <td id="LC386" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">if</span> (houghSeries){</td>
      </tr>
      <tr>
        <td id="L387" class="blob-num js-line-number" data-line-number="387"></td>
        <td id="LC387" class="blob-code blob-code-inner js-file-line">                        <span class="pl-c"><span class="pl-c">//</span>Create the hyperstach to put into the result if needed</span></td>
      </tr>
      <tr>
        <td id="L388" class="blob-num js-line-number" data-line-number="388"></td>
        <td id="LC388" class="blob-code blob-code-inner js-file-line">                        HoughSpaceSeries(slice, houghStack);</td>
      </tr>
      <tr>
        <td id="L389" class="blob-num js-line-number" data-line-number="389"></td>
        <td id="LC389" class="blob-code blob-code-inner js-file-line">                    }</td>
      </tr>
      <tr>
        <td id="L390" class="blob-num js-line-number" data-line-number="390"></td>
        <td id="LC390" class="blob-code blob-code-inner js-file-line">                    <span class="pl-c"><span class="pl-c">//</span> Mark the center of the found circles in a new image(always do this as center points are necessary for local search)                   </span></td>
      </tr>
      <tr>
        <td id="L391" class="blob-num js-line-number" data-line-number="391"></td>
        <td id="LC391" class="blob-code blob-code-inner js-file-line">                    getCenterPoints();</td>
      </tr>
      <tr>
        <td id="L392" class="blob-num js-line-number" data-line-number="392"></td>
        <td id="LC392" class="blob-code blob-code-inner js-file-line">                }                </td>
      </tr>
      <tr>
        <td id="L393" class="blob-num js-line-number" data-line-number="393"></td>
        <td id="LC393" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L394" class="blob-num js-line-number" data-line-number="394"></td>
        <td id="LC394" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Otherwise, perform the full transform</span></td>
      </tr>
      <tr>
        <td id="L395" class="blob-num js-line-number" data-line-number="395"></td>
        <td id="LC395" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">else</span>{</td>
      </tr>
      <tr>
        <td id="L396" class="blob-num js-line-number" data-line-number="396"></td>
        <td id="LC396" class="blob-code blob-code-inner js-file-line">                method <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>Full<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L397" class="blob-num js-line-number" data-line-number="397"></td>
        <td id="LC397" class="blob-code blob-code-inner js-file-line">                houghTransform();             </td>
      </tr>
      <tr>
        <td id="L398" class="blob-num js-line-number" data-line-number="398"></td>
        <td id="LC398" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">if</span> (houghSeries){</td>
      </tr>
      <tr>
        <td id="L399" class="blob-num js-line-number" data-line-number="399"></td>
        <td id="LC399" class="blob-code blob-code-inner js-file-line">                    <span class="pl-c"><span class="pl-c">//</span>Create the hyperstach to put into the result if needed</span></td>
      </tr>
      <tr>
        <td id="L400" class="blob-num js-line-number" data-line-number="400"></td>
        <td id="LC400" class="blob-code blob-code-inner js-file-line">                    HoughSpaceSeries(slice, houghStack);</td>
      </tr>
      <tr>
        <td id="L401" class="blob-num js-line-number" data-line-number="401"></td>
        <td id="LC401" class="blob-code blob-code-inner js-file-line">                }</td>
      </tr>
      <tr>
        <td id="L402" class="blob-num js-line-number" data-line-number="402"></td>
        <td id="LC402" class="blob-code blob-code-inner js-file-line">                <span class="pl-c"><span class="pl-c">//</span> Mark the center of the found circles in a new image if user wants to find centers               </span></td>
      </tr>
      <tr>
        <td id="L403" class="blob-num js-line-number" data-line-number="403"></td>
        <td id="LC403" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">if</span>(showCircles <span class="pl-k">||</span> showID <span class="pl-k">||</span> showScores <span class="pl-k">||</span> results <span class="pl-k">||</span> local) getCenterPoints();</td>
      </tr>
      <tr>
        <td id="L404" class="blob-num js-line-number" data-line-number="404"></td>
        <td id="LC404" class="blob-code blob-code-inner js-file-line">               </td>
      </tr>
      <tr>
        <td id="L405" class="blob-num js-line-number" data-line-number="405"></td>
        <td id="LC405" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L406" class="blob-num js-line-number" data-line-number="406"></td>
        <td id="LC406" class="blob-code blob-code-inner js-file-line">             <span class="pl-c"><span class="pl-c">//</span> &lt;/editor-fold&gt;</span></td>
      </tr>
      <tr>
        <td id="L407" class="blob-num js-line-number" data-line-number="407"></td>
        <td id="LC407" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L408" class="blob-num js-line-number" data-line-number="408"></td>
        <td id="LC408" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span> Create image View for Marked Circles.</span></td>
      </tr>
      <tr>
        <td id="L409" class="blob-num js-line-number" data-line-number="409"></td>
        <td id="LC409" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(showCircles) drawCircles(slice, circleStack, width, height, offx, offy, fullWidth);</td>
      </tr>
      <tr>
        <td id="L410" class="blob-num js-line-number" data-line-number="410"></td>
        <td id="LC410" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L411" class="blob-num js-line-number" data-line-number="411"></td>
        <td id="LC411" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Create map of centroids where the intensity is the radius</span></td>
      </tr>
      <tr>
        <td id="L412" class="blob-num js-line-number" data-line-number="412"></td>
        <td id="LC412" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span> (showID <span class="pl-k">||</span> showScores) drawFilledCircles(slice, idStack, scoreStack);</td>
      </tr>
      <tr>
        <td id="L413" class="blob-num js-line-number" data-line-number="413"></td>
        <td id="LC413" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L414" class="blob-num js-line-number" data-line-number="414"></td>
        <td id="LC414" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Export measurements to the results table</span></td>
      </tr>
      <tr>
        <td id="L415" class="blob-num js-line-number" data-line-number="415"></td>
        <td id="LC415" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span> (results) resultsTable(slice);</td>
      </tr>
      <tr>
        <td id="L416" class="blob-num js-line-number" data-line-number="416"></td>
        <td id="LC416" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L417" class="blob-num js-line-number" data-line-number="417"></td>
        <td id="LC417" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L418" class="blob-num js-line-number" data-line-number="418"></td>
        <td id="LC418" class="blob-code blob-code-inner js-file-line"><span class="pl-c"><span class="pl-c">//</span>startTestTime = System.currentTimeMillis(); </span></td>
      </tr>
      <tr>
        <td id="L419" class="blob-num js-line-number" data-line-number="419"></td>
        <td id="LC419" class="blob-code blob-code-inner js-file-line"><span class="pl-c"><span class="pl-c">//</span>totalTime += System.currentTimeMillis()-startTestTime; </span></td>
      </tr>
      <tr>
        <td id="L420" class="blob-num js-line-number" data-line-number="420"></td>
        <td id="LC420" class="blob-code blob-code-inner js-file-line"><span class="pl-c"><span class="pl-c">//</span>IJ.log(&quot;&quot; + totalTime);</span></td>
      </tr>
      <tr>
        <td id="L421" class="blob-num js-line-number" data-line-number="421"></td>
        <td id="LC421" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Draw the resulting stacks</span></td>
      </tr>
      <tr>
        <td id="L422" class="blob-num js-line-number" data-line-number="422"></td>
        <td id="LC422" class="blob-code blob-code-inner js-file-line">         <span class="pl-k">if</span>(houghSeries){</td>
      </tr>
      <tr>
        <td id="L423" class="blob-num js-line-number" data-line-number="423"></td>
        <td id="LC423" class="blob-code blob-code-inner js-file-line">            houghPlus <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">ImagePlus</span>(<span class="pl-s"><span class="pl-pds">&quot;</span>Hough Transform Series<span class="pl-pds">&quot;</span></span>, houghStack);</td>
      </tr>
      <tr>
        <td id="L424" class="blob-num js-line-number" data-line-number="424"></td>
        <td id="LC424" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(depth<span class="pl-k">&gt;</span><span class="pl-c1">1</span>) houghPlus <span class="pl-k">=</span> <span class="pl-smi">HyperStackConverter</span><span class="pl-k">.</span>toHyperStack(houghPlus, <span class="pl-c1">1</span>, depth, imp<span class="pl-k">.</span>getNSlices(), <span class="pl-s"><span class="pl-pds">&quot;</span>default<span class="pl-pds">&quot;</span></span>, <span class="pl-s"><span class="pl-pds">&quot;</span>grayscale<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L425" class="blob-num js-line-number" data-line-number="425"></td>
        <td id="LC425" class="blob-code blob-code-inner js-file-line">            houghPlus<span class="pl-k">.</span>show();</td>
      </tr>
      <tr>
        <td id="L426" class="blob-num js-line-number" data-line-number="426"></td>
        <td id="LC426" class="blob-code blob-code-inner js-file-line">         }</td>
      </tr>
      <tr>
        <td id="L427" class="blob-num js-line-number" data-line-number="427"></td>
        <td id="LC427" class="blob-code blob-code-inner js-file-line">         <span class="pl-k">if</span>(showCircles){</td>
      </tr>
      <tr>
        <td id="L428" class="blob-num js-line-number" data-line-number="428"></td>
        <td id="LC428" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">ImagePlus</span> <span class="pl-smi">Circle_Map</span> <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">ImagePlus</span>(<span class="pl-s"><span class="pl-pds">&quot;</span>Centroid overlay<span class="pl-pds">&quot;</span></span>, circleStack);</td>
      </tr>
      <tr>
        <td id="L429" class="blob-num js-line-number" data-line-number="429"></td>
        <td id="LC429" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">Circle_Map</span><span class="pl-k">.</span>show(); </td>
      </tr>
      <tr>
        <td id="L430" class="blob-num js-line-number" data-line-number="430"></td>
        <td id="LC430" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L431" class="blob-num js-line-number" data-line-number="431"></td>
        <td id="LC431" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>If orignal stack was movie, convert this stack to movie</span></td>
      </tr>
      <tr>
        <td id="L432" class="blob-num js-line-number" data-line-number="432"></td>
        <td id="LC432" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(imageDimensions[<span class="pl-c1">4</span>] <span class="pl-k">&gt;</span> <span class="pl-c1">1</span>){           </td>
      </tr>
      <tr>
        <td id="L433" class="blob-num js-line-number" data-line-number="433"></td>
        <td id="LC433" class="blob-code blob-code-inner js-file-line">                <span class="pl-smi">Circle_Map</span><span class="pl-k">.</span>setDimensions(<span class="pl-c1">1</span>, <span class="pl-c1">1</span>, imageDimensions[<span class="pl-c1">4</span>]);</td>
      </tr>
      <tr>
        <td id="L434" class="blob-num js-line-number" data-line-number="434"></td>
        <td id="LC434" class="blob-code blob-code-inner js-file-line">            }             </td>
      </tr>
      <tr>
        <td id="L435" class="blob-num js-line-number" data-line-number="435"></td>
        <td id="LC435" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">Circle_Map</span><span class="pl-k">.</span>setCalibration(pixelCal); </td>
      </tr>
      <tr>
        <td id="L436" class="blob-num js-line-number" data-line-number="436"></td>
        <td id="LC436" class="blob-code blob-code-inner js-file-line">         }</td>
      </tr>
      <tr>
        <td id="L437" class="blob-num js-line-number" data-line-number="437"></td>
        <td id="LC437" class="blob-code blob-code-inner js-file-line">         <span class="pl-k">if</span>(showID){</td>
      </tr>
      <tr>
        <td id="L438" class="blob-num js-line-number" data-line-number="438"></td>
        <td id="LC438" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">ImagePlus</span> <span class="pl-smi">ID_Map</span> <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">ImagePlus</span>(<span class="pl-s"><span class="pl-pds">&quot;</span>Centroid map<span class="pl-pds">&quot;</span></span>, idStack);</td>
      </tr>
      <tr>
        <td id="L439" class="blob-num js-line-number" data-line-number="439"></td>
        <td id="LC439" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">ID_Map</span><span class="pl-k">.</span>show();</td>
      </tr>
      <tr>
        <td id="L440" class="blob-num js-line-number" data-line-number="440"></td>
        <td id="LC440" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">ID_Map</span><span class="pl-k">.</span>setLut(<span class="pl-c1">RAND_LUT</span>);</td>
      </tr>
      <tr>
        <td id="L441" class="blob-num js-line-number" data-line-number="441"></td>
        <td id="LC441" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">ID_Map</span><span class="pl-k">.</span>setDisplayRange(<span class="pl-c1">0</span>,circleIDcounter);</td>
      </tr>
      <tr>
        <td id="L442" class="blob-num js-line-number" data-line-number="442"></td>
        <td id="LC442" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L443" class="blob-num js-line-number" data-line-number="443"></td>
        <td id="LC443" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>If orignal stack was movie, convert this stack to movie</span></td>
      </tr>
      <tr>
        <td id="L444" class="blob-num js-line-number" data-line-number="444"></td>
        <td id="LC444" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(imageDimensions[<span class="pl-c1">4</span>] <span class="pl-k">&gt;</span> <span class="pl-c1">1</span>){           </td>
      </tr>
      <tr>
        <td id="L445" class="blob-num js-line-number" data-line-number="445"></td>
        <td id="LC445" class="blob-code blob-code-inner js-file-line">                <span class="pl-smi">ID_Map</span><span class="pl-k">.</span>setDimensions(<span class="pl-c1">1</span>, <span class="pl-c1">1</span>, imageDimensions[<span class="pl-c1">4</span>]);</td>
      </tr>
      <tr>
        <td id="L446" class="blob-num js-line-number" data-line-number="446"></td>
        <td id="LC446" class="blob-code blob-code-inner js-file-line">            }             </td>
      </tr>
      <tr>
        <td id="L447" class="blob-num js-line-number" data-line-number="447"></td>
        <td id="LC447" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">ID_Map</span><span class="pl-k">.</span>setCalibration(pixelCal); </td>
      </tr>
      <tr>
        <td id="L448" class="blob-num js-line-number" data-line-number="448"></td>
        <td id="LC448" class="blob-code blob-code-inner js-file-line">         }</td>
      </tr>
      <tr>
        <td id="L449" class="blob-num js-line-number" data-line-number="449"></td>
        <td id="LC449" class="blob-code blob-code-inner js-file-line">         <span class="pl-k">if</span>(showScores){</td>
      </tr>
      <tr>
        <td id="L450" class="blob-num js-line-number" data-line-number="450"></td>
        <td id="LC450" class="blob-code blob-code-inner js-file-line">             <span class="pl-smi">ImagePlus</span> <span class="pl-smi">Score_Map</span> <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">ImagePlus</span>(<span class="pl-s"><span class="pl-pds">&quot;</span>Score map<span class="pl-pds">&quot;</span></span>, scoreStack);</td>
      </tr>
      <tr>
        <td id="L451" class="blob-num js-line-number" data-line-number="451"></td>
        <td id="LC451" class="blob-code blob-code-inner js-file-line">             <span class="pl-smi">Score_Map</span><span class="pl-k">.</span>show();</td>
      </tr>
      <tr>
        <td id="L452" class="blob-num js-line-number" data-line-number="452"></td>
        <td id="LC452" class="blob-code blob-code-inner js-file-line">             <span class="pl-smi">Score_Map</span><span class="pl-k">.</span>setLut(<span class="pl-c1">GYR_LUT</span>);</td>
      </tr>
      <tr>
        <td id="L453" class="blob-num js-line-number" data-line-number="453"></td>
        <td id="LC453" class="blob-code blob-code-inner js-file-line">             <span class="pl-smi">Score_Map</span><span class="pl-k">.</span>setDisplayRange(thresholdRatio, <span class="pl-c1">1D</span>);</td>
      </tr>
      <tr>
        <td id="L454" class="blob-num js-line-number" data-line-number="454"></td>
        <td id="LC454" class="blob-code blob-code-inner js-file-line">             </td>
      </tr>
      <tr>
        <td id="L455" class="blob-num js-line-number" data-line-number="455"></td>
        <td id="LC455" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>If orignal stack was movie, convert this stack to movie</span></td>
      </tr>
      <tr>
        <td id="L456" class="blob-num js-line-number" data-line-number="456"></td>
        <td id="LC456" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(imageDimensions[<span class="pl-c1">4</span>] <span class="pl-k">&gt;</span> <span class="pl-c1">1</span>){           </td>
      </tr>
      <tr>
        <td id="L457" class="blob-num js-line-number" data-line-number="457"></td>
        <td id="LC457" class="blob-code blob-code-inner js-file-line">                <span class="pl-smi">Score_Map</span><span class="pl-k">.</span>setDimensions(<span class="pl-c1">1</span>, <span class="pl-c1">1</span>, imageDimensions[<span class="pl-c1">4</span>]);</td>
      </tr>
      <tr>
        <td id="L458" class="blob-num js-line-number" data-line-number="458"></td>
        <td id="LC458" class="blob-code blob-code-inner js-file-line">            }             </td>
      </tr>
      <tr>
        <td id="L459" class="blob-num js-line-number" data-line-number="459"></td>
        <td id="LC459" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">Score_Map</span><span class="pl-k">.</span>setCalibration(pixelCal); </td>
      </tr>
      <tr>
        <td id="L460" class="blob-num js-line-number" data-line-number="460"></td>
        <td id="LC460" class="blob-code blob-code-inner js-file-line">         } </td>
      </tr>
      <tr>
        <td id="L461" class="blob-num js-line-number" data-line-number="461"></td>
        <td id="LC461" class="blob-code blob-code-inner js-file-line">         <span class="pl-k">if</span>(results) rt<span class="pl-k">.</span>show(<span class="pl-s"><span class="pl-pds">&quot;</span>Results<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L462" class="blob-num js-line-number" data-line-number="462"></td>
        <td id="LC462" class="blob-code blob-code-inner js-file-line">         </td>
      </tr>
      <tr>
        <td id="L463" class="blob-num js-line-number" data-line-number="463"></td>
        <td id="LC463" class="blob-code blob-code-inner js-file-line">         <span class="pl-c"><span class="pl-c">//</span>Put slices back into frame dimension if necessary</span></td>
      </tr>
      <tr>
        <td id="L464" class="blob-num js-line-number" data-line-number="464"></td>
        <td id="LC464" class="blob-code blob-code-inner js-file-line">         <span class="pl-k">if</span>(imageDimensions[<span class="pl-c1">4</span>] <span class="pl-k">&gt;</span> <span class="pl-c1">1</span>){           </td>
      </tr>
      <tr>
        <td id="L465" class="blob-num js-line-number" data-line-number="465"></td>
        <td id="LC465" class="blob-code blob-code-inner js-file-line">            imp<span class="pl-k">.</span>setDimensions(<span class="pl-c1">1</span>, <span class="pl-c1">1</span>, imageDimensions[<span class="pl-c1">4</span>]);</td>
      </tr>
      <tr>
        <td id="L466" class="blob-num js-line-number" data-line-number="466"></td>
        <td id="LC466" class="blob-code blob-code-inner js-file-line">         }</td>
      </tr>
      <tr>
        <td id="L467" class="blob-num js-line-number" data-line-number="467"></td>
        <td id="LC467" class="blob-code blob-code-inner js-file-line">         </td>
      </tr>
      <tr>
        <td id="L468" class="blob-num js-line-number" data-line-number="468"></td>
        <td id="LC468" class="blob-code blob-code-inner js-file-line">         <span class="pl-c1">IJ</span><span class="pl-k">.</span>showProgress(<span class="pl-c1">0</span>);</td>
      </tr>
      <tr>
        <td id="L469" class="blob-num js-line-number" data-line-number="469"></td>
        <td id="LC469" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L470" class="blob-num js-line-number" data-line-number="470"></td>
        <td id="LC470" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L471" class="blob-num js-line-number" data-line-number="471"></td>
        <td id="LC471" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>OPTMIZED - cancellable</span></td>
      </tr>
      <tr>
        <td id="L472" class="blob-num js-line-number" data-line-number="472"></td>
        <td id="LC472" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">void</span> <span class="pl-en">startLocalTransform</span>(){</td>
      </tr>
      <tr>
        <td id="L473" class="blob-num js-line-number" data-line-number="473"></td>
        <td id="LC473" class="blob-code blob-code-inner js-file-line">         <span class="pl-c"><span class="pl-c">//</span>Initialize an array to store the local Hough transform from each thread</span></td>
      </tr>
      <tr>
        <td id="L474" class="blob-num js-line-number" data-line-number="474"></td>
        <td id="LC474" class="blob-code blob-code-inner js-file-line">        localHoughValues <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">int</span> [nCirlcesPrev][<span class="pl-c1">2</span><span class="pl-k">*</span>searchRadius <span class="pl-k">+</span> <span class="pl-c1">1</span>][<span class="pl-c1">2</span><span class="pl-k">*</span>searchRadius <span class="pl-k">+</span> <span class="pl-c1">1</span>][<span class="pl-c1">2</span><span class="pl-k">*</span>searchBand <span class="pl-k">+</span> <span class="pl-c1">1</span>];</td>
      </tr>
      <tr>
        <td id="L475" class="blob-num js-line-number" data-line-number="475"></td>
        <td id="LC475" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L476" class="blob-num js-line-number" data-line-number="476"></td>
        <td id="LC476" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Initialize an array to store the final dimensions and location of each local Hough Transform</span></td>
      </tr>
      <tr>
        <td id="L477" class="blob-num js-line-number" data-line-number="477"></td>
        <td id="LC477" class="blob-code blob-code-inner js-file-line">        localHoughParameters <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">int</span> [nCirlcesPrev][<span class="pl-c1">9</span>];</td>
      </tr>
      <tr>
        <td id="L478" class="blob-num js-line-number" data-line-number="478"></td>
        <td id="LC478" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L479" class="blob-num js-line-number" data-line-number="479"></td>
        <td id="LC479" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Setup two processing pipelines to multithread only if there are more than 1 circles</span></td>
      </tr>
      <tr>
        <td id="L480" class="blob-num js-line-number" data-line-number="480"></td>
        <td id="LC480" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(nCirlcesPrev <span class="pl-k">&lt;</span> <span class="pl-c1">2</span>){</td>
      </tr>
      <tr>
        <td id="L481" class="blob-num js-line-number" data-line-number="481"></td>
        <td id="LC481" class="blob-code blob-code-inner js-file-line">            localHoughTransform(<span class="pl-c1">0</span>);</td>
      </tr>
      <tr>
        <td id="L482" class="blob-num js-line-number" data-line-number="482"></td>
        <td id="LC482" class="blob-code blob-code-inner js-file-line">            localGetCenterPoint(<span class="pl-c1">0</span>); <span class="pl-c"><span class="pl-c">//</span>Make sure this returns -1 to index if no circle was found</span></td>
      </tr>
      <tr>
        <td id="L483" class="blob-num js-line-number" data-line-number="483"></td>
        <td id="LC483" class="blob-code blob-code-inner js-file-line">            maxHough <span class="pl-k">=</span> houghScores[<span class="pl-c1">0</span>];</td>
      </tr>
      <tr>
        <td id="L484" class="blob-num js-line-number" data-line-number="484"></td>
        <td id="LC484" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L485" class="blob-num js-line-number" data-line-number="485"></td>
        <td id="LC485" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L486" class="blob-num js-line-number" data-line-number="486"></td>
        <td id="LC486" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Otherwise, multithread the local search</span></td>
      </tr>
      <tr>
        <td id="L487" class="blob-num js-line-number" data-line-number="487"></td>
        <td id="LC487" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">else</span>{</td>
      </tr>
      <tr>
        <td id="L488" class="blob-num js-line-number" data-line-number="488"></td>
        <td id="LC488" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Build an array to store the result from each thread</span></td>
      </tr>
      <tr>
        <td id="L489" class="blob-num js-line-number" data-line-number="489"></td>
        <td id="LC489" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">final</span> <span class="pl-k">Thread</span>[] threads <span class="pl-k">=</span> newThreadArray();</td>
      </tr>
      <tr>
        <td id="L490" class="blob-num js-line-number" data-line-number="490"></td>
        <td id="LC490" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L491" class="blob-num js-line-number" data-line-number="491"></td>
        <td id="LC491" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Create an atomic integer counter that each thread can use to count through the radii</span></td>
      </tr>
      <tr>
        <td id="L492" class="blob-num js-line-number" data-line-number="492"></td>
        <td id="LC492" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">final</span> <span class="pl-smi">AtomicInteger</span> ai <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">AtomicInteger</span>(<span class="pl-c1">0</span>);</td>
      </tr>
      <tr>
        <td id="L493" class="blob-num js-line-number" data-line-number="493"></td>
        <td id="LC493" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L494" class="blob-num js-line-number" data-line-number="494"></td>
        <td id="LC494" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Build a thread for as many CPUs as are available to the JVM </span></td>
      </tr>
      <tr>
        <td id="L495" class="blob-num js-line-number" data-line-number="495"></td>
        <td id="LC495" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">for</span> (ithread <span class="pl-k">=</span> <span class="pl-c1">0</span>; ithread <span class="pl-k">&lt;</span> threads<span class="pl-k">.</span>length; ithread<span class="pl-k">++</span>) {    </td>
      </tr>
      <tr>
        <td id="L496" class="blob-num js-line-number" data-line-number="496"></td>
        <td id="LC496" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L497" class="blob-num js-line-number" data-line-number="497"></td>
        <td id="LC497" class="blob-code blob-code-inner js-file-line">                <span class="pl-c"><span class="pl-c">//</span> Concurrently run in as many threads as CPUs  </span></td>
      </tr>
      <tr>
        <td id="L498" class="blob-num js-line-number" data-line-number="498"></td>
        <td id="LC498" class="blob-code blob-code-inner js-file-line">                threads[ithread] <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Thread</span>() {  </td>
      </tr>
      <tr>
        <td id="L499" class="blob-num js-line-number" data-line-number="499"></td>
        <td id="LC499" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L500" class="blob-num js-line-number" data-line-number="500"></td>
        <td id="LC500" class="blob-code blob-code-inner js-file-line">                    { setPriority(<span class="pl-smi">Thread</span><span class="pl-c1"><span class="pl-k">.</span>NORM_PRIORITY</span>); }  </td>
      </tr>
      <tr>
        <td id="L501" class="blob-num js-line-number" data-line-number="501"></td>
        <td id="LC501" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L502" class="blob-num js-line-number" data-line-number="502"></td>
        <td id="LC502" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">@Override</span></td>
      </tr>
      <tr>
        <td id="L503" class="blob-num js-line-number" data-line-number="503"></td>
        <td id="LC503" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">public</span> <span class="pl-k">void</span> <span class="pl-en">run</span>() {  </td>
      </tr>
      <tr>
        <td id="L504" class="blob-num js-line-number" data-line-number="504"></td>
        <td id="LC504" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L505" class="blob-num js-line-number" data-line-number="505"></td>
        <td id="LC505" class="blob-code blob-code-inner js-file-line">                        <span class="pl-c"><span class="pl-c">//</span>Divide the task so that each core works on a subset of circles</span></td>
      </tr>
      <tr>
        <td id="L506" class="blob-num js-line-number" data-line-number="506"></td>
        <td id="LC506" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">for</span>(<span class="pl-k">int</span> circleNum <span class="pl-k">=</span> ai<span class="pl-k">.</span>getAndAdd(<span class="pl-c1">1</span>); circleNum <span class="pl-k">&lt;</span> nCirlcesPrev; circleNum <span class="pl-k">=</span> ai<span class="pl-k">.</span>getAndAdd(<span class="pl-c1">1</span>)){</td>
      </tr>
      <tr>
        <td id="L507" class="blob-num js-line-number" data-line-number="507"></td>
        <td id="LC507" class="blob-code blob-code-inner js-file-line">                            <span class="pl-c"><span class="pl-c">//</span>Check for interrupt</span></td>
      </tr>
      <tr>
        <td id="L508" class="blob-num js-line-number" data-line-number="508"></td>
        <td id="LC508" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">if</span>(cancelThread) <span class="pl-k">return</span>;</td>
      </tr>
      <tr>
        <td id="L509" class="blob-num js-line-number" data-line-number="509"></td>
        <td id="LC509" class="blob-code blob-code-inner js-file-line">                            </td>
      </tr>
      <tr>
        <td id="L510" class="blob-num js-line-number" data-line-number="510"></td>
        <td id="LC510" class="blob-code blob-code-inner js-file-line">                            localHoughTransform(circleNum);</td>
      </tr>
      <tr>
        <td id="L511" class="blob-num js-line-number" data-line-number="511"></td>
        <td id="LC511" class="blob-code blob-code-inner js-file-line">                            localGetCenterPoint(circleNum); <span class="pl-c"><span class="pl-c">//</span>Make sure this returns -1 to index if no circle was found</span></td>
      </tr>
      <tr>
        <td id="L512" class="blob-num js-line-number" data-line-number="512"></td>
        <td id="LC512" class="blob-code blob-code-inner js-file-line">                        }</td>
      </tr>
      <tr>
        <td id="L513" class="blob-num js-line-number" data-line-number="513"></td>
        <td id="LC513" class="blob-code blob-code-inner js-file-line">                    }               </td>
      </tr>
      <tr>
        <td id="L514" class="blob-num js-line-number" data-line-number="514"></td>
        <td id="LC514" class="blob-code blob-code-inner js-file-line">                };  </td>
      </tr>
      <tr>
        <td id="L515" class="blob-num js-line-number" data-line-number="515"></td>
        <td id="LC515" class="blob-code blob-code-inner js-file-line">            }    </td>
      </tr>
      <tr>
        <td id="L516" class="blob-num js-line-number" data-line-number="516"></td>
        <td id="LC516" class="blob-code blob-code-inner js-file-line">            startAndJoin(threads);</td>
      </tr>
      <tr>
        <td id="L517" class="blob-num js-line-number" data-line-number="517"></td>
        <td id="LC517" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L518" class="blob-num js-line-number" data-line-number="518"></td>
        <td id="LC518" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Retrieve the maximum hough value if the raw Hough is desired</span></td>
      </tr>
      <tr>
        <td id="L519" class="blob-num js-line-number" data-line-number="519"></td>
        <td id="LC519" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(houghSeries){</td>
      </tr>
      <tr>
        <td id="L520" class="blob-num js-line-number" data-line-number="520"></td>
        <td id="LC520" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">for</span>(<span class="pl-k">int</span> i<span class="pl-k">=</span><span class="pl-c1">0</span>; i<span class="pl-k">&lt;</span>nCirlcesPrev; i<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L521" class="blob-num js-line-number" data-line-number="521"></td>
        <td id="LC521" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">if</span>(houghScores[i] <span class="pl-k">&gt;</span> maxHough) maxHough <span class="pl-k">=</span> houghScores[i]; </td>
      </tr>
      <tr>
        <td id="L522" class="blob-num js-line-number" data-line-number="522"></td>
        <td id="LC522" class="blob-code blob-code-inner js-file-line">                }</td>
      </tr>
      <tr>
        <td id="L523" class="blob-num js-line-number" data-line-number="523"></td>
        <td id="LC523" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L524" class="blob-num js-line-number" data-line-number="524"></td>
        <td id="LC524" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L525" class="blob-num js-line-number" data-line-number="525"></td>
        <td id="LC525" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L526" class="blob-num js-line-number" data-line-number="526"></td>
        <td id="LC526" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Flag move all circles to the starting indexes, so there are no gaps between circles (i.e. if there were 3 circles, then they occupy indeces 0-2)</span></td>
      </tr>
      <tr>
        <td id="L527" class="blob-num js-line-number" data-line-number="527"></td>
        <td id="LC527" class="blob-code blob-code-inner js-file-line">        collapseLocalResult();</td>
      </tr>
      <tr>
        <td id="L528" class="blob-num js-line-number" data-line-number="528"></td>
        <td id="LC528" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L529" class="blob-num js-line-number" data-line-number="529"></td>
        <td id="LC529" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L530" class="blob-num js-line-number" data-line-number="530"></td>
        <td id="LC530" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>OPTIMIZED - cancellable</span></td>
      </tr>
      <tr>
        <td id="L531" class="blob-num js-line-number" data-line-number="531"></td>
        <td id="LC531" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">void</span> <span class="pl-en">startPartialLocalSearch</span>(){</td>
      </tr>
      <tr>
        <td id="L532" class="blob-num js-line-number" data-line-number="532"></td>
        <td id="LC532" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Build an array to store the result from each thread</span></td>
      </tr>
      <tr>
        <td id="L533" class="blob-num js-line-number" data-line-number="533"></td>
        <td id="LC533" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-k">Thread</span>[] threads <span class="pl-k">=</span> newThreadArray();</td>
      </tr>
      <tr>
        <td id="L534" class="blob-num js-line-number" data-line-number="534"></td>
        <td id="LC534" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L535" class="blob-num js-line-number" data-line-number="535"></td>
        <td id="LC535" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Create an atomic integer counter that each thread can use to count through the radii</span></td>
      </tr>
      <tr>
        <td id="L536" class="blob-num js-line-number" data-line-number="536"></td>
        <td id="LC536" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">AtomicInteger</span> ai <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">AtomicInteger</span>(<span class="pl-c1">0</span>);  </td>
      </tr>
      <tr>
        <td id="L537" class="blob-num js-line-number" data-line-number="537"></td>
        <td id="LC537" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L538" class="blob-num js-line-number" data-line-number="538"></td>
        <td id="LC538" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Build a thread for as many CPUs as are available to the JVM </span></td>
      </tr>
      <tr>
        <td id="L539" class="blob-num js-line-number" data-line-number="539"></td>
        <td id="LC539" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">for</span> (ithread <span class="pl-k">=</span> <span class="pl-c1">0</span>; ithread <span class="pl-k">&lt;</span> threads<span class="pl-k">.</span>length; ithread<span class="pl-k">++</span>) {    </td>
      </tr>
      <tr>
        <td id="L540" class="blob-num js-line-number" data-line-number="540"></td>
        <td id="LC540" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L541" class="blob-num js-line-number" data-line-number="541"></td>
        <td id="LC541" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span> Concurrently run in as many threads as CPUs  </span></td>
      </tr>
      <tr>
        <td id="L542" class="blob-num js-line-number" data-line-number="542"></td>
        <td id="LC542" class="blob-code blob-code-inner js-file-line">            threads[ithread] <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Thread</span>() {  </td>
      </tr>
      <tr>
        <td id="L543" class="blob-num js-line-number" data-line-number="543"></td>
        <td id="LC543" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L544" class="blob-num js-line-number" data-line-number="544"></td>
        <td id="LC544" class="blob-code blob-code-inner js-file-line">                { setPriority(<span class="pl-smi">Thread</span><span class="pl-c1"><span class="pl-k">.</span>NORM_PRIORITY</span>); }  </td>
      </tr>
      <tr>
        <td id="L545" class="blob-num js-line-number" data-line-number="545"></td>
        <td id="LC545" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L546" class="blob-num js-line-number" data-line-number="546"></td>
        <td id="LC546" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">@Override</span></td>
      </tr>
      <tr>
        <td id="L547" class="blob-num js-line-number" data-line-number="547"></td>
        <td id="LC547" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">public</span> <span class="pl-k">void</span> <span class="pl-en">run</span>() {  </td>
      </tr>
      <tr>
        <td id="L548" class="blob-num js-line-number" data-line-number="548"></td>
        <td id="LC548" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L549" class="blob-num js-line-number" data-line-number="549"></td>
        <td id="LC549" class="blob-code blob-code-inner js-file-line">                    <span class="pl-c"><span class="pl-c">//</span>Divide the task so that each core works on a subset of circles</span></td>
      </tr>
      <tr>
        <td id="L550" class="blob-num js-line-number" data-line-number="550"></td>
        <td id="LC550" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">for</span>(<span class="pl-k">int</span> circleNum <span class="pl-k">=</span> ai<span class="pl-k">.</span>getAndAdd(<span class="pl-c1">1</span>); circleNum <span class="pl-k">&lt;</span> nCirlcesPrev; circleNum <span class="pl-k">=</span> ai<span class="pl-k">.</span>getAndAdd(<span class="pl-c1">1</span>)){</td>
      </tr>
      <tr>
        <td id="L551" class="blob-num js-line-number" data-line-number="551"></td>
        <td id="LC551" class="blob-code blob-code-inner js-file-line">                        getLocalCenterPoint2(circleNum);</td>
      </tr>
      <tr>
        <td id="L552" class="blob-num js-line-number" data-line-number="552"></td>
        <td id="LC552" class="blob-code blob-code-inner js-file-line">                        </td>
      </tr>
      <tr>
        <td id="L553" class="blob-num js-line-number" data-line-number="553"></td>
        <td id="LC553" class="blob-code blob-code-inner js-file-line">                        <span class="pl-c"><span class="pl-c">//</span>Check for interrupt</span></td>
      </tr>
      <tr>
        <td id="L554" class="blob-num js-line-number" data-line-number="554"></td>
        <td id="LC554" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">if</span>(cancelThread) <span class="pl-k">return</span>;</td>
      </tr>
      <tr>
        <td id="L555" class="blob-num js-line-number" data-line-number="555"></td>
        <td id="LC555" class="blob-code blob-code-inner js-file-line">                    }</td>
      </tr>
      <tr>
        <td id="L556" class="blob-num js-line-number" data-line-number="556"></td>
        <td id="LC556" class="blob-code blob-code-inner js-file-line">                }               </td>
      </tr>
      <tr>
        <td id="L557" class="blob-num js-line-number" data-line-number="557"></td>
        <td id="LC557" class="blob-code blob-code-inner js-file-line">            };  </td>
      </tr>
      <tr>
        <td id="L558" class="blob-num js-line-number" data-line-number="558"></td>
        <td id="LC558" class="blob-code blob-code-inner js-file-line">        }    </td>
      </tr>
      <tr>
        <td id="L559" class="blob-num js-line-number" data-line-number="559"></td>
        <td id="LC559" class="blob-code blob-code-inner js-file-line">        startAndJoin(threads);</td>
      </tr>
      <tr>
        <td id="L560" class="blob-num js-line-number" data-line-number="560"></td>
        <td id="LC560" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L561" class="blob-num js-line-number" data-line-number="561"></td>
        <td id="LC561" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Clear out the remainder of the previous circles in the circle information arrays</span></td>
      </tr>
      <tr>
        <td id="L562" class="blob-num js-line-number" data-line-number="562"></td>
        <td id="LC562" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">for</span>(<span class="pl-k">int</span> a <span class="pl-k">=</span> nCirlcesPrev; a<span class="pl-k">&lt;</span>circleID<span class="pl-k">.</span>length; a<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L563" class="blob-num js-line-number" data-line-number="563"></td>
        <td id="LC563" class="blob-code blob-code-inner js-file-line">            circleID[a] <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L564" class="blob-num js-line-number" data-line-number="564"></td>
        <td id="LC564" class="blob-code blob-code-inner js-file-line">            centerPoint[a] <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Point</span>(<span class="pl-k">-</span><span class="pl-c1">1</span>,<span class="pl-k">-</span><span class="pl-c1">1</span>);</td>
      </tr>
      <tr>
        <td id="L565" class="blob-num js-line-number" data-line-number="565"></td>
        <td id="LC565" class="blob-code blob-code-inner js-file-line">            centerRadii[a] <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L566" class="blob-num js-line-number" data-line-number="566"></td>
        <td id="LC566" class="blob-code blob-code-inner js-file-line">            houghScores[a] <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L567" class="blob-num js-line-number" data-line-number="567"></td>
        <td id="LC567" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L568" class="blob-num js-line-number" data-line-number="568"></td>
        <td id="LC568" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L569" class="blob-num js-line-number" data-line-number="569"></td>
        <td id="LC569" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Flag move all circles to the starting indexes, so there are no gaps between circles (i.e. if there were 3 circles, then they occupy indeces 0-2)</span></td>
      </tr>
      <tr>
        <td id="L570" class="blob-num js-line-number" data-line-number="570"></td>
        <td id="LC570" class="blob-code blob-code-inner js-file-line">        collapseLocalResult();</td>
      </tr>
      <tr>
        <td id="L571" class="blob-num js-line-number" data-line-number="571"></td>
        <td id="LC571" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L572" class="blob-num js-line-number" data-line-number="572"></td>
        <td id="LC572" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L573" class="blob-num js-line-number" data-line-number="573"></td>
        <td id="LC573" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>OPTMIZED - not time limiting - cancellable</span></td>
      </tr>
      <tr>
        <td id="L574" class="blob-num js-line-number" data-line-number="574"></td>
        <td id="LC574" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>Build an array of the cartesion transformations necessary for each increment at each radius</span></td>
      </tr>
      <tr>
        <td id="L575" class="blob-num js-line-number" data-line-number="575"></td>
        <td id="LC575" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">int</span> <span class="pl-en">buildLookUpTable</span>() {       </td>
      </tr>
      <tr>
        <td id="L576" class="blob-num js-line-number" data-line-number="576"></td>
        <td id="LC576" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Build an array to store the X and Y coordinates for each angle increment (resolution) across each radius (depth)</span></td>
      </tr>
      <tr>
        <td id="L577" class="blob-num js-line-number" data-line-number="577"></td>
        <td id="LC577" class="blob-code blob-code-inner js-file-line">        lut <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">int</span>[<span class="pl-c1">2</span>][resolution][depth];</td>
      </tr>
      <tr>
        <td id="L578" class="blob-num js-line-number" data-line-number="578"></td>
        <td id="LC578" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L579" class="blob-num js-line-number" data-line-number="579"></td>
        <td id="LC579" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Initialize a variable that will allow for measuring the maximium LUT size</span></td>
      </tr>
      <tr>
        <td id="L580" class="blob-num js-line-number" data-line-number="580"></td>
        <td id="LC580" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> maxLUT <span class="pl-k">=</span> <span class="pl-c1">0</span>;</td>
      </tr>
      <tr>
        <td id="L581" class="blob-num js-line-number" data-line-number="581"></td>
        <td id="LC581" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L582" class="blob-num js-line-number" data-line-number="582"></td>
        <td id="LC582" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Step through all radii to be sampled</span></td>
      </tr>
      <tr>
        <td id="L583" class="blob-num js-line-number" data-line-number="583"></td>
        <td id="LC583" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">for</span>(<span class="pl-k">int</span> radius <span class="pl-k">=</span> radiusMax; radius<span class="pl-k">&gt;=</span>radiusMin; radius <span class="pl-k">-=</span> radiusInc) {</td>
      </tr>
      <tr>
        <td id="L584" class="blob-num js-line-number" data-line-number="584"></td>
        <td id="LC584" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Check for interrupt</span></td>
      </tr>
      <tr>
        <td id="L585" class="blob-num js-line-number" data-line-number="585"></td>
        <td id="LC585" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(cancelThread) <span class="pl-k">return</span> <span class="pl-c1">0</span>;</td>
      </tr>
      <tr>
        <td id="L586" class="blob-num js-line-number" data-line-number="586"></td>
        <td id="LC586" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L587" class="blob-num js-line-number" data-line-number="587"></td>
        <td id="LC587" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Index counter that also tracks the largest actual LUT size (may be &lt;= resolution)</span></td>
      </tr>
      <tr>
        <td id="L588" class="blob-num js-line-number" data-line-number="588"></td>
        <td id="LC588" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">int</span> i <span class="pl-k">=</span> <span class="pl-c1">0</span>; </td>
      </tr>
      <tr>
        <td id="L589" class="blob-num js-line-number" data-line-number="589"></td>
        <td id="LC589" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">for</span>(<span class="pl-k">int</span> resStep <span class="pl-k">=</span> <span class="pl-c1">0</span>; resStep <span class="pl-k">&lt;</span> resolution; resStep<span class="pl-k">++</span>) {</td>
      </tr>
      <tr>
        <td id="L590" class="blob-num js-line-number" data-line-number="590"></td>
        <td id="LC590" class="blob-code blob-code-inner js-file-line">                </td>
      </tr>
      <tr>
        <td id="L591" class="blob-num js-line-number" data-line-number="591"></td>
        <td id="LC591" class="blob-code blob-code-inner js-file-line">                <span class="pl-c"><span class="pl-c">//</span>Calcualte the angle and corresponding X and Y displacements for the specified radius</span></td>
      </tr>
      <tr>
        <td id="L592" class="blob-num js-line-number" data-line-number="592"></td>
        <td id="LC592" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">double</span> angle <span class="pl-k">=</span> (<span class="pl-c1">2D</span><span class="pl-k">*</span><span class="pl-smi">Math</span><span class="pl-c1"><span class="pl-k">.</span>PI</span> <span class="pl-k">*</span> (<span class="pl-k">double</span>)resStep) <span class="pl-k">/</span> (<span class="pl-k">double</span>)resolution;</td>
      </tr>
      <tr>
        <td id="L593" class="blob-num js-line-number" data-line-number="593"></td>
        <td id="LC593" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">int</span> indexR <span class="pl-k">=</span> (radius<span class="pl-k">-</span>radiusMin)<span class="pl-k">/</span>radiusInc;</td>
      </tr>
      <tr>
        <td id="L594" class="blob-num js-line-number" data-line-number="594"></td>
        <td id="LC594" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">int</span> rcos <span class="pl-k">=</span> (<span class="pl-k">int</span>)<span class="pl-smi">Math</span><span class="pl-k">.</span>round ((<span class="pl-k">double</span>)radius <span class="pl-k">*</span> <span class="pl-smi">Math</span><span class="pl-k">.</span>cos (angle));</td>
      </tr>
      <tr>
        <td id="L595" class="blob-num js-line-number" data-line-number="595"></td>
        <td id="LC595" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">int</span> rsin <span class="pl-k">=</span> (<span class="pl-k">int</span>)<span class="pl-smi">Math</span><span class="pl-k">.</span>round ((<span class="pl-k">double</span>)radius <span class="pl-k">*</span> <span class="pl-smi">Math</span><span class="pl-k">.</span>sin (angle));</td>
      </tr>
      <tr>
        <td id="L596" class="blob-num js-line-number" data-line-number="596"></td>
        <td id="LC596" class="blob-code blob-code-inner js-file-line">                </td>
      </tr>
      <tr>
        <td id="L597" class="blob-num js-line-number" data-line-number="597"></td>
        <td id="LC597" class="blob-code blob-code-inner js-file-line">                <span class="pl-c"><span class="pl-c">//</span>Test to make sure that the coordinate is a new coordinate</span></td>
      </tr>
      <tr>
        <td id="L598" class="blob-num js-line-number" data-line-number="598"></td>
        <td id="LC598" class="blob-code blob-code-inner js-file-line">                <span class="pl-c"><span class="pl-c">//</span>NOTE: A continuous circle is being discretized into pixels, it is possible that small angle steps for small radii circles will occupy the same pixel.</span></td>
      </tr>
      <tr>
        <td id="L599" class="blob-num js-line-number" data-line-number="599"></td>
        <td id="LC599" class="blob-code blob-code-inner js-file-line">                <span class="pl-c"><span class="pl-c">//</span>Since there is no point in making redundant calculations, these points are excluded from the LUT</span></td>
      </tr>
      <tr>
        <td id="L600" class="blob-num js-line-number" data-line-number="600"></td>
        <td id="LC600" class="blob-code blob-code-inner js-file-line">                <span class="pl-c"><span class="pl-c">//</span>NOTE: Using the minRadius as the transform cutoff results in a strong harmonic of the image forming near the min radius</span></td>
      </tr>
      <tr>
        <td id="L601" class="blob-num js-line-number" data-line-number="601"></td>
        <td id="LC601" class="blob-code blob-code-inner js-file-line">                <span class="pl-c"><span class="pl-c">//</span>threfore, using the max will push this harmonic outside the search range.</span></td>
      </tr>
      <tr>
        <td id="L602" class="blob-num js-line-number" data-line-number="602"></td>
        <td id="LC602" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">if</span>(radius <span class="pl-k">==</span> radiusMax <span class="pl-k">&amp;&amp;</span> reduce){</td>
      </tr>
      <tr>
        <td id="L603" class="blob-num js-line-number" data-line-number="603"></td>
        <td id="LC603" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">if</span>(i <span class="pl-k">==</span> <span class="pl-c1">0</span>) {</td>
      </tr>
      <tr>
        <td id="L604" class="blob-num js-line-number" data-line-number="604"></td>
        <td id="LC604" class="blob-code blob-code-inner js-file-line">                        lut[<span class="pl-c1">0</span>][i][indexR] <span class="pl-k">=</span> rcos;</td>
      </tr>
      <tr>
        <td id="L605" class="blob-num js-line-number" data-line-number="605"></td>
        <td id="LC605" class="blob-code blob-code-inner js-file-line">                        lut[<span class="pl-c1">1</span>][i][indexR] <span class="pl-k">=</span> rsin;</td>
      </tr>
      <tr>
        <td id="L606" class="blob-num js-line-number" data-line-number="606"></td>
        <td id="LC606" class="blob-code blob-code-inner js-file-line">                        i<span class="pl-k">++</span>;</td>
      </tr>
      <tr>
        <td id="L607" class="blob-num js-line-number" data-line-number="607"></td>
        <td id="LC607" class="blob-code blob-code-inner js-file-line">                    }</td>
      </tr>
      <tr>
        <td id="L608" class="blob-num js-line-number" data-line-number="608"></td>
        <td id="LC608" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">else</span> <span class="pl-k">if</span> ((rcos <span class="pl-k">!=</span> lut[<span class="pl-c1">0</span>][i<span class="pl-k">-</span><span class="pl-c1">1</span>][indexR]) <span class="pl-k">|</span> (rsin <span class="pl-k">!=</span> lut[<span class="pl-c1">1</span>][i<span class="pl-k">-</span><span class="pl-c1">1</span>][indexR])){</td>
      </tr>
      <tr>
        <td id="L609" class="blob-num js-line-number" data-line-number="609"></td>
        <td id="LC609" class="blob-code blob-code-inner js-file-line">                        lut[<span class="pl-c1">0</span>][i][indexR] <span class="pl-k">=</span> rcos;</td>
      </tr>
      <tr>
        <td id="L610" class="blob-num js-line-number" data-line-number="610"></td>
        <td id="LC610" class="blob-code blob-code-inner js-file-line">                        lut[<span class="pl-c1">1</span>][i][indexR] <span class="pl-k">=</span> rsin;</td>
      </tr>
      <tr>
        <td id="L611" class="blob-num js-line-number" data-line-number="611"></td>
        <td id="LC611" class="blob-code blob-code-inner js-file-line">                        i<span class="pl-k">++</span>;</td>
      </tr>
      <tr>
        <td id="L612" class="blob-num js-line-number" data-line-number="612"></td>
        <td id="LC612" class="blob-code blob-code-inner js-file-line">                    }</td>
      </tr>
      <tr>
        <td id="L613" class="blob-num js-line-number" data-line-number="613"></td>
        <td id="LC613" class="blob-code blob-code-inner js-file-line">                }</td>
      </tr>
      <tr>
        <td id="L614" class="blob-num js-line-number" data-line-number="614"></td>
        <td id="LC614" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">else</span>{</td>
      </tr>
      <tr>
        <td id="L615" class="blob-num js-line-number" data-line-number="615"></td>
        <td id="LC615" class="blob-code blob-code-inner js-file-line">                    lut[<span class="pl-c1">0</span>][i][indexR] <span class="pl-k">=</span> rcos;</td>
      </tr>
      <tr>
        <td id="L616" class="blob-num js-line-number" data-line-number="616"></td>
        <td id="LC616" class="blob-code blob-code-inner js-file-line">                    lut[<span class="pl-c1">1</span>][i][indexR] <span class="pl-k">=</span> rsin;</td>
      </tr>
      <tr>
        <td id="L617" class="blob-num js-line-number" data-line-number="617"></td>
        <td id="LC617" class="blob-code blob-code-inner js-file-line">                    i<span class="pl-k">++</span>;</td>
      </tr>
      <tr>
        <td id="L618" class="blob-num js-line-number" data-line-number="618"></td>
        <td id="LC618" class="blob-code blob-code-inner js-file-line">                }</td>
      </tr>
      <tr>
        <td id="L619" class="blob-num js-line-number" data-line-number="619"></td>
        <td id="LC619" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L620" class="blob-num js-line-number" data-line-number="620"></td>
        <td id="LC620" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L621" class="blob-num js-line-number" data-line-number="621"></td>
        <td id="LC621" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>If this is the smallest radius, see how many transforms could be done, and set this as the new resolution</span></td>
      </tr>
      <tr>
        <td id="L622" class="blob-num js-line-number" data-line-number="622"></td>
        <td id="LC622" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(radius <span class="pl-k">==</span> radiusMax){</td>
      </tr>
      <tr>
        <td id="L623" class="blob-num js-line-number" data-line-number="623"></td>
        <td id="LC623" class="blob-code blob-code-inner js-file-line">                maxLUT <span class="pl-k">=</span> i;</td>
      </tr>
      <tr>
        <td id="L624" class="blob-num js-line-number" data-line-number="624"></td>
        <td id="LC624" class="blob-code blob-code-inner js-file-line">                resolution <span class="pl-k">=</span> maxLUT;             </td>
      </tr>
      <tr>
        <td id="L625" class="blob-num js-line-number" data-line-number="625"></td>
        <td id="LC625" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L626" class="blob-num js-line-number" data-line-number="626"></td>
        <td id="LC626" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L627" class="blob-num js-line-number" data-line-number="627"></td>
        <td id="LC627" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">return</span> maxLUT;</td>
      </tr>
      <tr>
        <td id="L628" class="blob-num js-line-number" data-line-number="628"></td>
        <td id="LC628" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L629" class="blob-num js-line-number" data-line-number="629"></td>
        <td id="LC629" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L630" class="blob-num js-line-number" data-line-number="630"></td>
        <td id="LC630" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>OPTIMIZED - cancellable</span></td>
      </tr>
      <tr>
        <td id="L631" class="blob-num js-line-number" data-line-number="631"></td>
        <td id="LC631" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">void</span> <span class="pl-en">houghTransform</span> () {</td>
      </tr>
      <tr>
        <td id="L632" class="blob-num js-line-number" data-line-number="632"></td>
        <td id="LC632" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Update progress bar string with current task</span></td>
      </tr>
      <tr>
        <td id="L633" class="blob-num js-line-number" data-line-number="633"></td>
        <td id="LC633" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(isGUI) publish(<span class="pl-s"><span class="pl-pds">&quot;</span>Performing full Hough transform...<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L634" class="blob-num js-line-number" data-line-number="634"></td>
        <td id="LC634" class="blob-code blob-code-inner js-file-line">        <span class="pl-c1">IJ</span><span class="pl-k">.</span>showStatus(<span class="pl-s"><span class="pl-pds">&quot;</span>Performing full Hough transform...<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L635" class="blob-num js-line-number" data-line-number="635"></td>
        <td id="LC635" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L636" class="blob-num js-line-number" data-line-number="636"></td>
        <td id="LC636" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Build an array to store the result from each thread</span></td>
      </tr>
      <tr>
        <td id="L637" class="blob-num js-line-number" data-line-number="637"></td>
        <td id="LC637" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-k">Thread</span>[] threads <span class="pl-k">=</span> newThreadArray();</td>
      </tr>
      <tr>
        <td id="L638" class="blob-num js-line-number" data-line-number="638"></td>
        <td id="LC638" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L639" class="blob-num js-line-number" data-line-number="639"></td>
        <td id="LC639" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Create an atomic integer counter that each thread can use to count through the radii</span></td>
      </tr>
      <tr>
        <td id="L640" class="blob-num js-line-number" data-line-number="640"></td>
        <td id="LC640" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">AtomicInteger</span> ai <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">AtomicInteger</span>(radiusMin);</td>
      </tr>
      <tr>
        <td id="L641" class="blob-num js-line-number" data-line-number="641"></td>
        <td id="LC641" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">AtomicInteger</span> progress <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">AtomicInteger</span>(<span class="pl-c1">0</span>);</td>
      </tr>
      <tr>
        <td id="L642" class="blob-num js-line-number" data-line-number="642"></td>
        <td id="LC642" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">AtomicInteger</span> lastProgress <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">AtomicInteger</span>(<span class="pl-c1">0</span>);</td>
      </tr>
      <tr>
        <td id="L643" class="blob-num js-line-number" data-line-number="643"></td>
        <td id="LC643" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L644" class="blob-num js-line-number" data-line-number="644"></td>
        <td id="LC644" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Create an array to store the Hough values</span></td>
      </tr>
      <tr>
        <td id="L645" class="blob-num js-line-number" data-line-number="645"></td>
        <td id="LC645" class="blob-code blob-code-inner js-file-line">        houghValues <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">int</span>[width][height][depth];</td>
      </tr>
      <tr>
        <td id="L646" class="blob-num js-line-number" data-line-number="646"></td>
        <td id="LC646" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L647" class="blob-num js-line-number" data-line-number="647"></td>
        <td id="LC647" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Create a variable for storing the total progress possible (100 = complete)</span></td>
      </tr>
      <tr>
        <td id="L648" class="blob-num js-line-number" data-line-number="648"></td>
        <td id="LC648" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Nute depth is devided by nCPUs, therefore depth*nCPUs/nCPUs = depth</span></td>
      </tr>
      <tr>
        <td id="L649" class="blob-num js-line-number" data-line-number="649"></td>
        <td id="LC649" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">double</span> totalProgress <span class="pl-k">=</span> height<span class="pl-k">*</span>depth<span class="pl-k">/</span><span class="pl-c1">100</span>;</td>
      </tr>
      <tr>
        <td id="L650" class="blob-num js-line-number" data-line-number="650"></td>
        <td id="LC650" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L651" class="blob-num js-line-number" data-line-number="651"></td>
        <td id="LC651" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Build a thread for as many CPUs as are available to the JVM </span></td>
      </tr>
      <tr>
        <td id="L652" class="blob-num js-line-number" data-line-number="652"></td>
        <td id="LC652" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">for</span> (ithread <span class="pl-k">=</span> <span class="pl-c1">0</span>; ithread <span class="pl-k">&lt;</span> threads<span class="pl-k">.</span>length; ithread<span class="pl-k">++</span>) {    </td>
      </tr>
      <tr>
        <td id="L653" class="blob-num js-line-number" data-line-number="653"></td>
        <td id="LC653" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L654" class="blob-num js-line-number" data-line-number="654"></td>
        <td id="LC654" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span> Concurrently run in as many threads as CPUs  </span></td>
      </tr>
      <tr>
        <td id="L655" class="blob-num js-line-number" data-line-number="655"></td>
        <td id="LC655" class="blob-code blob-code-inner js-file-line">            threads[ithread] <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Thread</span>() {  </td>
      </tr>
      <tr>
        <td id="L656" class="blob-num js-line-number" data-line-number="656"></td>
        <td id="LC656" class="blob-code blob-code-inner js-file-line">                          </td>
      </tr>
      <tr>
        <td id="L657" class="blob-num js-line-number" data-line-number="657"></td>
        <td id="LC657" class="blob-code blob-code-inner js-file-line">                { setPriority(<span class="pl-smi">Thread</span><span class="pl-c1"><span class="pl-k">.</span>NORM_PRIORITY</span>); }  </td>
      </tr>
      <tr>
        <td id="L658" class="blob-num js-line-number" data-line-number="658"></td>
        <td id="LC658" class="blob-code blob-code-inner js-file-line">  </td>
      </tr>
      <tr>
        <td id="L659" class="blob-num js-line-number" data-line-number="659"></td>
        <td id="LC659" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">@Override</span></td>
      </tr>
      <tr>
        <td id="L660" class="blob-num js-line-number" data-line-number="660"></td>
        <td id="LC660" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">public</span> <span class="pl-k">void</span> <span class="pl-en">run</span>() {  </td>
      </tr>
      <tr>
        <td id="L661" class="blob-num js-line-number" data-line-number="661"></td>
        <td id="LC661" class="blob-code blob-code-inner js-file-line">  </td>
      </tr>
      <tr>
        <td id="L662" class="blob-num js-line-number" data-line-number="662"></td>
        <td id="LC662" class="blob-code blob-code-inner js-file-line">                <span class="pl-c"><span class="pl-c">//</span>Divide the radius tasks across the cores available</span></td>
      </tr>
      <tr>
        <td id="L663" class="blob-num js-line-number" data-line-number="663"></td>
        <td id="LC663" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">int</span> currentProgress <span class="pl-k">=</span> <span class="pl-c1">0</span>;</td>
      </tr>
      <tr>
        <td id="L664" class="blob-num js-line-number" data-line-number="664"></td>
        <td id="LC664" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">for</span> (<span class="pl-k">int</span> radius <span class="pl-k">=</span> ai<span class="pl-k">.</span>getAndAdd(radiusInc); radius <span class="pl-k">&lt;=</span> radiusMax; radius <span class="pl-k">=</span> ai<span class="pl-k">.</span>getAndAdd(radiusInc)) {  </td>
      </tr>
      <tr>
        <td id="L665" class="blob-num js-line-number" data-line-number="665"></td>
        <td id="LC665" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">int</span> indexR<span class="pl-k">=</span>(radius<span class="pl-k">-</span>radiusMin)<span class="pl-k">/</span>radiusInc;</td>
      </tr>
      <tr>
        <td id="L666" class="blob-num js-line-number" data-line-number="666"></td>
        <td id="LC666" class="blob-code blob-code-inner js-file-line">                    <span class="pl-c"><span class="pl-c">//</span>For a given radius, transform each pixel in a circle, and add-up the votes </span></td>
      </tr>
      <tr>
        <td id="L667" class="blob-num js-line-number" data-line-number="667"></td>
        <td id="LC667" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">for</span>(<span class="pl-k">int</span> y <span class="pl-k">=</span> <span class="pl-c1">1</span>; y <span class="pl-k">&lt;</span> height<span class="pl-k">-</span><span class="pl-c1">1</span>; y<span class="pl-k">++</span>) {</td>
      </tr>
      <tr>
        <td id="L668" class="blob-num js-line-number" data-line-number="668"></td>
        <td id="LC668" class="blob-code blob-code-inner js-file-line">                        <span class="pl-c"><span class="pl-c">//</span>Increment the progress counter, and submit the current progress status</span></td>
      </tr>
      <tr>
        <td id="L669" class="blob-num js-line-number" data-line-number="669"></td>
        <td id="LC669" class="blob-code blob-code-inner js-file-line">                        progress<span class="pl-k">.</span>getAndAdd(<span class="pl-c1">1</span>);</td>
      </tr>
      <tr>
        <td id="L670" class="blob-num js-line-number" data-line-number="670"></td>
        <td id="LC670" class="blob-code blob-code-inner js-file-line">                        </td>
      </tr>
      <tr>
        <td id="L671" class="blob-num js-line-number" data-line-number="671"></td>
        <td id="LC671" class="blob-code blob-code-inner js-file-line">                        <span class="pl-c"><span class="pl-c">//</span>Calculate the current progress value</span></td>
      </tr>
      <tr>
        <td id="L672" class="blob-num js-line-number" data-line-number="672"></td>
        <td id="LC672" class="blob-code blob-code-inner js-file-line">                        currentProgress <span class="pl-k">=</span> <span class="pl-smi">Math</span><span class="pl-k">.</span>round((<span class="pl-k">float</span>) (progress<span class="pl-k">.</span>get()<span class="pl-k">/</span>totalProgress));</td>
      </tr>
      <tr>
        <td id="L673" class="blob-num js-line-number" data-line-number="673"></td>
        <td id="LC673" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L674" class="blob-num js-line-number" data-line-number="674"></td>
        <td id="LC674" class="blob-code blob-code-inner js-file-line">                        <span class="pl-c"><span class="pl-c">//</span>There is a significant time penalty for progress updates, so only update if needed</span></td>
      </tr>
      <tr>
        <td id="L675" class="blob-num js-line-number" data-line-number="675"></td>
        <td id="LC675" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">if</span>(currentProgress <span class="pl-k">&gt;</span> lastProgress<span class="pl-k">.</span>get()){ <span class="pl-c"><span class="pl-c">//</span>7.8s with if, 8.7s without if, 7.8s with no progress update, 8.7s with delay between GUI updates</span></td>
      </tr>
      <tr>
        <td id="L676" class="blob-num js-line-number" data-line-number="676"></td>
        <td id="LC676" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">if</span>(isGUI <span class="pl-k">&amp;&amp;</span> currentProgress <span class="pl-k">&lt;=</span> <span class="pl-c1">100</span>) setProgress(currentProgress);</td>
      </tr>
      <tr>
        <td id="L677" class="blob-num js-line-number" data-line-number="677"></td>
        <td id="LC677" class="blob-code blob-code-inner js-file-line">                            <span class="pl-c1">IJ</span><span class="pl-k">.</span>showProgress(currentProgress, <span class="pl-c1">100</span>);</td>
      </tr>
      <tr>
        <td id="L678" class="blob-num js-line-number" data-line-number="678"></td>
        <td id="LC678" class="blob-code blob-code-inner js-file-line">                            lastProgress<span class="pl-k">.</span>set(currentProgress);</td>
      </tr>
      <tr>
        <td id="L679" class="blob-num js-line-number" data-line-number="679"></td>
        <td id="LC679" class="blob-code blob-code-inner js-file-line">                        }</td>
      </tr>
      <tr>
        <td id="L680" class="blob-num js-line-number" data-line-number="680"></td>
        <td id="LC680" class="blob-code blob-code-inner js-file-line">                        </td>
      </tr>
      <tr>
        <td id="L681" class="blob-num js-line-number" data-line-number="681"></td>
        <td id="LC681" class="blob-code blob-code-inner js-file-line">                        <span class="pl-c"><span class="pl-c">//</span>Check for interrupt</span></td>
      </tr>
      <tr>
        <td id="L682" class="blob-num js-line-number" data-line-number="682"></td>
        <td id="LC682" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">if</span>(cancelThread) <span class="pl-k">return</span>;</td>
      </tr>
      <tr>
        <td id="L683" class="blob-num js-line-number" data-line-number="683"></td>
        <td id="LC683" class="blob-code blob-code-inner js-file-line">                       </td>
      </tr>
      <tr>
        <td id="L684" class="blob-num js-line-number" data-line-number="684"></td>
        <td id="LC684" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">for</span>(<span class="pl-k">int</span> x <span class="pl-k">=</span> <span class="pl-c1">1</span>; x <span class="pl-k">&lt;</span> width<span class="pl-k">-</span><span class="pl-c1">1</span>; x<span class="pl-k">++</span>) {</td>
      </tr>
      <tr>
        <td id="L685" class="blob-num js-line-number" data-line-number="685"></td>
        <td id="LC685" class="blob-code blob-code-inner js-file-line">                                <span class="pl-k">if</span>( imageValues[(x<span class="pl-k">+</span>offx)<span class="pl-k">+</span>(y<span class="pl-k">+</span>offy)<span class="pl-k">*</span>fullWidth] <span class="pl-k">!=</span> <span class="pl-c1">0</span> )  {<span class="pl-c"><span class="pl-c">//</span> Edge pixel found                                    </span></td>
      </tr>
      <tr>
        <td id="L686" class="blob-num js-line-number" data-line-number="686"></td>
        <td id="LC686" class="blob-code blob-code-inner js-file-line">                                    <span class="pl-k">for</span>(<span class="pl-k">int</span> i <span class="pl-k">=</span> <span class="pl-c1">0</span>; i <span class="pl-k">&lt;</span> lutSize; i<span class="pl-k">++</span>) {</td>
      </tr>
      <tr>
        <td id="L687" class="blob-num js-line-number" data-line-number="687"></td>
        <td id="LC687" class="blob-code blob-code-inner js-file-line">                                        <span class="pl-k">int</span> a <span class="pl-k">=</span> x <span class="pl-k">+</span> lut[<span class="pl-c1">1</span>][i][indexR]; </td>
      </tr>
      <tr>
        <td id="L688" class="blob-num js-line-number" data-line-number="688"></td>
        <td id="LC688" class="blob-code blob-code-inner js-file-line">                                        <span class="pl-k">int</span> b <span class="pl-k">=</span> y <span class="pl-k">+</span> lut[<span class="pl-c1">0</span>][i][indexR]; </td>
      </tr>
      <tr>
        <td id="L689" class="blob-num js-line-number" data-line-number="689"></td>
        <td id="LC689" class="blob-code blob-code-inner js-file-line">                                        <span class="pl-k">if</span>((b <span class="pl-k">&gt;=</span> <span class="pl-c1">0</span>) <span class="pl-k">&amp;</span> (b <span class="pl-k">&lt;</span> height) <span class="pl-k">&amp;</span> (a <span class="pl-k">&gt;=</span> <span class="pl-c1">0</span>) <span class="pl-k">&amp;</span> (a <span class="pl-k">&lt;</span> width)) {</td>
      </tr>
      <tr>
        <td id="L690" class="blob-num js-line-number" data-line-number="690"></td>
        <td id="LC690" class="blob-code blob-code-inner js-file-line">                                            houghValues[a][b][indexR] <span class="pl-k">+=</span> <span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L691" class="blob-num js-line-number" data-line-number="691"></td>
        <td id="LC691" class="blob-code blob-code-inner js-file-line">                                        }</td>
      </tr>
      <tr>
        <td id="L692" class="blob-num js-line-number" data-line-number="692"></td>
        <td id="LC692" class="blob-code blob-code-inner js-file-line">                                    }</td>
      </tr>
      <tr>
        <td id="L693" class="blob-num js-line-number" data-line-number="693"></td>
        <td id="LC693" class="blob-code blob-code-inner js-file-line">                                }</td>
      </tr>
      <tr>
        <td id="L694" class="blob-num js-line-number" data-line-number="694"></td>
        <td id="LC694" class="blob-code blob-code-inner js-file-line">                            }</td>
      </tr>
      <tr>
        <td id="L695" class="blob-num js-line-number" data-line-number="695"></td>
        <td id="LC695" class="blob-code blob-code-inner js-file-line">                        }</td>
      </tr>
      <tr>
        <td id="L696" class="blob-num js-line-number" data-line-number="696"></td>
        <td id="LC696" class="blob-code blob-code-inner js-file-line">                    }</td>
      </tr>
      <tr>
        <td id="L697" class="blob-num js-line-number" data-line-number="697"></td>
        <td id="LC697" class="blob-code blob-code-inner js-file-line">                }  </td>
      </tr>
      <tr>
        <td id="L698" class="blob-num js-line-number" data-line-number="698"></td>
        <td id="LC698" class="blob-code blob-code-inner js-file-line">            };  </td>
      </tr>
      <tr>
        <td id="L699" class="blob-num js-line-number" data-line-number="699"></td>
        <td id="LC699" class="blob-code blob-code-inner js-file-line">        }    </td>
      </tr>
      <tr>
        <td id="L700" class="blob-num js-line-number" data-line-number="700"></td>
        <td id="LC700" class="blob-code blob-code-inner js-file-line">        startAndJoin(threads);      </td>
      </tr>
      <tr>
        <td id="L701" class="blob-num js-line-number" data-line-number="701"></td>
        <td id="LC701" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L702" class="blob-num js-line-number" data-line-number="702"></td>
        <td id="LC702" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L703" class="blob-num js-line-number" data-line-number="703"></td>
        <td id="LC703" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>The local Hough is an inversion of the inertial reference frame used in the full Hough</span></td>
      </tr>
      <tr>
        <td id="L704" class="blob-num js-line-number" data-line-number="704"></td>
        <td id="LC704" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>In the full Hough the image is seach for pixels with a value &gt; 1, and if this is true</span></td>
      </tr>
      <tr>
        <td id="L705" class="blob-num js-line-number" data-line-number="705"></td>
        <td id="LC705" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>then the pixel is projected in a circle about that point.</span></td>
      </tr>
      <tr>
        <td id="L706" class="blob-num js-line-number" data-line-number="706"></td>
        <td id="LC706" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L707" class="blob-num js-line-number" data-line-number="707"></td>
        <td id="LC707" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>OPTMIZED - cancellable</span></td>
      </tr>
      <tr>
        <td id="L708" class="blob-num js-line-number" data-line-number="708"></td>
        <td id="LC708" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>To reduce the necessary transform space,</span></td>
      </tr>
      <tr>
        <td id="L709" class="blob-num js-line-number" data-line-number="709"></td>
        <td id="LC709" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">void</span> <span class="pl-en">localHoughTransform</span> (<span class="pl-k">int</span> <span class="pl-v">index</span>) {</td>
      </tr>
      <tr>
        <td id="L710" class="blob-num js-line-number" data-line-number="710"></td>
        <td id="LC710" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Initialize local search variables</span></td>
      </tr>
      <tr>
        <td id="L711" class="blob-num js-line-number" data-line-number="711"></td>
        <td id="LC711" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> startWidth <span class="pl-k">=</span> centerPoint[index]<span class="pl-k">.</span>x <span class="pl-k">-</span> searchRadius;</td>
      </tr>
      <tr>
        <td id="L712" class="blob-num js-line-number" data-line-number="712"></td>
        <td id="LC712" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span> (startWidth <span class="pl-k">&lt;</span> <span class="pl-c1">1</span>) startWidth <span class="pl-k">=</span> <span class="pl-c1">1</span>; <span class="pl-c"><span class="pl-c">//</span>Keep search area inside the image</span></td>
      </tr>
      <tr>
        <td id="L713" class="blob-num js-line-number" data-line-number="713"></td>
        <td id="LC713" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> endWidth <span class="pl-k">=</span> centerPoint[index]<span class="pl-k">.</span>x <span class="pl-k">+</span> searchRadius;</td>
      </tr>
      <tr>
        <td id="L714" class="blob-num js-line-number" data-line-number="714"></td>
        <td id="LC714" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span> (endWidth <span class="pl-k">&gt;</span> width) endWidth <span class="pl-k">=</span> width; <span class="pl-c"><span class="pl-c">//</span>Keep search area inside the image</span></td>
      </tr>
      <tr>
        <td id="L715" class="blob-num js-line-number" data-line-number="715"></td>
        <td id="LC715" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> lwidth <span class="pl-k">=</span> endWidth <span class="pl-k">-</span> startWidth <span class="pl-k">+</span> <span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L716" class="blob-num js-line-number" data-line-number="716"></td>
        <td id="LC716" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L717" class="blob-num js-line-number" data-line-number="717"></td>
        <td id="LC717" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> startHeight <span class="pl-k">=</span> centerPoint[index]<span class="pl-k">.</span>y <span class="pl-k">-</span> searchRadius;</td>
      </tr>
      <tr>
        <td id="L718" class="blob-num js-line-number" data-line-number="718"></td>
        <td id="LC718" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span> (startHeight <span class="pl-k">&lt;</span> <span class="pl-c1">1</span>) startHeight <span class="pl-k">=</span> <span class="pl-c1">1</span>; <span class="pl-c"><span class="pl-c">//</span>Keep search area inside the image</span></td>
      </tr>
      <tr>
        <td id="L719" class="blob-num js-line-number" data-line-number="719"></td>
        <td id="LC719" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> endHeight <span class="pl-k">=</span> centerPoint[index]<span class="pl-k">.</span>y <span class="pl-k">+</span> searchRadius;</td>
      </tr>
      <tr>
        <td id="L720" class="blob-num js-line-number" data-line-number="720"></td>
        <td id="LC720" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span> (endHeight <span class="pl-k">&gt;</span> height) endHeight <span class="pl-k">=</span> height; <span class="pl-c"><span class="pl-c">//</span>Keep search area inside the image</span></td>
      </tr>
      <tr>
        <td id="L721" class="blob-num js-line-number" data-line-number="721"></td>
        <td id="LC721" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> lheight <span class="pl-k">=</span> endHeight <span class="pl-k">-</span> startHeight <span class="pl-k">+</span> <span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L722" class="blob-num js-line-number" data-line-number="722"></td>
        <td id="LC722" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L723" class="blob-num js-line-number" data-line-number="723"></td>
        <td id="LC723" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> lradiusMin <span class="pl-k">=</span> centerRadii[index] <span class="pl-k">-</span> searchBand;</td>
      </tr>
      <tr>
        <td id="L724" class="blob-num js-line-number" data-line-number="724"></td>
        <td id="LC724" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(lradiusMin <span class="pl-k">&lt;</span> radiusMin) lradiusMin <span class="pl-k">=</span> radiusMin;</td>
      </tr>
      <tr>
        <td id="L725" class="blob-num js-line-number" data-line-number="725"></td>
        <td id="LC725" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> lradiusMax <span class="pl-k">=</span> centerRadii[index] <span class="pl-k">+</span> searchBand;</td>
      </tr>
      <tr>
        <td id="L726" class="blob-num js-line-number" data-line-number="726"></td>
        <td id="LC726" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(lradiusMax <span class="pl-k">&gt;</span> radiusMax) lradiusMax <span class="pl-k">=</span> radiusMax;</td>
      </tr>
      <tr>
        <td id="L727" class="blob-num js-line-number" data-line-number="727"></td>
        <td id="LC727" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> ldepth <span class="pl-k">=</span> ((lradiusMax<span class="pl-k">-</span>lradiusMin)<span class="pl-k">/</span>radiusInc)<span class="pl-k">+</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L728" class="blob-num js-line-number" data-line-number="728"></td>
        <td id="LC728" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L729" class="blob-num js-line-number" data-line-number="729"></td>
        <td id="LC729" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Store local Hough parameters into array</span></td>
      </tr>
      <tr>
        <td id="L730" class="blob-num js-line-number" data-line-number="730"></td>
        <td id="LC730" class="blob-code blob-code-inner js-file-line">        localHoughParameters[index][<span class="pl-c1">0</span>] <span class="pl-k">=</span> startWidth;</td>
      </tr>
      <tr>
        <td id="L731" class="blob-num js-line-number" data-line-number="731"></td>
        <td id="LC731" class="blob-code blob-code-inner js-file-line">        localHoughParameters[index][<span class="pl-c1">1</span>] <span class="pl-k">=</span> endWidth;</td>
      </tr>
      <tr>
        <td id="L732" class="blob-num js-line-number" data-line-number="732"></td>
        <td id="LC732" class="blob-code blob-code-inner js-file-line">        localHoughParameters[index][<span class="pl-c1">2</span>] <span class="pl-k">=</span> lwidth;</td>
      </tr>
      <tr>
        <td id="L733" class="blob-num js-line-number" data-line-number="733"></td>
        <td id="LC733" class="blob-code blob-code-inner js-file-line">        localHoughParameters[index][<span class="pl-c1">3</span>] <span class="pl-k">=</span> startHeight;</td>
      </tr>
      <tr>
        <td id="L734" class="blob-num js-line-number" data-line-number="734"></td>
        <td id="LC734" class="blob-code blob-code-inner js-file-line">        localHoughParameters[index][<span class="pl-c1">4</span>] <span class="pl-k">=</span> endHeight;</td>
      </tr>
      <tr>
        <td id="L735" class="blob-num js-line-number" data-line-number="735"></td>
        <td id="LC735" class="blob-code blob-code-inner js-file-line">        localHoughParameters[index][<span class="pl-c1">5</span>] <span class="pl-k">=</span> lheight;</td>
      </tr>
      <tr>
        <td id="L736" class="blob-num js-line-number" data-line-number="736"></td>
        <td id="LC736" class="blob-code blob-code-inner js-file-line">        localHoughParameters[index][<span class="pl-c1">6</span>] <span class="pl-k">=</span> lradiusMin;</td>
      </tr>
      <tr>
        <td id="L737" class="blob-num js-line-number" data-line-number="737"></td>
        <td id="LC737" class="blob-code blob-code-inner js-file-line">        localHoughParameters[index][<span class="pl-c1">7</span>] <span class="pl-k">=</span> lradiusMax;</td>
      </tr>
      <tr>
        <td id="L738" class="blob-num js-line-number" data-line-number="738"></td>
        <td id="LC738" class="blob-code blob-code-inner js-file-line">        localHoughParameters[index][<span class="pl-c1">8</span>] <span class="pl-k">=</span> ldepth;</td>
      </tr>
      <tr>
        <td id="L739" class="blob-num js-line-number" data-line-number="739"></td>
        <td id="LC739" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L740" class="blob-num js-line-number" data-line-number="740"></td>
        <td id="LC740" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Divide the radius tasks across the cores available</span></td>
      </tr>
      <tr>
        <td id="L741" class="blob-num js-line-number" data-line-number="741"></td>
        <td id="LC741" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">for</span> (<span class="pl-k">int</span> radius <span class="pl-k">=</span> lradiusMin; radius <span class="pl-k">&lt;=</span> lradiusMax; radius <span class="pl-k">+=</span> radiusInc) { </td>
      </tr>
      <tr>
        <td id="L742" class="blob-num js-line-number" data-line-number="742"></td>
        <td id="LC742" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">int</span> indexR<span class="pl-k">=</span>(radius<span class="pl-k">-</span>lradiusMin)<span class="pl-k">/</span>radiusInc;</td>
      </tr>
      <tr>
        <td id="L743" class="blob-num js-line-number" data-line-number="743"></td>
        <td id="LC743" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>For a given radius, transform each pixel in a circle, and add-up the votes </span></td>
      </tr>
      <tr>
        <td id="L744" class="blob-num js-line-number" data-line-number="744"></td>
        <td id="LC744" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">for</span>(<span class="pl-k">int</span> y <span class="pl-k">=</span> startHeight; y <span class="pl-k">&lt;</span> endHeight<span class="pl-k">-</span><span class="pl-c1">1</span>; y<span class="pl-k">++</span>) {</td>
      </tr>
      <tr>
        <td id="L745" class="blob-num js-line-number" data-line-number="745"></td>
        <td id="LC745" class="blob-code blob-code-inner js-file-line">                </td>
      </tr>
      <tr>
        <td id="L746" class="blob-num js-line-number" data-line-number="746"></td>
        <td id="LC746" class="blob-code blob-code-inner js-file-line">                <span class="pl-c"><span class="pl-c">//</span>Check for interrupt</span></td>
      </tr>
      <tr>
        <td id="L747" class="blob-num js-line-number" data-line-number="747"></td>
        <td id="LC747" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">if</span>(cancelThread) <span class="pl-k">return</span>;</td>
      </tr>
      <tr>
        <td id="L748" class="blob-num js-line-number" data-line-number="748"></td>
        <td id="LC748" class="blob-code blob-code-inner js-file-line">                </td>
      </tr>
      <tr>
        <td id="L749" class="blob-num js-line-number" data-line-number="749"></td>
        <td id="LC749" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">for</span>(<span class="pl-k">int</span> x <span class="pl-k">=</span> startWidth; x <span class="pl-k">&lt;</span> endWidth<span class="pl-k">-</span><span class="pl-c1">1</span>; x<span class="pl-k">++</span>) {</td>
      </tr>
      <tr>
        <td id="L750" class="blob-num js-line-number" data-line-number="750"></td>
        <td id="LC750" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">for</span>(<span class="pl-k">int</span> i <span class="pl-k">=</span> <span class="pl-c1">0</span>; i <span class="pl-k">&lt;</span> lutSize; i<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L751" class="blob-num js-line-number" data-line-number="751"></td>
        <td id="LC751" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">int</span> a <span class="pl-k">=</span> x <span class="pl-k">+</span> offx <span class="pl-k">+</span> lut[<span class="pl-c1">1</span>][i][indexR<span class="pl-k">+</span>((lradiusMin<span class="pl-k">-</span>radiusMin)<span class="pl-k">/</span>radiusInc)]; </td>
      </tr>
      <tr>
        <td id="L752" class="blob-num js-line-number" data-line-number="752"></td>
        <td id="LC752" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">int</span> b <span class="pl-k">=</span> y <span class="pl-k">+</span> offy <span class="pl-k">+</span> lut[<span class="pl-c1">0</span>][i][indexR<span class="pl-k">+</span>((lradiusMin<span class="pl-k">-</span>radiusMin)<span class="pl-k">/</span>radiusInc)];</td>
      </tr>
      <tr>
        <td id="L753" class="blob-num js-line-number" data-line-number="753"></td>
        <td id="LC753" class="blob-code blob-code-inner js-file-line">                        </td>
      </tr>
      <tr>
        <td id="L754" class="blob-num js-line-number" data-line-number="754"></td>
        <td id="LC754" class="blob-code blob-code-inner js-file-line">                        <span class="pl-c"><span class="pl-c">//</span>Check to make sure pixel is within the image</span></td>
      </tr>
      <tr>
        <td id="L755" class="blob-num js-line-number" data-line-number="755"></td>
        <td id="LC755" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">if</span>((a<span class="pl-k">&gt;</span><span class="pl-c1">1</span>) <span class="pl-k">&amp;</span> (a<span class="pl-k">&lt;</span>fullWidth<span class="pl-k">-</span><span class="pl-c1">1</span>) <span class="pl-k">&amp;</span> (b<span class="pl-k">&gt;</span><span class="pl-c1">1</span>) <span class="pl-k">&amp;</span> (b<span class="pl-k">&lt;</span>fullHeight<span class="pl-k">-</span><span class="pl-c1">1</span>)){</td>
      </tr>
      <tr>
        <td id="L756" class="blob-num js-line-number" data-line-number="756"></td>
        <td id="LC756" class="blob-code blob-code-inner js-file-line">                            <span class="pl-c"><span class="pl-c">//</span>See if the pixel has an intensity &gt; 1, if so, add 1 to the vote</span></td>
      </tr>
      <tr>
        <td id="L757" class="blob-num js-line-number" data-line-number="757"></td>
        <td id="LC757" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">if</span>(imageValues[a <span class="pl-k">+</span> (b<span class="pl-k">*</span>fullWidth)] <span class="pl-k">&gt;</span> <span class="pl-c1">0</span> ){</td>
      </tr>
      <tr>
        <td id="L758" class="blob-num js-line-number" data-line-number="758"></td>
        <td id="LC758" class="blob-code blob-code-inner js-file-line">                                localHoughValues[index][x<span class="pl-k">-</span>startWidth][y<span class="pl-k">-</span>startHeight][indexR] <span class="pl-k">+=</span> <span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L759" class="blob-num js-line-number" data-line-number="759"></td>
        <td id="LC759" class="blob-code blob-code-inner js-file-line">                            } </td>
      </tr>
      <tr>
        <td id="L760" class="blob-num js-line-number" data-line-number="760"></td>
        <td id="LC760" class="blob-code blob-code-inner js-file-line">                        }</td>
      </tr>
      <tr>
        <td id="L761" class="blob-num js-line-number" data-line-number="761"></td>
        <td id="LC761" class="blob-code blob-code-inner js-file-line">                    }</td>
      </tr>
      <tr>
        <td id="L762" class="blob-num js-line-number" data-line-number="762"></td>
        <td id="LC762" class="blob-code blob-code-inner js-file-line">                }</td>
      </tr>
      <tr>
        <td id="L763" class="blob-num js-line-number" data-line-number="763"></td>
        <td id="LC763" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L764" class="blob-num js-line-number" data-line-number="764"></td>
        <td id="LC764" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L765" class="blob-num js-line-number" data-line-number="765"></td>
        <td id="LC765" class="blob-code blob-code-inner js-file-line">    }  </td>
      </tr>
      <tr>
        <td id="L766" class="blob-num js-line-number" data-line-number="766"></td>
        <td id="LC766" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L767" class="blob-num js-line-number" data-line-number="767"></td>
        <td id="LC767" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>OPTMIZED - cancellable</span></td>
      </tr>
      <tr>
        <td id="L768" class="blob-num js-line-number" data-line-number="768"></td>
        <td id="LC768" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>Find the largest Hough pixel in the 3D Hough transform array to scale the 8-bit conversion</span></td>
      </tr>
      <tr>
        <td id="L769" class="blob-num js-line-number" data-line-number="769"></td>
        <td id="LC769" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">void</span> <span class="pl-en">houghMaximum</span> () {</td>
      </tr>
      <tr>
        <td id="L770" class="blob-num js-line-number" data-line-number="770"></td>
        <td id="LC770" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>long startTime = System.currentTimeMillis(); //1337ms without multi, 319ms with multi, 175ms by writing to private variable per thread</span></td>
      </tr>
      <tr>
        <td id="L771" class="blob-num js-line-number" data-line-number="771"></td>
        <td id="LC771" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Build an array to store the result from each thread</span></td>
      </tr>
      <tr>
        <td id="L772" class="blob-num js-line-number" data-line-number="772"></td>
        <td id="LC772" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-k">Thread</span>[] threads <span class="pl-k">=</span> newThreadArray();</td>
      </tr>
      <tr>
        <td id="L773" class="blob-num js-line-number" data-line-number="773"></td>
        <td id="LC773" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L774" class="blob-num js-line-number" data-line-number="774"></td>
        <td id="LC774" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Build an array to store the max from each thread</span></td>
      </tr>
      <tr>
        <td id="L775" class="blob-num js-line-number" data-line-number="775"></td>
        <td id="LC775" class="blob-code blob-code-inner js-file-line">        maxHoughArray <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">int</span>[threads<span class="pl-k">.</span>length][<span class="pl-c1">4</span>];</td>
      </tr>
      <tr>
        <td id="L776" class="blob-num js-line-number" data-line-number="776"></td>
        <td id="LC776" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L777" class="blob-num js-line-number" data-line-number="777"></td>
        <td id="LC777" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Create an atomic integer counter that each thread can use to count through the radii</span></td>
      </tr>
      <tr>
        <td id="L778" class="blob-num js-line-number" data-line-number="778"></td>
        <td id="LC778" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">AtomicInteger</span> ai <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">AtomicInteger</span>(<span class="pl-c1">0</span>);</td>
      </tr>
      <tr>
        <td id="L779" class="blob-num js-line-number" data-line-number="779"></td>
        <td id="LC779" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">AtomicInteger</span> progress <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">AtomicInteger</span>(<span class="pl-c1">0</span>);</td>
      </tr>
      <tr>
        <td id="L780" class="blob-num js-line-number" data-line-number="780"></td>
        <td id="LC780" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">AtomicInteger</span> lastProgress <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">AtomicInteger</span>(<span class="pl-c1">0</span>);</td>
      </tr>
      <tr>
        <td id="L781" class="blob-num js-line-number" data-line-number="781"></td>
        <td id="LC781" class="blob-code blob-code-inner js-file-line">                 </td>
      </tr>
      <tr>
        <td id="L782" class="blob-num js-line-number" data-line-number="782"></td>
        <td id="LC782" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Create an integer for indexing the results array (one result per thread</span></td>
      </tr>
      <tr>
        <td id="L783" class="blob-num js-line-number" data-line-number="783"></td>
        <td id="LC783" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">AtomicInteger</span> <span class="pl-smi">Index</span> <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">AtomicInteger</span>(<span class="pl-c1">0</span>);</td>
      </tr>
      <tr>
        <td id="L784" class="blob-num js-line-number" data-line-number="784"></td>
        <td id="LC784" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L785" class="blob-num js-line-number" data-line-number="785"></td>
        <td id="LC785" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Create a variable for storing the total progress possible (100 = complete)</span></td>
      </tr>
      <tr>
        <td id="L786" class="blob-num js-line-number" data-line-number="786"></td>
        <td id="LC786" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Nute depth is devided by nCPUs, therefore depth*nCPUs/nCPUs = depth</span></td>
      </tr>
      <tr>
        <td id="L787" class="blob-num js-line-number" data-line-number="787"></td>
        <td id="LC787" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">double</span> totalProgress <span class="pl-k">=</span> height<span class="pl-k">*</span>depth<span class="pl-k">/</span><span class="pl-c1">100</span>;</td>
      </tr>
      <tr>
        <td id="L788" class="blob-num js-line-number" data-line-number="788"></td>
        <td id="LC788" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L789" class="blob-num js-line-number" data-line-number="789"></td>
        <td id="LC789" class="blob-code blob-code-inner js-file-line">        maxHough <span class="pl-k">=</span> <span class="pl-c1">0</span>;</td>
      </tr>
      <tr>
        <td id="L790" class="blob-num js-line-number" data-line-number="790"></td>
        <td id="LC790" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L791" class="blob-num js-line-number" data-line-number="791"></td>
        <td id="LC791" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Build a thread for as many CPUs as are available to the JVM </span></td>
      </tr>
      <tr>
        <td id="L792" class="blob-num js-line-number" data-line-number="792"></td>
        <td id="LC792" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">for</span> (ithread <span class="pl-k">=</span> <span class="pl-c1">0</span>; ithread <span class="pl-k">&lt;</span> threads<span class="pl-k">.</span>length; ithread<span class="pl-k">++</span>) {    </td>
      </tr>
      <tr>
        <td id="L793" class="blob-num js-line-number" data-line-number="793"></td>
        <td id="LC793" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L794" class="blob-num js-line-number" data-line-number="794"></td>
        <td id="LC794" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span> Concurrently run in as many threads as CPUs  </span></td>
      </tr>
      <tr>
        <td id="L795" class="blob-num js-line-number" data-line-number="795"></td>
        <td id="LC795" class="blob-code blob-code-inner js-file-line">            threads[ithread] <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Thread</span>() {  </td>
      </tr>
      <tr>
        <td id="L796" class="blob-num js-line-number" data-line-number="796"></td>
        <td id="LC796" class="blob-code blob-code-inner js-file-line">                          </td>
      </tr>
      <tr>
        <td id="L797" class="blob-num js-line-number" data-line-number="797"></td>
        <td id="LC797" class="blob-code blob-code-inner js-file-line">                { setPriority(<span class="pl-smi">Thread</span><span class="pl-c1"><span class="pl-k">.</span>NORM_PRIORITY</span>); }  </td>
      </tr>
      <tr>
        <td id="L798" class="blob-num js-line-number" data-line-number="798"></td>
        <td id="LC798" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L799" class="blob-num js-line-number" data-line-number="799"></td>
        <td id="LC799" class="blob-code blob-code-inner js-file-line">                <span class="pl-c"><span class="pl-c">//</span>Search for the largest score with each thread</span></td>
      </tr>
      <tr>
        <td id="L800" class="blob-num js-line-number" data-line-number="800"></td>
        <td id="LC800" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">@Override</span></td>
      </tr>
      <tr>
        <td id="L801" class="blob-num js-line-number" data-line-number="801"></td>
        <td id="LC801" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">public</span> <span class="pl-k">void</span> <span class="pl-en">run</span>() {</td>
      </tr>
      <tr>
        <td id="L802" class="blob-num js-line-number" data-line-number="802"></td>
        <td id="LC802" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">int</span> maxHoughThread <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L803" class="blob-num js-line-number" data-line-number="803"></td>
        <td id="LC803" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">int</span> maxRadiusThread <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L804" class="blob-num js-line-number" data-line-number="804"></td>
        <td id="LC804" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">int</span> currentProgress <span class="pl-k">=</span> <span class="pl-c1">0</span>;</td>
      </tr>
      <tr>
        <td id="L805" class="blob-num js-line-number" data-line-number="805"></td>
        <td id="LC805" class="blob-code blob-code-inner js-file-line">                    <span class="pl-smi">Point</span> maxPointThread <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Point</span> (<span class="pl-k">-</span><span class="pl-c1">1</span>,<span class="pl-k">-</span><span class="pl-c1">1</span>);</td>
      </tr>
      <tr>
        <td id="L806" class="blob-num js-line-number" data-line-number="806"></td>
        <td id="LC806" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">for</span>(<span class="pl-k">int</span> a<span class="pl-k">=</span>ai<span class="pl-k">.</span>getAndIncrement(); a<span class="pl-k">&lt;</span>depth; a<span class="pl-k">=</span>ai<span class="pl-k">.</span>getAndIncrement()){</td>
      </tr>
      <tr>
        <td id="L807" class="blob-num js-line-number" data-line-number="807"></td>
        <td id="LC807" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">for</span>(<span class="pl-k">int</span> j <span class="pl-k">=</span> <span class="pl-c1">0</span>; j <span class="pl-k">&lt;</span> height; j<span class="pl-k">++</span>) {</td>
      </tr>
      <tr>
        <td id="L808" class="blob-num js-line-number" data-line-number="808"></td>
        <td id="LC808" class="blob-code blob-code-inner js-file-line">                            <span class="pl-c"><span class="pl-c">//</span>Increment the progress counter, and submit the current progress status</span></td>
      </tr>
      <tr>
        <td id="L809" class="blob-num js-line-number" data-line-number="809"></td>
        <td id="LC809" class="blob-code blob-code-inner js-file-line">                            progress<span class="pl-k">.</span>getAndAdd(<span class="pl-c1">1</span>);</td>
      </tr>
      <tr>
        <td id="L810" class="blob-num js-line-number" data-line-number="810"></td>
        <td id="LC810" class="blob-code blob-code-inner js-file-line">                            </td>
      </tr>
      <tr>
        <td id="L811" class="blob-num js-line-number" data-line-number="811"></td>
        <td id="LC811" class="blob-code blob-code-inner js-file-line">                            <span class="pl-c"><span class="pl-c">//</span>Gui updates can be time intensive, so only update at fixed time intervals</span></td>
      </tr>
      <tr>
        <td id="L812" class="blob-num js-line-number" data-line-number="812"></td>
        <td id="LC812" class="blob-code blob-code-inner js-file-line">                            currentProgress <span class="pl-k">=</span> <span class="pl-smi">Math</span><span class="pl-k">.</span>round((<span class="pl-k">float</span>) (progress<span class="pl-k">.</span>get()<span class="pl-k">/</span>totalProgress));</td>
      </tr>
      <tr>
        <td id="L813" class="blob-num js-line-number" data-line-number="813"></td>
        <td id="LC813" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L814" class="blob-num js-line-number" data-line-number="814"></td>
        <td id="LC814" class="blob-code blob-code-inner js-file-line">                            <span class="pl-c"><span class="pl-c">//</span>There is a significant time penalty for progress updates, so only update if needed</span></td>
      </tr>
      <tr>
        <td id="L815" class="blob-num js-line-number" data-line-number="815"></td>
        <td id="LC815" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">if</span>(currentProgress <span class="pl-k">&gt;</span> lastProgress<span class="pl-k">.</span>get() <span class="pl-k">&amp;</span> currentProgress <span class="pl-k">&gt;=</span> <span class="pl-c1">0</span> <span class="pl-k">&amp;</span> currentProgress <span class="pl-k">&lt;=</span> <span class="pl-c1">100</span>){ <span class="pl-c"><span class="pl-c">//</span>7.8s with if, 8.7s without if, 7.8s with no progress update, 8.7s with delay between GUI updates</span></td>
      </tr>
      <tr>
        <td id="L816" class="blob-num js-line-number" data-line-number="816"></td>
        <td id="LC816" class="blob-code blob-code-inner js-file-line">                                <span class="pl-k">if</span>(isGUI) setProgress(currentProgress);</td>
      </tr>
      <tr>
        <td id="L817" class="blob-num js-line-number" data-line-number="817"></td>
        <td id="LC817" class="blob-code blob-code-inner js-file-line">                                <span class="pl-c1">IJ</span><span class="pl-k">.</span>showProgress(currentProgress, <span class="pl-c1">100</span>);</td>
      </tr>
      <tr>
        <td id="L818" class="blob-num js-line-number" data-line-number="818"></td>
        <td id="LC818" class="blob-code blob-code-inner js-file-line">                                lastProgress<span class="pl-k">.</span>set(currentProgress);</td>
      </tr>
      <tr>
        <td id="L819" class="blob-num js-line-number" data-line-number="819"></td>
        <td id="LC819" class="blob-code blob-code-inner js-file-line">                            }</td>
      </tr>
      <tr>
        <td id="L820" class="blob-num js-line-number" data-line-number="820"></td>
        <td id="LC820" class="blob-code blob-code-inner js-file-line">                            </td>
      </tr>
      <tr>
        <td id="L821" class="blob-num js-line-number" data-line-number="821"></td>
        <td id="LC821" class="blob-code blob-code-inner js-file-line">                            <span class="pl-c"><span class="pl-c">//</span>Check for interrupt</span></td>
      </tr>
      <tr>
        <td id="L822" class="blob-num js-line-number" data-line-number="822"></td>
        <td id="LC822" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">if</span>(cancelThread) <span class="pl-k">return</span>;</td>
      </tr>
      <tr>
        <td id="L823" class="blob-num js-line-number" data-line-number="823"></td>
        <td id="LC823" class="blob-code blob-code-inner js-file-line">                           </td>
      </tr>
      <tr>
        <td id="L824" class="blob-num js-line-number" data-line-number="824"></td>
        <td id="LC824" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">for</span>(<span class="pl-k">int</span> k <span class="pl-k">=</span> <span class="pl-c1">0</span>; k <span class="pl-k">&lt;</span> width; k<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L825" class="blob-num js-line-number" data-line-number="825"></td>
        <td id="LC825" class="blob-code blob-code-inner js-file-line">                                <span class="pl-k">if</span>(houghValues[k][j][a] <span class="pl-k">&gt;</span> maxHoughThread) {</td>
      </tr>
      <tr>
        <td id="L826" class="blob-num js-line-number" data-line-number="826"></td>
        <td id="LC826" class="blob-code blob-code-inner js-file-line">                                    maxHoughThread <span class="pl-k">=</span> houghValues[k][j][a];</td>
      </tr>
      <tr>
        <td id="L827" class="blob-num js-line-number" data-line-number="827"></td>
        <td id="LC827" class="blob-code blob-code-inner js-file-line">                                    maxPointThread <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Point</span>(k,j);</td>
      </tr>
      <tr>
        <td id="L828" class="blob-num js-line-number" data-line-number="828"></td>
        <td id="LC828" class="blob-code blob-code-inner js-file-line">                                    maxRadiusThread <span class="pl-k">=</span> a<span class="pl-k">*</span>radiusInc <span class="pl-k">+</span> radiusMin;</td>
      </tr>
      <tr>
        <td id="L829" class="blob-num js-line-number" data-line-number="829"></td>
        <td id="LC829" class="blob-code blob-code-inner js-file-line">                                }</td>
      </tr>
      <tr>
        <td id="L830" class="blob-num js-line-number" data-line-number="830"></td>
        <td id="LC830" class="blob-code blob-code-inner js-file-line">                            }</td>
      </tr>
      <tr>
        <td id="L831" class="blob-num js-line-number" data-line-number="831"></td>
        <td id="LC831" class="blob-code blob-code-inner js-file-line">                        }</td>
      </tr>
      <tr>
        <td id="L832" class="blob-num js-line-number" data-line-number="832"></td>
        <td id="LC832" class="blob-code blob-code-inner js-file-line">                    }</td>
      </tr>
      <tr>
        <td id="L833" class="blob-num js-line-number" data-line-number="833"></td>
        <td id="LC833" class="blob-code blob-code-inner js-file-line">                    <span class="pl-c"><span class="pl-c">//</span>Have each thread report the score to a common array</span></td>
      </tr>
      <tr>
        <td id="L834" class="blob-num js-line-number" data-line-number="834"></td>
        <td id="LC834" class="blob-code blob-code-inner js-file-line">                    maxHoughArray[<span class="pl-smi">Index</span><span class="pl-k">.</span>getAndIncrement()] <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">int</span>[]{maxHoughThread, maxRadiusThread, maxPointThread<span class="pl-k">.</span>x, maxPointThread<span class="pl-k">.</span>y};                    </td>
      </tr>
      <tr>
        <td id="L835" class="blob-num js-line-number" data-line-number="835"></td>
        <td id="LC835" class="blob-code blob-code-inner js-file-line">                }</td>
      </tr>
      <tr>
        <td id="L836" class="blob-num js-line-number" data-line-number="836"></td>
        <td id="LC836" class="blob-code blob-code-inner js-file-line">            };</td>
      </tr>
      <tr>
        <td id="L837" class="blob-num js-line-number" data-line-number="837"></td>
        <td id="LC837" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L838" class="blob-num js-line-number" data-line-number="838"></td>
        <td id="LC838" class="blob-code blob-code-inner js-file-line">        startAndJoin(threads);</td>
      </tr>
      <tr>
        <td id="L839" class="blob-num js-line-number" data-line-number="839"></td>
        <td id="LC839" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L840" class="blob-num js-line-number" data-line-number="840"></td>
        <td id="LC840" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Search common array for highest score</span></td>
      </tr>
      <tr>
        <td id="L841" class="blob-num js-line-number" data-line-number="841"></td>
        <td id="LC841" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">for</span> (<span class="pl-k">int</span>[] maxHoughArray1 <span class="pl-k">:</span> maxHoughArray) {</td>
      </tr>
      <tr>
        <td id="L842" class="blob-num js-line-number" data-line-number="842"></td>
        <td id="LC842" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span> (maxHoughArray1[<span class="pl-c1">0</span>] <span class="pl-k">&gt;</span> maxHough) {</td>
      </tr>
      <tr>
        <td id="L843" class="blob-num js-line-number" data-line-number="843"></td>
        <td id="LC843" class="blob-code blob-code-inner js-file-line">                maxHough <span class="pl-k">=</span> maxHoughArray1[<span class="pl-c1">0</span>];</td>
      </tr>
      <tr>
        <td id="L844" class="blob-num js-line-number" data-line-number="844"></td>
        <td id="LC844" class="blob-code blob-code-inner js-file-line">                maxRadius <span class="pl-k">=</span> maxHoughArray1[<span class="pl-c1">1</span>];</td>
      </tr>
      <tr>
        <td id="L845" class="blob-num js-line-number" data-line-number="845"></td>
        <td id="LC845" class="blob-code blob-code-inner js-file-line">                maxPoint <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Point</span>((<span class="pl-k">int</span>) maxHoughArray1[<span class="pl-c1">2</span>], (<span class="pl-k">int</span>) maxHoughArray1[<span class="pl-c1">3</span>]);    </td>
      </tr>
      <tr>
        <td id="L846" class="blob-num js-line-number" data-line-number="846"></td>
        <td id="LC846" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L847" class="blob-num js-line-number" data-line-number="847"></td>
        <td id="LC847" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L848" class="blob-num js-line-number" data-line-number="848"></td>
        <td id="LC848" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L849" class="blob-num js-line-number" data-line-number="849"></td>
        <td id="LC849" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L850" class="blob-num js-line-number" data-line-number="850"></td>
        <td id="LC850" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>OPTMIZED - cancellable</span></td>
      </tr>
      <tr>
        <td id="L851" class="blob-num js-line-number" data-line-number="851"></td>
        <td id="LC851" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>Create a Hough stack series using the local transforms</span></td>
      </tr>
      <tr>
        <td id="L852" class="blob-num js-line-number" data-line-number="852"></td>
        <td id="LC852" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">void</span> <span class="pl-en">convertLocaltoFullHough</span>(<span class="pl-k">int</span> <span class="pl-v">slice</span>, <span class="pl-smi">ImageStack</span> <span class="pl-v">houghStack</span>){</td>
      </tr>
      <tr>
        <td id="L853" class="blob-num js-line-number" data-line-number="853"></td>
        <td id="LC853" class="blob-code blob-code-inner js-file-line">       </td>
      </tr>
      <tr>
        <td id="L854" class="blob-num js-line-number" data-line-number="854"></td>
        <td id="LC854" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L855" class="blob-num js-line-number" data-line-number="855"></td>
        <td id="LC855" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> startFrame <span class="pl-k">=</span> ((slice<span class="pl-k">-</span><span class="pl-c1">1</span>)<span class="pl-k">*</span>depth);</td>
      </tr>
      <tr>
        <td id="L856" class="blob-num js-line-number" data-line-number="856"></td>
        <td id="LC856" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L857" class="blob-num js-line-number" data-line-number="857"></td>
        <td id="LC857" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Create an array to store the Hough values</span></td>
      </tr>
      <tr>
        <td id="L858" class="blob-num js-line-number" data-line-number="858"></td>
        <td id="LC858" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">byte</span> localHoughPixels[][] <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">byte</span>[depth][width<span class="pl-k">*</span>height];</td>
      </tr>
      <tr>
        <td id="L859" class="blob-num js-line-number" data-line-number="859"></td>
        <td id="LC859" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L860" class="blob-num js-line-number" data-line-number="860"></td>
        <td id="LC860" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>NOTE: Only do multithreading if the problem is sufficiently complex</span></td>
      </tr>
      <tr>
        <td id="L861" class="blob-num js-line-number" data-line-number="861"></td>
        <td id="LC861" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(localHoughParameters<span class="pl-k">.</span>length <span class="pl-k">&lt;</span> <span class="pl-c1">2</span> <span class="pl-k">&amp;</span> localHoughParameters<span class="pl-k">.</span>length<span class="pl-k">*</span>searchBand<span class="pl-k">*</span>searchRadius<span class="pl-k">*</span>searchRadius <span class="pl-k">&lt;</span> <span class="pl-c1">15000</span>){</td>
      </tr>
      <tr>
        <td id="L862" class="blob-num js-line-number" data-line-number="862"></td>
        <td id="LC862" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Extract the local search parameters</span></td>
      </tr>
      <tr>
        <td id="L863" class="blob-num js-line-number" data-line-number="863"></td>
        <td id="LC863" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Divide the task so that each core works on a subset of circles</span></td>
      </tr>
      <tr>
        <td id="L864" class="blob-num js-line-number" data-line-number="864"></td>
        <td id="LC864" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">for</span>(<span class="pl-k">int</span> circleNum <span class="pl-k">=</span> <span class="pl-c1">0</span>; circleNum <span class="pl-k">&lt;</span> localHoughParameters<span class="pl-k">.</span>length; circleNum<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L865" class="blob-num js-line-number" data-line-number="865"></td>
        <td id="LC865" class="blob-code blob-code-inner js-file-line">                <span class="pl-c"><span class="pl-c">//</span>Extract the local search parameters</span></td>
      </tr>
      <tr>
        <td id="L866" class="blob-num js-line-number" data-line-number="866"></td>
        <td id="LC866" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">int</span> startWidth <span class="pl-k">=</span> localHoughParameters[circleNum][<span class="pl-c1">0</span>];</td>
      </tr>
      <tr>
        <td id="L867" class="blob-num js-line-number" data-line-number="867"></td>
        <td id="LC867" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">int</span> endWidth <span class="pl-k">=</span> localHoughParameters[circleNum][<span class="pl-c1">1</span>];</td>
      </tr>
      <tr>
        <td id="L868" class="blob-num js-line-number" data-line-number="868"></td>
        <td id="LC868" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">int</span> lwidth <span class="pl-k">=</span> localHoughParameters[circleNum][<span class="pl-c1">2</span>];</td>
      </tr>
      <tr>
        <td id="L869" class="blob-num js-line-number" data-line-number="869"></td>
        <td id="LC869" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">int</span> startHeight <span class="pl-k">=</span> localHoughParameters[circleNum][<span class="pl-c1">3</span>];</td>
      </tr>
      <tr>
        <td id="L870" class="blob-num js-line-number" data-line-number="870"></td>
        <td id="LC870" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">int</span> endHeight <span class="pl-k">=</span> localHoughParameters[circleNum][<span class="pl-c1">4</span>];</td>
      </tr>
      <tr>
        <td id="L871" class="blob-num js-line-number" data-line-number="871"></td>
        <td id="LC871" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">int</span> lheight <span class="pl-k">=</span> localHoughParameters[circleNum][<span class="pl-c1">5</span>];</td>
      </tr>
      <tr>
        <td id="L872" class="blob-num js-line-number" data-line-number="872"></td>
        <td id="LC872" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">int</span> lradiusMin <span class="pl-k">=</span> localHoughParameters[circleNum][<span class="pl-c1">6</span>];</td>
      </tr>
      <tr>
        <td id="L873" class="blob-num js-line-number" data-line-number="873"></td>
        <td id="LC873" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">int</span> lradiusMax <span class="pl-k">=</span> localHoughParameters[circleNum][<span class="pl-c1">7</span>];</td>
      </tr>
      <tr>
        <td id="L874" class="blob-num js-line-number" data-line-number="874"></td>
        <td id="LC874" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">int</span> ldepth <span class="pl-k">=</span> localHoughParameters[circleNum][<span class="pl-c1">8</span>];</td>
      </tr>
      <tr>
        <td id="L875" class="blob-num js-line-number" data-line-number="875"></td>
        <td id="LC875" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">for</span>(<span class="pl-k">int</span> h<span class="pl-k">=</span><span class="pl-c1">0</span>; h<span class="pl-k">&lt;</span>lheight; h<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L876" class="blob-num js-line-number" data-line-number="876"></td>
        <td id="LC876" class="blob-code blob-code-inner js-file-line">                    <span class="pl-c"><span class="pl-c">//</span>Check for interrupt</span></td>
      </tr>
      <tr>
        <td id="L877" class="blob-num js-line-number" data-line-number="877"></td>
        <td id="LC877" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">if</span>(cancelThread) <span class="pl-k">return</span>;</td>
      </tr>
      <tr>
        <td id="L878" class="blob-num js-line-number" data-line-number="878"></td>
        <td id="LC878" class="blob-code blob-code-inner js-file-line">                    </td>
      </tr>
      <tr>
        <td id="L879" class="blob-num js-line-number" data-line-number="879"></td>
        <td id="LC879" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">for</span>(<span class="pl-k">int</span> w<span class="pl-k">=</span><span class="pl-c1">0</span>; w<span class="pl-k">&lt;</span>lwidth; w<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L880" class="blob-num js-line-number" data-line-number="880"></td>
        <td id="LC880" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">for</span>(<span class="pl-k">int</span> i<span class="pl-k">=</span><span class="pl-c1">0</span>; i<span class="pl-k">&lt;</span>ldepth; i<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L881" class="blob-num js-line-number" data-line-number="881"></td>
        <td id="LC881" class="blob-code blob-code-inner js-file-line">                           localHoughPixels[i<span class="pl-k">+</span>(lradiusMin<span class="pl-k">-</span>radiusMin)<span class="pl-k">/</span>radiusInc][(w<span class="pl-k">+</span>startWidth)<span class="pl-k">+</span>(h<span class="pl-k">+</span>startHeight)<span class="pl-k">*</span>width] <span class="pl-k">=</span> (<span class="pl-k">byte</span>) <span class="pl-smi">Math</span><span class="pl-k">.</span>round ((localHoughValues[circleNum][w][h][i] <span class="pl-k">*</span> <span class="pl-c1">255D</span>) <span class="pl-k">/</span> maxHough);</td>
      </tr>
      <tr>
        <td id="L882" class="blob-num js-line-number" data-line-number="882"></td>
        <td id="LC882" class="blob-code blob-code-inner js-file-line">                        }</td>
      </tr>
      <tr>
        <td id="L883" class="blob-num js-line-number" data-line-number="883"></td>
        <td id="LC883" class="blob-code blob-code-inner js-file-line">                    }</td>
      </tr>
      <tr>
        <td id="L884" class="blob-num js-line-number" data-line-number="884"></td>
        <td id="LC884" class="blob-code blob-code-inner js-file-line">                }</td>
      </tr>
      <tr>
        <td id="L885" class="blob-num js-line-number" data-line-number="885"></td>
        <td id="LC885" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L886" class="blob-num js-line-number" data-line-number="886"></td>
        <td id="LC886" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L887" class="blob-num js-line-number" data-line-number="887"></td>
        <td id="LC887" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L888" class="blob-num js-line-number" data-line-number="888"></td>
        <td id="LC888" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Otherwise, multithread the depositing of pixels</span></td>
      </tr>
      <tr>
        <td id="L889" class="blob-num js-line-number" data-line-number="889"></td>
        <td id="LC889" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">else</span>{</td>
      </tr>
      <tr>
        <td id="L890" class="blob-num js-line-number" data-line-number="890"></td>
        <td id="LC890" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Build an array to store the result from each thread</span></td>
      </tr>
      <tr>
        <td id="L891" class="blob-num js-line-number" data-line-number="891"></td>
        <td id="LC891" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">final</span> <span class="pl-k">Thread</span>[] threads <span class="pl-k">=</span> newThreadArray();</td>
      </tr>
      <tr>
        <td id="L892" class="blob-num js-line-number" data-line-number="892"></td>
        <td id="LC892" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L893" class="blob-num js-line-number" data-line-number="893"></td>
        <td id="LC893" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Create an atomic integer counter that each thread can use to count through the radii</span></td>
      </tr>
      <tr>
        <td id="L894" class="blob-num js-line-number" data-line-number="894"></td>
        <td id="LC894" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">final</span> <span class="pl-smi">AtomicInteger</span> ai <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">AtomicInteger</span>(<span class="pl-c1">0</span>);  </td>
      </tr>
      <tr>
        <td id="L895" class="blob-num js-line-number" data-line-number="895"></td>
        <td id="LC895" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L896" class="blob-num js-line-number" data-line-number="896"></td>
        <td id="LC896" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Build a thread for as many CPUs as are available to the JVM </span></td>
      </tr>
      <tr>
        <td id="L897" class="blob-num js-line-number" data-line-number="897"></td>
        <td id="LC897" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">for</span> (ithread <span class="pl-k">=</span> <span class="pl-c1">0</span>; ithread <span class="pl-k">&lt;</span> threads<span class="pl-k">.</span>length; ithread<span class="pl-k">++</span>) {    </td>
      </tr>
      <tr>
        <td id="L898" class="blob-num js-line-number" data-line-number="898"></td>
        <td id="LC898" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L899" class="blob-num js-line-number" data-line-number="899"></td>
        <td id="LC899" class="blob-code blob-code-inner js-file-line">                <span class="pl-c"><span class="pl-c">//</span> Concurrently run in as many threads as CPUs  </span></td>
      </tr>
      <tr>
        <td id="L900" class="blob-num js-line-number" data-line-number="900"></td>
        <td id="LC900" class="blob-code blob-code-inner js-file-line">                threads[ithread] <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Thread</span>() {  </td>
      </tr>
      <tr>
        <td id="L901" class="blob-num js-line-number" data-line-number="901"></td>
        <td id="LC901" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L902" class="blob-num js-line-number" data-line-number="902"></td>
        <td id="LC902" class="blob-code blob-code-inner js-file-line">                    { setPriority(<span class="pl-smi">Thread</span><span class="pl-c1"><span class="pl-k">.</span>NORM_PRIORITY</span>); }  </td>
      </tr>
      <tr>
        <td id="L903" class="blob-num js-line-number" data-line-number="903"></td>
        <td id="LC903" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L904" class="blob-num js-line-number" data-line-number="904"></td>
        <td id="LC904" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">@Override</span></td>
      </tr>
      <tr>
        <td id="L905" class="blob-num js-line-number" data-line-number="905"></td>
        <td id="LC905" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">public</span> <span class="pl-k">void</span> <span class="pl-en">run</span>() {  </td>
      </tr>
      <tr>
        <td id="L906" class="blob-num js-line-number" data-line-number="906"></td>
        <td id="LC906" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L907" class="blob-num js-line-number" data-line-number="907"></td>
        <td id="LC907" class="blob-code blob-code-inner js-file-line">                        <span class="pl-c"><span class="pl-c">//</span>Divide the task so that each core works on a subset of circles</span></td>
      </tr>
      <tr>
        <td id="L908" class="blob-num js-line-number" data-line-number="908"></td>
        <td id="LC908" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">for</span>(<span class="pl-k">int</span> circleNum <span class="pl-k">=</span> ai<span class="pl-k">.</span>getAndAdd(<span class="pl-c1">1</span>); circleNum <span class="pl-k">&lt;</span> localHoughParameters<span class="pl-k">.</span>length; circleNum <span class="pl-k">=</span> ai<span class="pl-k">.</span>getAndAdd(<span class="pl-c1">1</span>)){</td>
      </tr>
      <tr>
        <td id="L909" class="blob-num js-line-number" data-line-number="909"></td>
        <td id="LC909" class="blob-code blob-code-inner js-file-line">                            <span class="pl-c"><span class="pl-c">//</span>Extract the local search parameters</span></td>
      </tr>
      <tr>
        <td id="L910" class="blob-num js-line-number" data-line-number="910"></td>
        <td id="LC910" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">int</span> startWidth <span class="pl-k">=</span> localHoughParameters[circleNum][<span class="pl-c1">0</span>];</td>
      </tr>
      <tr>
        <td id="L911" class="blob-num js-line-number" data-line-number="911"></td>
        <td id="LC911" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">int</span> endWidth <span class="pl-k">=</span> localHoughParameters[circleNum][<span class="pl-c1">1</span>];</td>
      </tr>
      <tr>
        <td id="L912" class="blob-num js-line-number" data-line-number="912"></td>
        <td id="LC912" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">int</span> lwidth <span class="pl-k">=</span> localHoughParameters[circleNum][<span class="pl-c1">2</span>];</td>
      </tr>
      <tr>
        <td id="L913" class="blob-num js-line-number" data-line-number="913"></td>
        <td id="LC913" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">int</span> startHeight <span class="pl-k">=</span> localHoughParameters[circleNum][<span class="pl-c1">3</span>];</td>
      </tr>
      <tr>
        <td id="L914" class="blob-num js-line-number" data-line-number="914"></td>
        <td id="LC914" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">int</span> endHeight <span class="pl-k">=</span> localHoughParameters[circleNum][<span class="pl-c1">4</span>];</td>
      </tr>
      <tr>
        <td id="L915" class="blob-num js-line-number" data-line-number="915"></td>
        <td id="LC915" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">int</span> lheight <span class="pl-k">=</span> localHoughParameters[circleNum][<span class="pl-c1">5</span>];</td>
      </tr>
      <tr>
        <td id="L916" class="blob-num js-line-number" data-line-number="916"></td>
        <td id="LC916" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">int</span> lradiusMin <span class="pl-k">=</span> localHoughParameters[circleNum][<span class="pl-c1">6</span>];</td>
      </tr>
      <tr>
        <td id="L917" class="blob-num js-line-number" data-line-number="917"></td>
        <td id="LC917" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">int</span> lradiusMax <span class="pl-k">=</span> localHoughParameters[circleNum][<span class="pl-c1">7</span>];</td>
      </tr>
      <tr>
        <td id="L918" class="blob-num js-line-number" data-line-number="918"></td>
        <td id="LC918" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">int</span> ldepth <span class="pl-k">=</span> localHoughParameters[circleNum][<span class="pl-c1">8</span>];</td>
      </tr>
      <tr>
        <td id="L919" class="blob-num js-line-number" data-line-number="919"></td>
        <td id="LC919" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">int</span> index <span class="pl-k">=</span> <span class="pl-c1">0</span>;</td>
      </tr>
      <tr>
        <td id="L920" class="blob-num js-line-number" data-line-number="920"></td>
        <td id="LC920" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">int</span> maxIndex <span class="pl-k">=</span> width <span class="pl-k">*</span> height;</td>
      </tr>
      <tr>
        <td id="L921" class="blob-num js-line-number" data-line-number="921"></td>
        <td id="LC921" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">for</span>(<span class="pl-k">int</span> h<span class="pl-k">=</span><span class="pl-c1">0</span>; h<span class="pl-k">&lt;</span>lheight; h<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L922" class="blob-num js-line-number" data-line-number="922"></td>
        <td id="LC922" class="blob-code blob-code-inner js-file-line">                                <span class="pl-c"><span class="pl-c">//</span>Check for interrupt</span></td>
      </tr>
      <tr>
        <td id="L923" class="blob-num js-line-number" data-line-number="923"></td>
        <td id="LC923" class="blob-code blob-code-inner js-file-line">                                <span class="pl-k">if</span>(cancelThread) <span class="pl-k">return</span>;</td>
      </tr>
      <tr>
        <td id="L924" class="blob-num js-line-number" data-line-number="924"></td>
        <td id="LC924" class="blob-code blob-code-inner js-file-line">                                </td>
      </tr>
      <tr>
        <td id="L925" class="blob-num js-line-number" data-line-number="925"></td>
        <td id="LC925" class="blob-code blob-code-inner js-file-line">                                <span class="pl-k">for</span>(<span class="pl-k">int</span> w<span class="pl-k">=</span><span class="pl-c1">0</span>; w<span class="pl-k">&lt;</span>lwidth; w<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L926" class="blob-num js-line-number" data-line-number="926"></td>
        <td id="LC926" class="blob-code blob-code-inner js-file-line">                                    <span class="pl-k">for</span>(<span class="pl-k">int</span> i<span class="pl-k">=</span><span class="pl-c1">0</span>; i<span class="pl-k">&lt;</span>ldepth; i<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L927" class="blob-num js-line-number" data-line-number="927"></td>
        <td id="LC927" class="blob-code blob-code-inner js-file-line">                                       index <span class="pl-k">=</span> (w<span class="pl-k">+</span>startWidth)<span class="pl-k">+</span>(h<span class="pl-k">+</span>startHeight)<span class="pl-k">*</span>width; </td>
      </tr>
      <tr>
        <td id="L928" class="blob-num js-line-number" data-line-number="928"></td>
        <td id="LC928" class="blob-code blob-code-inner js-file-line">                                       <span class="pl-k">if</span>(index <span class="pl-k">&lt;</span> maxIndex) localHoughPixels[i<span class="pl-k">+</span>(lradiusMin<span class="pl-k">-</span>radiusMin)<span class="pl-k">/</span>radiusInc][index] <span class="pl-k">=</span> (<span class="pl-k">byte</span>) <span class="pl-smi">Math</span><span class="pl-k">.</span>round ((localHoughValues[circleNum][w][h][i] <span class="pl-k">*</span> <span class="pl-c1">255D</span>) <span class="pl-k">/</span> maxHough);</td>
      </tr>
      <tr>
        <td id="L929" class="blob-num js-line-number" data-line-number="929"></td>
        <td id="LC929" class="blob-code blob-code-inner js-file-line">                                    }</td>
      </tr>
      <tr>
        <td id="L930" class="blob-num js-line-number" data-line-number="930"></td>
        <td id="LC930" class="blob-code blob-code-inner js-file-line">                                }</td>
      </tr>
      <tr>
        <td id="L931" class="blob-num js-line-number" data-line-number="931"></td>
        <td id="LC931" class="blob-code blob-code-inner js-file-line">                            }</td>
      </tr>
      <tr>
        <td id="L932" class="blob-num js-line-number" data-line-number="932"></td>
        <td id="LC932" class="blob-code blob-code-inner js-file-line">                        }</td>
      </tr>
      <tr>
        <td id="L933" class="blob-num js-line-number" data-line-number="933"></td>
        <td id="LC933" class="blob-code blob-code-inner js-file-line">                    }               </td>
      </tr>
      <tr>
        <td id="L934" class="blob-num js-line-number" data-line-number="934"></td>
        <td id="LC934" class="blob-code blob-code-inner js-file-line">                };  </td>
      </tr>
      <tr>
        <td id="L935" class="blob-num js-line-number" data-line-number="935"></td>
        <td id="LC935" class="blob-code blob-code-inner js-file-line">            }    </td>
      </tr>
      <tr>
        <td id="L936" class="blob-num js-line-number" data-line-number="936"></td>
        <td id="LC936" class="blob-code blob-code-inner js-file-line">            startAndJoin(threads);</td>
      </tr>
      <tr>
        <td id="L937" class="blob-num js-line-number" data-line-number="937"></td>
        <td id="LC937" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L938" class="blob-num js-line-number" data-line-number="938"></td>
        <td id="LC938" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L939" class="blob-num js-line-number" data-line-number="939"></td>
        <td id="LC939" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Deposit the array into the Hough Series stack</span></td>
      </tr>
      <tr>
        <td id="L940" class="blob-num js-line-number" data-line-number="940"></td>
        <td id="LC940" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Not time limiting, even at fairly high resolutions</span></td>
      </tr>
      <tr>
        <td id="L941" class="blob-num js-line-number" data-line-number="941"></td>
        <td id="LC941" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">for</span>(<span class="pl-k">int</span> radius <span class="pl-k">=</span> radiusMin; radius<span class="pl-k">&lt;=</span>radiusMax; radius <span class="pl-k">+=</span> radiusInc) {</td>
      </tr>
      <tr>
        <td id="L942" class="blob-num js-line-number" data-line-number="942"></td>
        <td id="LC942" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Calculate the corresponding index</span></td>
      </tr>
      <tr>
        <td id="L943" class="blob-num js-line-number" data-line-number="943"></td>
        <td id="LC943" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">int</span> houghIndex <span class="pl-k">=</span> (radius<span class="pl-k">-</span>radiusMin)<span class="pl-k">/</span>radiusInc;</td>
      </tr>
      <tr>
        <td id="L944" class="blob-num js-line-number" data-line-number="944"></td>
        <td id="LC944" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L945" class="blob-num js-line-number" data-line-number="945"></td>
        <td id="LC945" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Deposit the array image into the corresponding slice in the stack</span></td>
      </tr>
      <tr>
        <td id="L946" class="blob-num js-line-number" data-line-number="946"></td>
        <td id="LC946" class="blob-code blob-code-inner js-file-line">            houghStack<span class="pl-k">.</span>setPixels(localHoughPixels[houghIndex], houghIndex<span class="pl-k">+</span><span class="pl-c1">1</span><span class="pl-k">+</span>startFrame);</td>
      </tr>
      <tr>
        <td id="L947" class="blob-num js-line-number" data-line-number="947"></td>
        <td id="LC947" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L948" class="blob-num js-line-number" data-line-number="948"></td>
        <td id="LC948" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Give the current slice the appropriate radius label</span></td>
      </tr>
      <tr>
        <td id="L949" class="blob-num js-line-number" data-line-number="949"></td>
        <td id="LC949" class="blob-code blob-code-inner js-file-line">            houghStack<span class="pl-k">.</span>setSliceLabel(<span class="pl-s"><span class="pl-pds">&quot;</span>Hough Space [r=<span class="pl-pds">&quot;</span></span><span class="pl-k">+</span>radius<span class="pl-k">+</span><span class="pl-s"><span class="pl-pds">&quot;</span>, resolution=<span class="pl-pds">&quot;</span></span><span class="pl-k">+</span>resolution<span class="pl-k">+</span><span class="pl-s"><span class="pl-pds">&quot;</span>]<span class="pl-pds">&quot;</span></span>, houghIndex<span class="pl-k">+</span><span class="pl-c1">1</span><span class="pl-k">+</span>startFrame);</td>
      </tr>
      <tr>
        <td id="L950" class="blob-num js-line-number" data-line-number="950"></td>
        <td id="LC950" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L951" class="blob-num js-line-number" data-line-number="951"></td>
        <td id="LC951" class="blob-code blob-code-inner js-file-line">       </td>
      </tr>
      <tr>
        <td id="L952" class="blob-num js-line-number" data-line-number="952"></td>
        <td id="LC952" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L953" class="blob-num js-line-number" data-line-number="953"></td>
        <td id="LC953" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L954" class="blob-num js-line-number" data-line-number="954"></td>
        <td id="LC954" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>OPTIMIZED - cancellable</span></td>
      </tr>
      <tr>
        <td id="L955" class="blob-num js-line-number" data-line-number="955"></td>
        <td id="LC955" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>Add transform series data to the hyperstack</span></td>
      </tr>
      <tr>
        <td id="L956" class="blob-num js-line-number" data-line-number="956"></td>
        <td id="LC956" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">void</span> <span class="pl-en">HoughSpaceSeries</span>(<span class="pl-k">int</span> <span class="pl-v">slice</span>, <span class="pl-smi">ImageStack</span> <span class="pl-v">houghStack</span>){  </td>
      </tr>
      <tr>
        <td id="L957" class="blob-num js-line-number" data-line-number="957"></td>
        <td id="LC957" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>If the maximum Hough value has not yet been assigned, search the whole Hough transform for the maximum value</span></td>
      </tr>
      <tr>
        <td id="L958" class="blob-num js-line-number" data-line-number="958"></td>
        <td id="LC958" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(maxHough <span class="pl-k">==</span> <span class="pl-k">-</span><span class="pl-c1">1</span>){</td>
      </tr>
      <tr>
        <td id="L959" class="blob-num js-line-number" data-line-number="959"></td>
        <td id="LC959" class="blob-code blob-code-inner js-file-line">            houghMaximum();  </td>
      </tr>
      <tr>
        <td id="L960" class="blob-num js-line-number" data-line-number="960"></td>
        <td id="LC960" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L961" class="blob-num js-line-number" data-line-number="961"></td>
        <td id="LC961" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L962" class="blob-num js-line-number" data-line-number="962"></td>
        <td id="LC962" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Create an array to store the Hough values</span></td>
      </tr>
      <tr>
        <td id="L963" class="blob-num js-line-number" data-line-number="963"></td>
        <td id="LC963" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">byte</span> localHoughPixels[][] <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">byte</span>[depth][width<span class="pl-k">*</span>height];        </td>
      </tr>
      <tr>
        <td id="L964" class="blob-num js-line-number" data-line-number="964"></td>
        <td id="LC964" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> startFrame <span class="pl-k">=</span> ((slice<span class="pl-k">-</span><span class="pl-c1">1</span>)<span class="pl-k">*</span>depth);</td>
      </tr>
      <tr>
        <td id="L965" class="blob-num js-line-number" data-line-number="965"></td>
        <td id="LC965" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L966" class="blob-num js-line-number" data-line-number="966"></td>
        <td id="LC966" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>If a full transform was done, calcualte the Hough Pixels</span></td>
      </tr>
      <tr>
        <td id="L967" class="blob-num js-line-number" data-line-number="967"></td>
        <td id="LC967" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(minCircles <span class="pl-k">&gt;</span> <span class="pl-c1">0</span> <span class="pl-k">|</span> nCirlcesPrev <span class="pl-k">&gt;</span> <span class="pl-c1">0</span>){</td>
      </tr>
      <tr>
        <td id="L968" class="blob-num js-line-number" data-line-number="968"></td>
        <td id="LC968" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Build an array to store the result from each thread</span></td>
      </tr>
      <tr>
        <td id="L969" class="blob-num js-line-number" data-line-number="969"></td>
        <td id="LC969" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">final</span> <span class="pl-k">Thread</span>[] threads <span class="pl-k">=</span> newThreadArray();</td>
      </tr>
      <tr>
        <td id="L970" class="blob-num js-line-number" data-line-number="970"></td>
        <td id="LC970" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L971" class="blob-num js-line-number" data-line-number="971"></td>
        <td id="LC971" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Create an atomic integer counter that each thread can use to count through the radii</span></td>
      </tr>
      <tr>
        <td id="L972" class="blob-num js-line-number" data-line-number="972"></td>
        <td id="LC972" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">final</span> <span class="pl-smi">AtomicInteger</span> ai <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">AtomicInteger</span>(radiusMin);  </td>
      </tr>
      <tr>
        <td id="L973" class="blob-num js-line-number" data-line-number="973"></td>
        <td id="LC973" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L974" class="blob-num js-line-number" data-line-number="974"></td>
        <td id="LC974" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Build a thread for as many CPUs as are available to the JVM </span></td>
      </tr>
      <tr>
        <td id="L975" class="blob-num js-line-number" data-line-number="975"></td>
        <td id="LC975" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">for</span> (ithread <span class="pl-k">=</span> <span class="pl-c1">0</span>; ithread <span class="pl-k">&lt;</span> threads<span class="pl-k">.</span>length; ithread<span class="pl-k">++</span>) {    </td>
      </tr>
      <tr>
        <td id="L976" class="blob-num js-line-number" data-line-number="976"></td>
        <td id="LC976" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L977" class="blob-num js-line-number" data-line-number="977"></td>
        <td id="LC977" class="blob-code blob-code-inner js-file-line">                <span class="pl-c"><span class="pl-c">//</span> Concurrently run in as many threads as CPUs  </span></td>
      </tr>
      <tr>
        <td id="L978" class="blob-num js-line-number" data-line-number="978"></td>
        <td id="LC978" class="blob-code blob-code-inner js-file-line">                threads[ithread] <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Thread</span>() {  </td>
      </tr>
      <tr>
        <td id="L979" class="blob-num js-line-number" data-line-number="979"></td>
        <td id="LC979" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L980" class="blob-num js-line-number" data-line-number="980"></td>
        <td id="LC980" class="blob-code blob-code-inner js-file-line">                    { setPriority(<span class="pl-smi">Thread</span><span class="pl-c1"><span class="pl-k">.</span>NORM_PRIORITY</span>); }  </td>
      </tr>
      <tr>
        <td id="L981" class="blob-num js-line-number" data-line-number="981"></td>
        <td id="LC981" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L982" class="blob-num js-line-number" data-line-number="982"></td>
        <td id="LC982" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">@Override</span></td>
      </tr>
      <tr>
        <td id="L983" class="blob-num js-line-number" data-line-number="983"></td>
        <td id="LC983" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">public</span> <span class="pl-k">void</span> <span class="pl-en">run</span>() {  </td>
      </tr>
      <tr>
        <td id="L984" class="blob-num js-line-number" data-line-number="984"></td>
        <td id="LC984" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L985" class="blob-num js-line-number" data-line-number="985"></td>
        <td id="LC985" class="blob-code blob-code-inner js-file-line">                    <span class="pl-c"><span class="pl-c">//</span>Divide the radius tasks across the cores available</span></td>
      </tr>
      <tr>
        <td id="L986" class="blob-num js-line-number" data-line-number="986"></td>
        <td id="LC986" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">for</span> (<span class="pl-k">int</span> radius <span class="pl-k">=</span> ai<span class="pl-k">.</span>getAndAdd(radiusInc); radius <span class="pl-k">&lt;=</span> radiusMax; radius <span class="pl-k">=</span> ai<span class="pl-k">.</span>getAndAdd(radiusInc)) {</td>
      </tr>
      <tr>
        <td id="L987" class="blob-num js-line-number" data-line-number="987"></td>
        <td id="LC987" class="blob-code blob-code-inner js-file-line">                        <span class="pl-c"><span class="pl-c">//</span>Check for interrupt</span></td>
      </tr>
      <tr>
        <td id="L988" class="blob-num js-line-number" data-line-number="988"></td>
        <td id="LC988" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">if</span>(cancelThread) <span class="pl-k">return</span>;</td>
      </tr>
      <tr>
        <td id="L989" class="blob-num js-line-number" data-line-number="989"></td>
        <td id="LC989" class="blob-code blob-code-inner js-file-line">                        </td>
      </tr>
      <tr>
        <td id="L990" class="blob-num js-line-number" data-line-number="990"></td>
        <td id="LC990" class="blob-code blob-code-inner js-file-line">                        <span class="pl-c"><span class="pl-c">//</span>Calculate the corresponding index</span></td>
      </tr>
      <tr>
        <td id="L991" class="blob-num js-line-number" data-line-number="991"></td>
        <td id="LC991" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">int</span> houghIndex <span class="pl-k">=</span> (radius<span class="pl-k">-</span>radiusMin)<span class="pl-k">/</span>radiusInc;</td>
      </tr>
      <tr>
        <td id="L992" class="blob-num js-line-number" data-line-number="992"></td>
        <td id="LC992" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L993" class="blob-num js-line-number" data-line-number="993"></td>
        <td id="LC993" class="blob-code blob-code-inner js-file-line">                        <span class="pl-c"><span class="pl-c">//</span>If full tansform was performed, retrieve the pixel array for the current Hough radius image</span></td>
      </tr>
      <tr>
        <td id="L994" class="blob-num js-line-number" data-line-number="994"></td>
        <td id="LC994" class="blob-code blob-code-inner js-file-line">                        createHoughPixels(localHoughPixels[houghIndex], houghIndex);</td>
      </tr>
      <tr>
        <td id="L995" class="blob-num js-line-number" data-line-number="995"></td>
        <td id="LC995" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L996" class="blob-num js-line-number" data-line-number="996"></td>
        <td id="LC996" class="blob-code blob-code-inner js-file-line">                        <span class="pl-c"><span class="pl-c">//</span>Deposit the array image into the corresponding slice in the stack</span></td>
      </tr>
      <tr>
        <td id="L997" class="blob-num js-line-number" data-line-number="997"></td>
        <td id="LC997" class="blob-code blob-code-inner js-file-line">                        houghStack<span class="pl-k">.</span>setPixels(localHoughPixels[houghIndex], houghIndex<span class="pl-k">+</span><span class="pl-c1">1</span><span class="pl-k">+</span>startFrame);</td>
      </tr>
      <tr>
        <td id="L998" class="blob-num js-line-number" data-line-number="998"></td>
        <td id="LC998" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L999" class="blob-num js-line-number" data-line-number="999"></td>
        <td id="LC999" class="blob-code blob-code-inner js-file-line">                        <span class="pl-c"><span class="pl-c">//</span>Give the current slice the appropriate radius label</span></td>
      </tr>
      <tr>
        <td id="L1000" class="blob-num js-line-number" data-line-number="1000"></td>
        <td id="LC1000" class="blob-code blob-code-inner js-file-line">                        houghStack<span class="pl-k">.</span>setSliceLabel(<span class="pl-s"><span class="pl-pds">&quot;</span>Hough Space [r=<span class="pl-pds">&quot;</span></span><span class="pl-k">+</span>radius<span class="pl-k">+</span><span class="pl-s"><span class="pl-pds">&quot;</span>, resolution=<span class="pl-pds">&quot;</span></span><span class="pl-k">+</span>resolution<span class="pl-k">+</span><span class="pl-s"><span class="pl-pds">&quot;</span>]<span class="pl-pds">&quot;</span></span>, houghIndex<span class="pl-k">+</span><span class="pl-c1">1</span><span class="pl-k">+</span>startFrame);</td>
      </tr>
      <tr>
        <td id="L1001" class="blob-num js-line-number" data-line-number="1001"></td>
        <td id="LC1001" class="blob-code blob-code-inner js-file-line">                    }</td>
      </tr>
      <tr>
        <td id="L1002" class="blob-num js-line-number" data-line-number="1002"></td>
        <td id="LC1002" class="blob-code blob-code-inner js-file-line">                }  </td>
      </tr>
      <tr>
        <td id="L1003" class="blob-num js-line-number" data-line-number="1003"></td>
        <td id="LC1003" class="blob-code blob-code-inner js-file-line">            };</td>
      </tr>
      <tr>
        <td id="L1004" class="blob-num js-line-number" data-line-number="1004"></td>
        <td id="LC1004" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L1005" class="blob-num js-line-number" data-line-number="1005"></td>
        <td id="LC1005" class="blob-code blob-code-inner js-file-line">            startAndJoin(threads);</td>
      </tr>
      <tr>
        <td id="L1006" class="blob-num js-line-number" data-line-number="1006"></td>
        <td id="LC1006" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L1007" class="blob-num js-line-number" data-line-number="1007"></td>
        <td id="LC1007" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L1008" class="blob-num js-line-number" data-line-number="1008"></td>
        <td id="LC1008" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Deposit the array into the Hough Series stack</span></td>
      </tr>
      <tr>
        <td id="L1009" class="blob-num js-line-number" data-line-number="1009"></td>
        <td id="LC1009" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Not time limiting, even at fairly high resolutions</span></td>
      </tr>
      <tr>
        <td id="L1010" class="blob-num js-line-number" data-line-number="1010"></td>
        <td id="LC1010" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">for</span>(<span class="pl-k">int</span> radius <span class="pl-k">=</span> radiusMin; radius<span class="pl-k">&lt;=</span>radiusMax; radius <span class="pl-k">+=</span> radiusInc) {</td>
      </tr>
      <tr>
        <td id="L1011" class="blob-num js-line-number" data-line-number="1011"></td>
        <td id="LC1011" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Check for interrupt</span></td>
      </tr>
      <tr>
        <td id="L1012" class="blob-num js-line-number" data-line-number="1012"></td>
        <td id="LC1012" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(cancelThread) <span class="pl-k">return</span>;</td>
      </tr>
      <tr>
        <td id="L1013" class="blob-num js-line-number" data-line-number="1013"></td>
        <td id="LC1013" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L1014" class="blob-num js-line-number" data-line-number="1014"></td>
        <td id="LC1014" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Calculate the corresponding index</span></td>
      </tr>
      <tr>
        <td id="L1015" class="blob-num js-line-number" data-line-number="1015"></td>
        <td id="LC1015" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">int</span> houghIndex <span class="pl-k">=</span> (radius<span class="pl-k">-</span>radiusMin)<span class="pl-k">/</span>radiusInc;</td>
      </tr>
      <tr>
        <td id="L1016" class="blob-num js-line-number" data-line-number="1016"></td>
        <td id="LC1016" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L1017" class="blob-num js-line-number" data-line-number="1017"></td>
        <td id="LC1017" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Deposit the array image into the corresponding slice in the stack</span></td>
      </tr>
      <tr>
        <td id="L1018" class="blob-num js-line-number" data-line-number="1018"></td>
        <td id="LC1018" class="blob-code blob-code-inner js-file-line">            houghStack<span class="pl-k">.</span>setPixels(localHoughPixels[houghIndex], houghIndex<span class="pl-k">+</span><span class="pl-c1">1</span><span class="pl-k">+</span>startFrame);</td>
      </tr>
      <tr>
        <td id="L1019" class="blob-num js-line-number" data-line-number="1019"></td>
        <td id="LC1019" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L1020" class="blob-num js-line-number" data-line-number="1020"></td>
        <td id="LC1020" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Give the current slice the appropriate radius label</span></td>
      </tr>
      <tr>
        <td id="L1021" class="blob-num js-line-number" data-line-number="1021"></td>
        <td id="LC1021" class="blob-code blob-code-inner js-file-line">            houghStack<span class="pl-k">.</span>setSliceLabel(<span class="pl-s"><span class="pl-pds">&quot;</span>Hough Space [r=<span class="pl-pds">&quot;</span></span><span class="pl-k">+</span>radius<span class="pl-k">+</span><span class="pl-s"><span class="pl-pds">&quot;</span>, resolution=<span class="pl-pds">&quot;</span></span><span class="pl-k">+</span>resolution<span class="pl-k">+</span><span class="pl-s"><span class="pl-pds">&quot;</span>]<span class="pl-pds">&quot;</span></span>, houghIndex<span class="pl-k">+</span><span class="pl-c1">1</span><span class="pl-k">+</span>startFrame);</td>
      </tr>
      <tr>
        <td id="L1022" class="blob-num js-line-number" data-line-number="1022"></td>
        <td id="LC1022" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L1023" class="blob-num js-line-number" data-line-number="1023"></td>
        <td id="LC1023" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L1024" class="blob-num js-line-number" data-line-number="1024"></td>
        <td id="LC1024" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L1025" class="blob-num js-line-number" data-line-number="1025"></td>
        <td id="LC1025" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>OPTMIZED - cancellable</span></td>
      </tr>
      <tr>
        <td id="L1026" class="blob-num js-line-number" data-line-number="1026"></td>
        <td id="LC1026" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span> Convert Values in Hough Space to an 8-Bit Image Space.</span></td>
      </tr>
      <tr>
        <td id="L1027" class="blob-num js-line-number" data-line-number="1027"></td>
        <td id="LC1027" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">void</span> <span class="pl-en">createHoughPixels</span> (<span class="pl-k">byte</span> <span class="pl-v">houghPixels</span>[], <span class="pl-k">int</span> <span class="pl-v">index</span>) {</td>
      </tr>
      <tr>
        <td id="L1028" class="blob-num js-line-number" data-line-number="1028"></td>
        <td id="LC1028" class="blob-code blob-code-inner js-file-line">	<span class="pl-c"><span class="pl-c">//</span>Rescale all the Hough values to 8-bit to create the Hough image - 47ms to complete - single threading okay</span></td>
      </tr>
      <tr>
        <td id="L1029" class="blob-num js-line-number" data-line-number="1029"></td>
        <td id="LC1029" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">for</span>(<span class="pl-k">int</span> l <span class="pl-k">=</span> <span class="pl-c1">0</span>; l <span class="pl-k">&lt;</span> height; l<span class="pl-k">++</span>) {</td>
      </tr>
      <tr>
        <td id="L1030" class="blob-num js-line-number" data-line-number="1030"></td>
        <td id="LC1030" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Check for interrupt</span></td>
      </tr>
      <tr>
        <td id="L1031" class="blob-num js-line-number" data-line-number="1031"></td>
        <td id="LC1031" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(cancelThread) <span class="pl-k">return</span>;</td>
      </tr>
      <tr>
        <td id="L1032" class="blob-num js-line-number" data-line-number="1032"></td>
        <td id="LC1032" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L1033" class="blob-num js-line-number" data-line-number="1033"></td>
        <td id="LC1033" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">for</span>(<span class="pl-k">int</span> i <span class="pl-k">=</span> <span class="pl-c1">0</span>; i <span class="pl-k">&lt;</span> width; i<span class="pl-k">++</span>) {</td>
      </tr>
      <tr>
        <td id="L1034" class="blob-num js-line-number" data-line-number="1034"></td>
        <td id="LC1034" class="blob-code blob-code-inner js-file-line">                houghPixels[i <span class="pl-k">+</span> l <span class="pl-k">*</span> width] <span class="pl-k">=</span> (<span class="pl-k">byte</span>) <span class="pl-smi">Math</span><span class="pl-k">.</span>round ((houghValues[i][l][index] <span class="pl-k">*</span> <span class="pl-c1">255D</span>) <span class="pl-k">/</span> maxHough);</td>
      </tr>
      <tr>
        <td id="L1035" class="blob-num js-line-number" data-line-number="1035"></td>
        <td id="LC1035" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L1036" class="blob-num js-line-number" data-line-number="1036"></td>
        <td id="LC1036" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L1037" class="blob-num js-line-number" data-line-number="1037"></td>
        <td id="LC1037" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L1038" class="blob-num js-line-number" data-line-number="1038"></td>
        <td id="LC1038" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L1039" class="blob-num js-line-number" data-line-number="1039"></td>
        <td id="LC1039" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L1040" class="blob-num js-line-number" data-line-number="1040"></td>
        <td id="LC1040" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span> Draw the circles found in the original image. - cancellable</span></td>
      </tr>
      <tr>
        <td id="L1041" class="blob-num js-line-number" data-line-number="1041"></td>
        <td id="LC1041" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">void</span> <span class="pl-en">drawCircles</span>(<span class="pl-k">int</span> <span class="pl-v">slice</span>, <span class="pl-smi">ImageStack</span> <span class="pl-v">circleStack</span>, <span class="pl-k">int</span> <span class="pl-v">widthROI</span>, <span class="pl-k">int</span> <span class="pl-v">heightROI</span>, <span class="pl-k">int</span> <span class="pl-v">fullWidthX</span>, <span class="pl-k">int</span> <span class="pl-v">fullWidthY</span>, <span class="pl-k">int</span> <span class="pl-v">fullWidthROI</span>) {</td>
      </tr>
      <tr>
        <td id="L1042" class="blob-num js-line-number" data-line-number="1042"></td>
        <td id="LC1042" class="blob-code blob-code-inner js-file-line">		</td>
      </tr>
      <tr>
        <td id="L1043" class="blob-num js-line-number" data-line-number="1043"></td>
        <td id="LC1043" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span> Copy original input pixels into output</span></td>
      </tr>
      <tr>
        <td id="L1044" class="blob-num js-line-number" data-line-number="1044"></td>
        <td id="LC1044" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span> circle location display image and</span></td>
      </tr>
      <tr>
        <td id="L1045" class="blob-num js-line-number" data-line-number="1045"></td>
        <td id="LC1045" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span> combine with saturation at 100</span></td>
      </tr>
      <tr>
        <td id="L1046" class="blob-num js-line-number" data-line-number="1046"></td>
        <td id="LC1046" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">byte</span>[] circlespixels <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">byte</span> [widthROI<span class="pl-k">*</span>heightROI];</td>
      </tr>
      <tr>
        <td id="L1047" class="blob-num js-line-number" data-line-number="1047"></td>
        <td id="LC1047" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L1048" class="blob-num js-line-number" data-line-number="1048"></td>
        <td id="LC1048" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">int</span> roiaddr<span class="pl-k">=</span><span class="pl-c1">0</span>;</td>
      </tr>
      <tr>
        <td id="L1049" class="blob-num js-line-number" data-line-number="1049"></td>
        <td id="LC1049" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">for</span>( <span class="pl-k">int</span> y <span class="pl-k">=</span> fullWidthY; y <span class="pl-k">&lt;</span> fullWidthY<span class="pl-k">+</span>heightROI; y<span class="pl-k">++</span>) {</td>
      </tr>
      <tr>
        <td id="L1050" class="blob-num js-line-number" data-line-number="1050"></td>
        <td id="LC1050" class="blob-code blob-code-inner js-file-line">                    <span class="pl-c"><span class="pl-c">//</span>Check for interrupt</span></td>
      </tr>
      <tr>
        <td id="L1051" class="blob-num js-line-number" data-line-number="1051"></td>
        <td id="LC1051" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">if</span>(cancelThread) <span class="pl-k">return</span>;</td>
      </tr>
      <tr>
        <td id="L1052" class="blob-num js-line-number" data-line-number="1052"></td>
        <td id="LC1052" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">for</span>(<span class="pl-k">int</span> x <span class="pl-k">=</span> fullWidthX; x <span class="pl-k">&lt;</span> fullWidthX<span class="pl-k">+</span>widthROI; x<span class="pl-k">++</span>) {</td>
      </tr>
      <tr>
        <td id="L1053" class="blob-num js-line-number" data-line-number="1053"></td>
        <td id="LC1053" class="blob-code blob-code-inner js-file-line">                            <span class="pl-c"><span class="pl-c">//</span> Copy;</span></td>
      </tr>
      <tr>
        <td id="L1054" class="blob-num js-line-number" data-line-number="1054"></td>
        <td id="LC1054" class="blob-code blob-code-inner js-file-line">                            circlespixels[roiaddr] <span class="pl-k">=</span> (<span class="pl-k">byte</span>) imageValues[x<span class="pl-k">+</span>fullWidthROI<span class="pl-k">*</span>y];</td>
      </tr>
      <tr>
        <td id="L1055" class="blob-num js-line-number" data-line-number="1055"></td>
        <td id="LC1055" class="blob-code blob-code-inner js-file-line">                            <span class="pl-c"><span class="pl-c">//</span> Saturate</span></td>
      </tr>
      <tr>
        <td id="L1056" class="blob-num js-line-number" data-line-number="1056"></td>
        <td id="LC1056" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">if</span>(circlespixels[roiaddr] <span class="pl-k">!=</span> <span class="pl-c1">0</span> )</td>
      </tr>
      <tr>
        <td id="L1057" class="blob-num js-line-number" data-line-number="1057"></td>
        <td id="LC1057" class="blob-code blob-code-inner js-file-line">                                    circlespixels[roiaddr] <span class="pl-k">=</span> <span class="pl-c1">100</span>;</td>
      </tr>
      <tr>
        <td id="L1058" class="blob-num js-line-number" data-line-number="1058"></td>
        <td id="LC1058" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">else</span></td>
      </tr>
      <tr>
        <td id="L1059" class="blob-num js-line-number" data-line-number="1059"></td>
        <td id="LC1059" class="blob-code blob-code-inner js-file-line">                                    circlespixels[roiaddr] <span class="pl-k">=</span> <span class="pl-c1">0</span>;</td>
      </tr>
      <tr>
        <td id="L1060" class="blob-num js-line-number" data-line-number="1060"></td>
        <td id="LC1060" class="blob-code blob-code-inner js-file-line">                            roiaddr<span class="pl-k">++</span>;</td>
      </tr>
      <tr>
        <td id="L1061" class="blob-num js-line-number" data-line-number="1061"></td>
        <td id="LC1061" class="blob-code blob-code-inner js-file-line">                    }</td>
      </tr>
      <tr>
        <td id="L1062" class="blob-num js-line-number" data-line-number="1062"></td>
        <td id="LC1062" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L1063" class="blob-num js-line-number" data-line-number="1063"></td>
        <td id="LC1063" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span> Copy original image to the circlespixels image.</span></td>
      </tr>
      <tr>
        <td id="L1064" class="blob-num js-line-number" data-line-number="1064"></td>
        <td id="LC1064" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span> Changing pixels values to 100, so that the marked</span></td>
      </tr>
      <tr>
        <td id="L1065" class="blob-num js-line-number" data-line-number="1065"></td>
        <td id="LC1065" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span> circles appears more clear. Must be improved in</span></td>
      </tr>
      <tr>
        <td id="L1066" class="blob-num js-line-number" data-line-number="1066"></td>
        <td id="LC1066" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span> the future to show the resuls in a colored image.</span></td>
      </tr>
      <tr>
        <td id="L1067" class="blob-num js-line-number" data-line-number="1067"></td>
        <td id="LC1067" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>for(int i = 0; i &lt; width*height ;++i ) {</span></td>
      </tr>
      <tr>
        <td id="L1068" class="blob-num js-line-number" data-line-number="1068"></td>
        <td id="LC1068" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>if(imageValues[i] != 0 )</span></td>
      </tr>
      <tr>
        <td id="L1069" class="blob-num js-line-number" data-line-number="1069"></td>
        <td id="LC1069" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>if(circlespixels[i] != 0 )</span></td>
      </tr>
      <tr>
        <td id="L1070" class="blob-num js-line-number" data-line-number="1070"></td>
        <td id="LC1070" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>circlespixels[i] = 100;</span></td>
      </tr>
      <tr>
        <td id="L1071" class="blob-num js-line-number" data-line-number="1071"></td>
        <td id="LC1071" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>else</span></td>
      </tr>
      <tr>
        <td id="L1072" class="blob-num js-line-number" data-line-number="1072"></td>
        <td id="LC1072" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>circlespixels[i] = 0;</span></td>
      </tr>
      <tr>
        <td id="L1073" class="blob-num js-line-number" data-line-number="1073"></td>
        <td id="LC1073" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>}</span></td>
      </tr>
      <tr>
        <td id="L1074" class="blob-num js-line-number" data-line-number="1074"></td>
        <td id="LC1074" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(centerPoint <span class="pl-k">==</span> <span class="pl-c1">null</span>) getCenterPoints();</td>
      </tr>
      <tr>
        <td id="L1075" class="blob-num js-line-number" data-line-number="1075"></td>
        <td id="LC1075" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L1076" class="blob-num js-line-number" data-line-number="1076"></td>
        <td id="LC1076" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">byte</span> cor <span class="pl-k">=</span> (<span class="pl-k">byte</span>) <span class="pl-c1">255</span>;</td>
      </tr>
      <tr>
        <td id="L1077" class="blob-num js-line-number" data-line-number="1077"></td>
        <td id="LC1077" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span> Redefine these so refer to ROI coordinates exclusively</span></td>
      </tr>
      <tr>
        <td id="L1078" class="blob-num js-line-number" data-line-number="1078"></td>
        <td id="LC1078" class="blob-code blob-code-inner js-file-line">            fullWidthROI<span class="pl-k">=</span> widthROI;</td>
      </tr>
      <tr>
        <td id="L1079" class="blob-num js-line-number" data-line-number="1079"></td>
        <td id="LC1079" class="blob-code blob-code-inner js-file-line">            fullWidthX<span class="pl-k">=</span><span class="pl-c1">0</span>;</td>
      </tr>
      <tr>
        <td id="L1080" class="blob-num js-line-number" data-line-number="1080"></td>
        <td id="LC1080" class="blob-code blob-code-inner js-file-line">            fullWidthY<span class="pl-k">=</span><span class="pl-c1">0</span>;</td>
      </tr>
      <tr>
        <td id="L1081" class="blob-num js-line-number" data-line-number="1081"></td>
        <td id="LC1081" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L1082" class="blob-num js-line-number" data-line-number="1082"></td>
        <td id="LC1082" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">for</span>(<span class="pl-k">int</span> l <span class="pl-k">=</span> <span class="pl-c1">0</span>; l <span class="pl-k">&lt;</span> nCircles; l<span class="pl-k">++</span>) {</td>
      </tr>
      <tr>
        <td id="L1083" class="blob-num js-line-number" data-line-number="1083"></td>
        <td id="LC1083" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">int</span> i <span class="pl-k">=</span> centerPoint[l]<span class="pl-k">.</span>x;</td>
      </tr>
      <tr>
        <td id="L1084" class="blob-num js-line-number" data-line-number="1084"></td>
        <td id="LC1084" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">int</span> j <span class="pl-k">=</span> centerPoint[l]<span class="pl-k">.</span>y;</td>
      </tr>
      <tr>
        <td id="L1085" class="blob-num js-line-number" data-line-number="1085"></td>
        <td id="LC1085" class="blob-code blob-code-inner js-file-line">                    </td>
      </tr>
      <tr>
        <td id="L1086" class="blob-num js-line-number" data-line-number="1086"></td>
        <td id="LC1086" class="blob-code blob-code-inner js-file-line">                    <span class="pl-c"><span class="pl-c">//</span>Check for interrupt</span></td>
      </tr>
      <tr>
        <td id="L1087" class="blob-num js-line-number" data-line-number="1087"></td>
        <td id="LC1087" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">if</span>(cancelThread) <span class="pl-k">return</span>;</td>
      </tr>
      <tr>
        <td id="L1088" class="blob-num js-line-number" data-line-number="1088"></td>
        <td id="LC1088" class="blob-code blob-code-inner js-file-line">                    <span class="pl-c"><span class="pl-c">//</span> Draw a gray cross marking the center of each circle.</span></td>
      </tr>
      <tr>
        <td id="L1089" class="blob-num js-line-number" data-line-number="1089"></td>
        <td id="LC1089" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">for</span>( <span class="pl-k">int</span> k <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">10</span> ; k <span class="pl-k">&lt;=</span> <span class="pl-c1">10</span> ; <span class="pl-k">++</span>k ) {</td>
      </tr>
      <tr>
        <td id="L1090" class="blob-num js-line-number" data-line-number="1090"></td>
        <td id="LC1090" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">int</span> p <span class="pl-k">=</span> (j<span class="pl-k">+</span>k<span class="pl-k">+</span>fullWidthY)<span class="pl-k">*</span>fullWidthROI<span class="pl-k">+</span> (i<span class="pl-k">+</span>fullWidthX);</td>
      </tr>
      <tr>
        <td id="L1091" class="blob-num js-line-number" data-line-number="1091"></td>
        <td id="LC1091" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">if</span>(<span class="pl-k">!</span>outOfBounds(j<span class="pl-k">+</span>k<span class="pl-k">+</span>fullWidthY,i<span class="pl-k">+</span>fullWidthX))</td>
      </tr>
      <tr>
        <td id="L1092" class="blob-num js-line-number" data-line-number="1092"></td>
        <td id="LC1092" class="blob-code blob-code-inner js-file-line">                                    circlespixels[(j<span class="pl-k">+</span>k<span class="pl-k">+</span>fullWidthY)<span class="pl-k">*</span>fullWidthROI<span class="pl-k">+</span> (i<span class="pl-k">+</span>fullWidthX)] <span class="pl-k">=</span> cor;</td>
      </tr>
      <tr>
        <td id="L1093" class="blob-num js-line-number" data-line-number="1093"></td>
        <td id="LC1093" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">if</span>(<span class="pl-k">!</span>outOfBounds(j<span class="pl-k">+</span>fullWidthY,i<span class="pl-k">+</span>k<span class="pl-k">+</span>fullWidthX))</td>
      </tr>
      <tr>
        <td id="L1094" class="blob-num js-line-number" data-line-number="1094"></td>
        <td id="LC1094" class="blob-code blob-code-inner js-file-line">                                    circlespixels[(j<span class="pl-k">+</span>fullWidthY)<span class="pl-k">*</span>fullWidthROI  <span class="pl-k">+</span> (i<span class="pl-k">+</span>k<span class="pl-k">+</span>fullWidthX)] <span class="pl-k">=</span> cor;</td>
      </tr>
      <tr>
        <td id="L1095" class="blob-num js-line-number" data-line-number="1095"></td>
        <td id="LC1095" class="blob-code blob-code-inner js-file-line">                    }</td>
      </tr>
      <tr>
        <td id="L1096" class="blob-num js-line-number" data-line-number="1096"></td>
        <td id="LC1096" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">for</span>( <span class="pl-k">int</span> k <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">2</span> ; k <span class="pl-k">&lt;=</span> <span class="pl-c1">2</span> ; <span class="pl-k">++</span>k ) {</td>
      </tr>
      <tr>
        <td id="L1097" class="blob-num js-line-number" data-line-number="1097"></td>
        <td id="LC1097" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">if</span>(<span class="pl-k">!</span>outOfBounds(j<span class="pl-k">-</span><span class="pl-c1">2</span><span class="pl-k">+</span>fullWidthY,i<span class="pl-k">+</span>k<span class="pl-k">+</span>fullWidthX))</td>
      </tr>
      <tr>
        <td id="L1098" class="blob-num js-line-number" data-line-number="1098"></td>
        <td id="LC1098" class="blob-code blob-code-inner js-file-line">                                    circlespixels[(j<span class="pl-k">-</span><span class="pl-c1">2</span><span class="pl-k">+</span>fullWidthY)<span class="pl-k">*</span>fullWidthROI<span class="pl-k">+</span> (i<span class="pl-k">+</span>k<span class="pl-k">+</span>fullWidthX)] <span class="pl-k">=</span> cor;</td>
      </tr>
      <tr>
        <td id="L1099" class="blob-num js-line-number" data-line-number="1099"></td>
        <td id="LC1099" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">if</span>(<span class="pl-k">!</span>outOfBounds(j<span class="pl-k">+</span><span class="pl-c1">2</span><span class="pl-k">+</span>fullWidthY,i<span class="pl-k">+</span>k<span class="pl-k">+</span>fullWidthX))</td>
      </tr>
      <tr>
        <td id="L1100" class="blob-num js-line-number" data-line-number="1100"></td>
        <td id="LC1100" class="blob-code blob-code-inner js-file-line">                                    circlespixels[(j<span class="pl-k">+</span><span class="pl-c1">2</span><span class="pl-k">+</span>fullWidthY)<span class="pl-k">*</span>fullWidthROI<span class="pl-k">+</span> (i<span class="pl-k">+</span>k<span class="pl-k">+</span>fullWidthX)] <span class="pl-k">=</span> cor;</td>
      </tr>
      <tr>
        <td id="L1101" class="blob-num js-line-number" data-line-number="1101"></td>
        <td id="LC1101" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">if</span>(<span class="pl-k">!</span>outOfBounds(j<span class="pl-k">+</span>k<span class="pl-k">+</span>fullWidthY,i<span class="pl-k">-</span><span class="pl-c1">2</span><span class="pl-k">+</span>fullWidthX))</td>
      </tr>
      <tr>
        <td id="L1102" class="blob-num js-line-number" data-line-number="1102"></td>
        <td id="LC1102" class="blob-code blob-code-inner js-file-line">                                    circlespixels[(j<span class="pl-k">+</span>k<span class="pl-k">+</span>fullWidthY)<span class="pl-k">*</span>fullWidthROI<span class="pl-k">+</span> (i<span class="pl-k">-</span><span class="pl-c1">2</span><span class="pl-k">+</span>fullWidthX)] <span class="pl-k">=</span> cor;</td>
      </tr>
      <tr>
        <td id="L1103" class="blob-num js-line-number" data-line-number="1103"></td>
        <td id="LC1103" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">if</span>(<span class="pl-k">!</span>outOfBounds(j<span class="pl-k">+</span>k<span class="pl-k">+</span>fullWidthY,i<span class="pl-k">+</span><span class="pl-c1">2</span><span class="pl-k">+</span>fullWidthX))</td>
      </tr>
      <tr>
        <td id="L1104" class="blob-num js-line-number" data-line-number="1104"></td>
        <td id="LC1104" class="blob-code blob-code-inner js-file-line">                                    circlespixels[(j<span class="pl-k">+</span>k<span class="pl-k">+</span>fullWidthY)<span class="pl-k">*</span>fullWidthROI<span class="pl-k">+</span> (i<span class="pl-k">+</span><span class="pl-c1">2</span><span class="pl-k">+</span>fullWidthX)] <span class="pl-k">=</span> cor;</td>
      </tr>
      <tr>
        <td id="L1105" class="blob-num js-line-number" data-line-number="1105"></td>
        <td id="LC1105" class="blob-code blob-code-inner js-file-line">                    }</td>
      </tr>
      <tr>
        <td id="L1106" class="blob-num js-line-number" data-line-number="1106"></td>
        <td id="LC1106" class="blob-code blob-code-inner js-file-line">                    </td>
      </tr>
      <tr>
        <td id="L1107" class="blob-num js-line-number" data-line-number="1107"></td>
        <td id="LC1107" class="blob-code blob-code-inner js-file-line">                    <span class="pl-c"><span class="pl-c">//</span>Draw Bresenham circle</span></td>
      </tr>
      <tr>
        <td id="L1108" class="blob-num js-line-number" data-line-number="1108"></td>
        <td id="LC1108" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">int</span> x<span class="pl-k">=</span>centerRadii[l];</td>
      </tr>
      <tr>
        <td id="L1109" class="blob-num js-line-number" data-line-number="1109"></td>
        <td id="LC1109" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">int</span> y<span class="pl-k">=</span><span class="pl-c1">0</span>;</td>
      </tr>
      <tr>
        <td id="L1110" class="blob-num js-line-number" data-line-number="1110"></td>
        <td id="LC1110" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">int</span> err <span class="pl-k">=</span> <span class="pl-c1">0</span>;</td>
      </tr>
      <tr>
        <td id="L1111" class="blob-num js-line-number" data-line-number="1111"></td>
        <td id="LC1111" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">while</span> (x <span class="pl-k">&gt;=</span> y) {</td>
      </tr>
      <tr>
        <td id="L1112" class="blob-num js-line-number" data-line-number="1112"></td>
        <td id="LC1112" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">if</span>(<span class="pl-k">!</span>outOfBounds(j<span class="pl-k">+</span>y<span class="pl-k">+</span>fullWidthY,i<span class="pl-k">+</span>x<span class="pl-k">+</span>fullWidthX))</td>
      </tr>
      <tr>
        <td id="L1113" class="blob-num js-line-number" data-line-number="1113"></td>
        <td id="LC1113" class="blob-code blob-code-inner js-file-line">                            circlespixels[(j<span class="pl-k">+</span>y<span class="pl-k">+</span>fullWidthY)<span class="pl-k">*</span>fullWidthROI<span class="pl-k">+</span> (i<span class="pl-k">+</span>x<span class="pl-k">+</span>fullWidthX)] <span class="pl-k">=</span> cor;</td>
      </tr>
      <tr>
        <td id="L1114" class="blob-num js-line-number" data-line-number="1114"></td>
        <td id="LC1114" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">if</span>(<span class="pl-k">!</span>outOfBounds(j<span class="pl-k">+</span>y<span class="pl-k">+</span>fullWidthY,i<span class="pl-k">-</span>x<span class="pl-k">+</span>fullWidthX))</td>
      </tr>
      <tr>
        <td id="L1115" class="blob-num js-line-number" data-line-number="1115"></td>
        <td id="LC1115" class="blob-code blob-code-inner js-file-line">                            circlespixels[(j<span class="pl-k">+</span>y<span class="pl-k">+</span>fullWidthY)<span class="pl-k">*</span>fullWidthROI<span class="pl-k">+</span> (i<span class="pl-k">-</span>x<span class="pl-k">+</span>fullWidthX)] <span class="pl-k">=</span> cor;</td>
      </tr>
      <tr>
        <td id="L1116" class="blob-num js-line-number" data-line-number="1116"></td>
        <td id="LC1116" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">if</span>(<span class="pl-k">!</span>outOfBounds(j<span class="pl-k">-</span>y<span class="pl-k">+</span>fullWidthY,i<span class="pl-k">+</span>x<span class="pl-k">+</span>fullWidthX))</td>
      </tr>
      <tr>
        <td id="L1117" class="blob-num js-line-number" data-line-number="1117"></td>
        <td id="LC1117" class="blob-code blob-code-inner js-file-line">                            circlespixels[(j<span class="pl-k">-</span>y<span class="pl-k">+</span>fullWidthY)<span class="pl-k">*</span>fullWidthROI<span class="pl-k">+</span> (i<span class="pl-k">+</span>x<span class="pl-k">+</span>fullWidthX)] <span class="pl-k">=</span> cor;</td>
      </tr>
      <tr>
        <td id="L1118" class="blob-num js-line-number" data-line-number="1118"></td>
        <td id="LC1118" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">if</span>(<span class="pl-k">!</span>outOfBounds(j<span class="pl-k">-</span>y<span class="pl-k">+</span>fullWidthY,i<span class="pl-k">-</span>x<span class="pl-k">+</span>fullWidthX))</td>
      </tr>
      <tr>
        <td id="L1119" class="blob-num js-line-number" data-line-number="1119"></td>
        <td id="LC1119" class="blob-code blob-code-inner js-file-line">                            circlespixels[(j<span class="pl-k">-</span>y<span class="pl-k">+</span>fullWidthY)<span class="pl-k">*</span>fullWidthROI<span class="pl-k">+</span> (i<span class="pl-k">-</span>x<span class="pl-k">+</span>fullWidthX)] <span class="pl-k">=</span> cor;</td>
      </tr>
      <tr>
        <td id="L1120" class="blob-num js-line-number" data-line-number="1120"></td>
        <td id="LC1120" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L1121" class="blob-num js-line-number" data-line-number="1121"></td>
        <td id="LC1121" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">if</span>(<span class="pl-k">!</span>outOfBounds(j<span class="pl-k">+</span>x<span class="pl-k">+</span>fullWidthY,i<span class="pl-k">+</span>y<span class="pl-k">+</span>fullWidthX))</td>
      </tr>
      <tr>
        <td id="L1122" class="blob-num js-line-number" data-line-number="1122"></td>
        <td id="LC1122" class="blob-code blob-code-inner js-file-line">                            circlespixels[(j<span class="pl-k">+</span>x<span class="pl-k">+</span>fullWidthY)<span class="pl-k">*</span>fullWidthROI<span class="pl-k">+</span> (i<span class="pl-k">+</span>y<span class="pl-k">+</span>fullWidthX)] <span class="pl-k">=</span> cor;</td>
      </tr>
      <tr>
        <td id="L1123" class="blob-num js-line-number" data-line-number="1123"></td>
        <td id="LC1123" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">if</span>(<span class="pl-k">!</span>outOfBounds(j<span class="pl-k">+</span>x<span class="pl-k">+</span>fullWidthY,i<span class="pl-k">-</span>y<span class="pl-k">+</span>fullWidthX))</td>
      </tr>
      <tr>
        <td id="L1124" class="blob-num js-line-number" data-line-number="1124"></td>
        <td id="LC1124" class="blob-code blob-code-inner js-file-line">                            circlespixels[(j<span class="pl-k">+</span>x<span class="pl-k">+</span>fullWidthY)<span class="pl-k">*</span>fullWidthROI<span class="pl-k">+</span> (i<span class="pl-k">-</span>y<span class="pl-k">+</span>fullWidthX)] <span class="pl-k">=</span> cor;                    </td>
      </tr>
      <tr>
        <td id="L1125" class="blob-num js-line-number" data-line-number="1125"></td>
        <td id="LC1125" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">if</span>(<span class="pl-k">!</span>outOfBounds(j<span class="pl-k">-</span>x<span class="pl-k">+</span>fullWidthY,i<span class="pl-k">+</span>y<span class="pl-k">+</span>fullWidthX))</td>
      </tr>
      <tr>
        <td id="L1126" class="blob-num js-line-number" data-line-number="1126"></td>
        <td id="LC1126" class="blob-code blob-code-inner js-file-line">                            circlespixels[(j<span class="pl-k">-</span>x<span class="pl-k">+</span>fullWidthY)<span class="pl-k">*</span>fullWidthROI<span class="pl-k">+</span> (i<span class="pl-k">+</span>y<span class="pl-k">+</span>fullWidthX)] <span class="pl-k">=</span> cor;                  </td>
      </tr>
      <tr>
        <td id="L1127" class="blob-num js-line-number" data-line-number="1127"></td>
        <td id="LC1127" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">if</span>(<span class="pl-k">!</span>outOfBounds(j<span class="pl-k">-</span>x<span class="pl-k">+</span>fullWidthY,i<span class="pl-k">-</span>y<span class="pl-k">+</span>fullWidthX))</td>
      </tr>
      <tr>
        <td id="L1128" class="blob-num js-line-number" data-line-number="1128"></td>
        <td id="LC1128" class="blob-code blob-code-inner js-file-line">                            circlespixels[(j<span class="pl-k">-</span>x<span class="pl-k">+</span>fullWidthY)<span class="pl-k">*</span>fullWidthROI<span class="pl-k">+</span> (i<span class="pl-k">-</span>y<span class="pl-k">+</span>fullWidthX)] <span class="pl-k">=</span> cor;  </td>
      </tr>
      <tr>
        <td id="L1129" class="blob-num js-line-number" data-line-number="1129"></td>
        <td id="LC1129" class="blob-code blob-code-inner js-file-line">                        </td>
      </tr>
      <tr>
        <td id="L1130" class="blob-num js-line-number" data-line-number="1130"></td>
        <td id="LC1130" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">if</span>(err <span class="pl-k">&lt;=</span> <span class="pl-c1">0</span>){</td>
      </tr>
      <tr>
        <td id="L1131" class="blob-num js-line-number" data-line-number="1131"></td>
        <td id="LC1131" class="blob-code blob-code-inner js-file-line">                            y <span class="pl-k">+=</span> <span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L1132" class="blob-num js-line-number" data-line-number="1132"></td>
        <td id="LC1132" class="blob-code blob-code-inner js-file-line">                            err <span class="pl-k">+=</span> <span class="pl-c1">2</span><span class="pl-k">*</span>y <span class="pl-k">+</span> <span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L1133" class="blob-num js-line-number" data-line-number="1133"></td>
        <td id="LC1133" class="blob-code blob-code-inner js-file-line">                        }</td>
      </tr>
      <tr>
        <td id="L1134" class="blob-num js-line-number" data-line-number="1134"></td>
        <td id="LC1134" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">else</span>{</td>
      </tr>
      <tr>
        <td id="L1135" class="blob-num js-line-number" data-line-number="1135"></td>
        <td id="LC1135" class="blob-code blob-code-inner js-file-line">                            x <span class="pl-k">-=</span> <span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L1136" class="blob-num js-line-number" data-line-number="1136"></td>
        <td id="LC1136" class="blob-code blob-code-inner js-file-line">                            err <span class="pl-k">-=</span> <span class="pl-c1">2</span><span class="pl-k">*</span>x <span class="pl-k">+</span> <span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L1137" class="blob-num js-line-number" data-line-number="1137"></td>
        <td id="LC1137" class="blob-code blob-code-inner js-file-line">                        }</td>
      </tr>
      <tr>
        <td id="L1138" class="blob-num js-line-number" data-line-number="1138"></td>
        <td id="LC1138" class="blob-code blob-code-inner js-file-line">                    }</td>
      </tr>
      <tr>
        <td id="L1139" class="blob-num js-line-number" data-line-number="1139"></td>
        <td id="LC1139" class="blob-code blob-code-inner js-file-line">                    </td>
      </tr>
      <tr>
        <td id="L1140" class="blob-num js-line-number" data-line-number="1140"></td>
        <td id="LC1140" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L1141" class="blob-num js-line-number" data-line-number="1141"></td>
        <td id="LC1141" class="blob-code blob-code-inner js-file-line">            circleStack<span class="pl-k">.</span>setPixels(circlespixels, slice);</td>
      </tr>
      <tr>
        <td id="L1142" class="blob-num js-line-number" data-line-number="1142"></td>
        <td id="LC1142" class="blob-code blob-code-inner js-file-line">            circleStack<span class="pl-k">.</span>setSliceLabel(nCircles <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span> circles found<span class="pl-pds">&quot;</span></span>, slice);</td>
      </tr>
      <tr>
        <td id="L1143" class="blob-num js-line-number" data-line-number="1143"></td>
        <td id="LC1143" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L1144" class="blob-num js-line-number" data-line-number="1144"></td>
        <td id="LC1144" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L1145" class="blob-num js-line-number" data-line-number="1145"></td>
        <td id="LC1145" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L1146" class="blob-num js-line-number" data-line-number="1146"></td>
        <td id="LC1146" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span> Draw the centroids found in the original image where intensity = radius.</span></td>
      </tr>
      <tr>
        <td id="L1147" class="blob-num js-line-number" data-line-number="1147"></td>
        <td id="LC1147" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">void</span> <span class="pl-en">drawFilledCircles</span>(<span class="pl-k">int</span> <span class="pl-v">slice</span>, <span class="pl-smi">ImageStack</span> <span class="pl-v">idStack</span>, <span class="pl-smi">ImageStack</span> <span class="pl-v">scoreStack</span>) {</td>
      </tr>
      <tr>
        <td id="L1148" class="blob-num js-line-number" data-line-number="1148"></td>
        <td id="LC1148" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L1149" class="blob-num js-line-number" data-line-number="1149"></td>
        <td id="LC1149" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Create arrays the same size as the images</span></td>
      </tr>
      <tr>
        <td id="L1150" class="blob-num js-line-number" data-line-number="1150"></td>
        <td id="LC1150" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">short</span>[] <span class="pl-smi">IDpixels</span> <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">short</span>[width<span class="pl-k">*</span>height];</td>
      </tr>
      <tr>
        <td id="L1151" class="blob-num js-line-number" data-line-number="1151"></td>
        <td id="LC1151" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">float</span>[] scorepixels <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">float</span>[width<span class="pl-k">*</span>height];</td>
      </tr>
      <tr>
        <td id="L1152" class="blob-num js-line-number" data-line-number="1152"></td>
        <td id="LC1152" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L1153" class="blob-num js-line-number" data-line-number="1153"></td>
        <td id="LC1153" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">for</span>(<span class="pl-k">int</span> l <span class="pl-k">=</span> <span class="pl-c1">0</span>; l <span class="pl-k">&lt;</span> nCircles; l<span class="pl-k">++</span>) {</td>
      </tr>
      <tr>
        <td id="L1154" class="blob-num js-line-number" data-line-number="1154"></td>
        <td id="LC1154" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">int</span> i <span class="pl-k">=</span> centerPoint[l]<span class="pl-k">.</span>x;</td>
      </tr>
      <tr>
        <td id="L1155" class="blob-num js-line-number" data-line-number="1155"></td>
        <td id="LC1155" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">int</span> j <span class="pl-k">=</span> centerPoint[l]<span class="pl-k">.</span>y;</td>
      </tr>
      <tr>
        <td id="L1156" class="blob-num js-line-number" data-line-number="1156"></td>
        <td id="LC1156" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">int</span> radius <span class="pl-k">=</span> centerRadii[l];</td>
      </tr>
      <tr>
        <td id="L1157" class="blob-num js-line-number" data-line-number="1157"></td>
        <td id="LC1157" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">short</span> <span class="pl-c1">ID</span> <span class="pl-k">=</span> (<span class="pl-k">short</span>) circleID[l];</td>
      </tr>
      <tr>
        <td id="L1158" class="blob-num js-line-number" data-line-number="1158"></td>
        <td id="LC1158" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">float</span> score <span class="pl-k">=</span> (<span class="pl-k">float</span>) houghScores[l]<span class="pl-k">/</span>(<span class="pl-k">float</span>) resolution;</td>
      </tr>
      <tr>
        <td id="L1159" class="blob-num js-line-number" data-line-number="1159"></td>
        <td id="LC1159" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">int</span> rSquared <span class="pl-k">=</span> radius<span class="pl-k">*</span>radius;</td>
      </tr>
      <tr>
        <td id="L1160" class="blob-num js-line-number" data-line-number="1160"></td>
        <td id="LC1160" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L1161" class="blob-num js-line-number" data-line-number="1161"></td>
        <td id="LC1161" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">for</span>(<span class="pl-k">int</span> y<span class="pl-k">=</span><span class="pl-k">-</span><span class="pl-c1">1</span><span class="pl-k">*</span>radius; y<span class="pl-k">&lt;=</span>radius; y<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L1162" class="blob-num js-line-number" data-line-number="1162"></td>
        <td id="LC1162" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">for</span>(<span class="pl-k">int</span> x<span class="pl-k">=</span><span class="pl-k">-</span><span class="pl-c1">1</span><span class="pl-k">*</span>radius; x<span class="pl-k">&lt;=</span>radius; x<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L1163" class="blob-num js-line-number" data-line-number="1163"></td>
        <td id="LC1163" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">if</span>(x<span class="pl-k">*</span>x<span class="pl-k">+</span>y<span class="pl-k">*</span>y <span class="pl-k">&lt;=</span> rSquared){</td>
      </tr>
      <tr>
        <td id="L1164" class="blob-num js-line-number" data-line-number="1164"></td>
        <td id="LC1164" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">if</span>(showID){</td>
      </tr>
      <tr>
        <td id="L1165" class="blob-num js-line-number" data-line-number="1165"></td>
        <td id="LC1165" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">if</span>(<span class="pl-k">!</span>outOfBounds(j<span class="pl-k">+</span>y,i<span class="pl-k">+</span>x)) <span class="pl-k">IDpixels</span>[(j<span class="pl-k">+</span>y)<span class="pl-k">*</span>width <span class="pl-k">+</span> i <span class="pl-k">+</span> x] <span class="pl-k">=</span> <span class="pl-c1">ID</span>;</td>
      </tr>
      <tr>
        <td id="L1166" class="blob-num js-line-number" data-line-number="1166"></td>
        <td id="LC1166" class="blob-code blob-code-inner js-file-line">                        }</td>
      </tr>
      <tr>
        <td id="L1167" class="blob-num js-line-number" data-line-number="1167"></td>
        <td id="LC1167" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">if</span>(showScores){</td>
      </tr>
      <tr>
        <td id="L1168" class="blob-num js-line-number" data-line-number="1168"></td>
        <td id="LC1168" class="blob-code blob-code-inner js-file-line">                            <span class="pl-k">if</span>(<span class="pl-k">!</span>outOfBounds(j<span class="pl-k">+</span>y,i<span class="pl-k">+</span>x)) scorepixels[(j<span class="pl-k">+</span>y)<span class="pl-k">*</span>width <span class="pl-k">+</span> i <span class="pl-k">+</span> x] <span class="pl-k">=</span> score;</td>
      </tr>
      <tr>
        <td id="L1169" class="blob-num js-line-number" data-line-number="1169"></td>
        <td id="LC1169" class="blob-code blob-code-inner js-file-line">                        }</td>
      </tr>
      <tr>
        <td id="L1170" class="blob-num js-line-number" data-line-number="1170"></td>
        <td id="LC1170" class="blob-code blob-code-inner js-file-line">                    }</td>
      </tr>
      <tr>
        <td id="L1171" class="blob-num js-line-number" data-line-number="1171"></td>
        <td id="LC1171" class="blob-code blob-code-inner js-file-line">                }</td>
      </tr>
      <tr>
        <td id="L1172" class="blob-num js-line-number" data-line-number="1172"></td>
        <td id="LC1172" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L1173" class="blob-num js-line-number" data-line-number="1173"></td>
        <td id="LC1173" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L1174" class="blob-num js-line-number" data-line-number="1174"></td>
        <td id="LC1174" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L1175" class="blob-num js-line-number" data-line-number="1175"></td>
        <td id="LC1175" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(showID){</td>
      </tr>
      <tr>
        <td id="L1176" class="blob-num js-line-number" data-line-number="1176"></td>
        <td id="LC1176" class="blob-code blob-code-inner js-file-line">            idStack<span class="pl-k">.</span>setPixels(<span class="pl-smi">IDpixels</span>, slice);</td>
      </tr>
      <tr>
        <td id="L1177" class="blob-num js-line-number" data-line-number="1177"></td>
        <td id="LC1177" class="blob-code blob-code-inner js-file-line">            idStack<span class="pl-k">.</span>setSliceLabel(nCircles <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span> circles found<span class="pl-pds">&quot;</span></span>, slice);</td>
      </tr>
      <tr>
        <td id="L1178" class="blob-num js-line-number" data-line-number="1178"></td>
        <td id="LC1178" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L1179" class="blob-num js-line-number" data-line-number="1179"></td>
        <td id="LC1179" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(showScores){</td>
      </tr>
      <tr>
        <td id="L1180" class="blob-num js-line-number" data-line-number="1180"></td>
        <td id="LC1180" class="blob-code blob-code-inner js-file-line">            scoreStack<span class="pl-k">.</span>setPixels(scorepixels, slice);</td>
      </tr>
      <tr>
        <td id="L1181" class="blob-num js-line-number" data-line-number="1181"></td>
        <td id="LC1181" class="blob-code blob-code-inner js-file-line">            scoreStack<span class="pl-k">.</span>setSliceLabel(nCircles <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span> circles found<span class="pl-pds">&quot;</span></span>, slice);</td>
      </tr>
      <tr>
        <td id="L1182" class="blob-num js-line-number" data-line-number="1182"></td>
        <td id="LC1182" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L1183" class="blob-num js-line-number" data-line-number="1183"></td>
        <td id="LC1183" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L1184" class="blob-num js-line-number" data-line-number="1184"></td>
        <td id="LC1184" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L1185" class="blob-num js-line-number" data-line-number="1185"></td>
        <td id="LC1185" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>Export the results to the results table</span></td>
      </tr>
      <tr>
        <td id="L1186" class="blob-num js-line-number" data-line-number="1186"></td>
        <td id="LC1186" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">public</span> <span class="pl-k">void</span> <span class="pl-en">resultsTable</span>(<span class="pl-k">int</span> <span class="pl-v">frame</span>){</td>
      </tr>
      <tr>
        <td id="L1187" class="blob-num js-line-number" data-line-number="1187"></td>
        <td id="LC1187" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">for</span>(<span class="pl-k">int</span> a <span class="pl-k">=</span> <span class="pl-c1">0</span>; a <span class="pl-k">&lt;</span> nCircles; a<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L1188" class="blob-num js-line-number" data-line-number="1188"></td>
        <td id="LC1188" class="blob-code blob-code-inner js-file-line">            rt<span class="pl-k">.</span>incrementCounter();</td>
      </tr>
      <tr>
        <td id="L1189" class="blob-num js-line-number" data-line-number="1189"></td>
        <td id="LC1189" class="blob-code blob-code-inner js-file-line">            rt<span class="pl-k">.</span>addValue(<span class="pl-s"><span class="pl-pds">&quot;</span>ID<span class="pl-pds">&quot;</span></span>, circleID[a]);</td>
      </tr>
      <tr>
        <td id="L1190" class="blob-num js-line-number" data-line-number="1190"></td>
        <td id="LC1190" class="blob-code blob-code-inner js-file-line">            rt<span class="pl-k">.</span>addValue(<span class="pl-s"><span class="pl-pds">&quot;</span>X (<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> pixelUnits <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span>)<span class="pl-pds">&quot;</span></span> , centerPoint[a]<span class="pl-k">.</span>x<span class="pl-k">*</span>pixelDimensions);</td>
      </tr>
      <tr>
        <td id="L1191" class="blob-num js-line-number" data-line-number="1191"></td>
        <td id="LC1191" class="blob-code blob-code-inner js-file-line">            rt<span class="pl-k">.</span>addValue(<span class="pl-s"><span class="pl-pds">&quot;</span>Y (<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> pixelUnits <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span>)<span class="pl-pds">&quot;</span></span>, centerPoint[a]<span class="pl-k">.</span>y<span class="pl-k">*</span>pixelDimensions);</td>
      </tr>
      <tr>
        <td id="L1192" class="blob-num js-line-number" data-line-number="1192"></td>
        <td id="LC1192" class="blob-code blob-code-inner js-file-line">            rt<span class="pl-k">.</span>addValue(<span class="pl-s"><span class="pl-pds">&quot;</span>Radius (<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> pixelUnits <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span>)<span class="pl-pds">&quot;</span></span>, centerRadii[a]<span class="pl-k">*</span>pixelDimensions);</td>
      </tr>
      <tr>
        <td id="L1193" class="blob-num js-line-number" data-line-number="1193"></td>
        <td id="LC1193" class="blob-code blob-code-inner js-file-line">            rt<span class="pl-k">.</span>addValue(<span class="pl-s"><span class="pl-pds">&quot;</span>Score<span class="pl-pds">&quot;</span></span>, ((<span class="pl-k">float</span>) houghScores[a]<span class="pl-k">/</span>resolution));</td>
      </tr>
      <tr>
        <td id="L1194" class="blob-num js-line-number" data-line-number="1194"></td>
        <td id="LC1194" class="blob-code blob-code-inner js-file-line">            rt<span class="pl-k">.</span>addValue(<span class="pl-s"><span class="pl-pds">&quot;</span>nCircles<span class="pl-pds">&quot;</span></span>, nCircles);</td>
      </tr>
      <tr>
        <td id="L1195" class="blob-num js-line-number" data-line-number="1195"></td>
        <td id="LC1195" class="blob-code blob-code-inner js-file-line">            rt<span class="pl-k">.</span>addValue(<span class="pl-s"><span class="pl-pds">&quot;</span>Resolution<span class="pl-pds">&quot;</span></span>, lutSize);</td>
      </tr>
      <tr>
        <td id="L1196" class="blob-num js-line-number" data-line-number="1196"></td>
        <td id="LC1196" class="blob-code blob-code-inner js-file-line">            rt<span class="pl-k">.</span>addValue(<span class="pl-s"><span class="pl-pds">&quot;</span>Frame (<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> timeUnits <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span>)<span class="pl-pds">&quot;</span></span>, frame<span class="pl-k">*</span>timeDimension);</td>
      </tr>
      <tr>
        <td id="L1197" class="blob-num js-line-number" data-line-number="1197"></td>
        <td id="LC1197" class="blob-code blob-code-inner js-file-line">            rt<span class="pl-k">.</span>addValue(<span class="pl-s"><span class="pl-pds">&quot;</span>Method<span class="pl-pds">&quot;</span></span>, method);</td>
      </tr>
      <tr>
        <td id="L1198" class="blob-num js-line-number" data-line-number="1198"></td>
        <td id="LC1198" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L1199" class="blob-num js-line-number" data-line-number="1199"></td>
        <td id="LC1199" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L1200" class="blob-num js-line-number" data-line-number="1200"></td>
        <td id="LC1200" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L1201" class="blob-num js-line-number" data-line-number="1201"></td>
        <td id="LC1201" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L1202" class="blob-num js-line-number" data-line-number="1202"></td>
        <td id="LC1202" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">boolean</span> <span class="pl-en">outOfBounds</span>(<span class="pl-k">int</span> <span class="pl-v">y</span>,<span class="pl-k">int</span> <span class="pl-v">x</span>) {</td>
      </tr>
      <tr>
        <td id="L1203" class="blob-num js-line-number" data-line-number="1203"></td>
        <td id="LC1203" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(x <span class="pl-k">&gt;=</span> width)</td>
      </tr>
      <tr>
        <td id="L1204" class="blob-num js-line-number" data-line-number="1204"></td>
        <td id="LC1204" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">return</span>(<span class="pl-c1">true</span>);</td>
      </tr>
      <tr>
        <td id="L1205" class="blob-num js-line-number" data-line-number="1205"></td>
        <td id="LC1205" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(x <span class="pl-k">&lt;=</span> <span class="pl-c1">0</span>)</td>
      </tr>
      <tr>
        <td id="L1206" class="blob-num js-line-number" data-line-number="1206"></td>
        <td id="LC1206" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">return</span>(<span class="pl-c1">true</span>);</td>
      </tr>
      <tr>
        <td id="L1207" class="blob-num js-line-number" data-line-number="1207"></td>
        <td id="LC1207" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(y <span class="pl-k">&gt;=</span> height)</td>
      </tr>
      <tr>
        <td id="L1208" class="blob-num js-line-number" data-line-number="1208"></td>
        <td id="LC1208" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">return</span>(<span class="pl-c1">true</span>);</td>
      </tr>
      <tr>
        <td id="L1209" class="blob-num js-line-number" data-line-number="1209"></td>
        <td id="LC1209" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(y <span class="pl-k">&lt;=</span> <span class="pl-c1">0</span>)</td>
      </tr>
      <tr>
        <td id="L1210" class="blob-num js-line-number" data-line-number="1210"></td>
        <td id="LC1210" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">return</span>(<span class="pl-c1">true</span>);</td>
      </tr>
      <tr>
        <td id="L1211" class="blob-num js-line-number" data-line-number="1211"></td>
        <td id="LC1211" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">return</span>(<span class="pl-c1">false</span>);</td>
      </tr>
      <tr>
        <td id="L1212" class="blob-num js-line-number" data-line-number="1212"></td>
        <td id="LC1212" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L1213" class="blob-num js-line-number" data-line-number="1213"></td>
        <td id="LC1213" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L1214" class="blob-num js-line-number" data-line-number="1214"></td>
        <td id="LC1214" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>OPTMIZED - cancellable</span></td>
      </tr>
      <tr>
        <td id="L1215" class="blob-num js-line-number" data-line-number="1215"></td>
        <td id="LC1215" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">/*</span>* Search for a fixed number of circles.</span></td>
      </tr>
      <tr>
        <td id="L1216" class="blob-num js-line-number" data-line-number="1216"></td>
        <td id="LC1216" class="blob-code blob-code-inner js-file-line"><span class="pl-c">    @param maxCircles The number of circles that should be found.  </span></td>
      </tr>
      <tr>
        <td id="L1217" class="blob-num js-line-number" data-line-number="1217"></td>
        <td id="LC1217" class="blob-code blob-code-inner js-file-line"><span class="pl-c">    <span class="pl-c">*/</span></span></td>
      </tr>
      <tr>
        <td id="L1218" class="blob-num js-line-number" data-line-number="1218"></td>
        <td id="LC1218" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">void</span> <span class="pl-en">getCenterPoints</span> () {</td>
      </tr>
      <tr>
        <td id="L1219" class="blob-num js-line-number" data-line-number="1219"></td>
        <td id="LC1219" class="blob-code blob-code-inner js-file-line">   </td>
      </tr>
      <tr>
        <td id="L1220" class="blob-num js-line-number" data-line-number="1220"></td>
        <td id="LC1220" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> countCircles <span class="pl-k">=</span> nCircles;</td>
      </tr>
      <tr>
        <td id="L1221" class="blob-num js-line-number" data-line-number="1221"></td>
        <td id="LC1221" class="blob-code blob-code-inner js-file-line">        maxHough <span class="pl-k">=</span> threshold;</td>
      </tr>
      <tr>
        <td id="L1222" class="blob-num js-line-number" data-line-number="1222"></td>
        <td id="LC1222" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L1223" class="blob-num js-line-number" data-line-number="1223"></td>
        <td id="LC1223" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">while</span>(countCircles <span class="pl-k">&lt;</span> maxCircles <span class="pl-k">&amp;&amp;</span> maxHough <span class="pl-k">&gt;=</span> threshold) {</td>
      </tr>
      <tr>
        <td id="L1224" class="blob-num js-line-number" data-line-number="1224"></td>
        <td id="LC1224" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Check for interrupt</span></td>
      </tr>
      <tr>
        <td id="L1225" class="blob-num js-line-number" data-line-number="1225"></td>
        <td id="LC1225" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(cancelThread) <span class="pl-k">return</span>;</td>
      </tr>
      <tr>
        <td id="L1226" class="blob-num js-line-number" data-line-number="1226"></td>
        <td id="LC1226" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L1227" class="blob-num js-line-number" data-line-number="1227"></td>
        <td id="LC1227" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Update bar string with current circle that is being searched for</span></td>
      </tr>
      <tr>
        <td id="L1228" class="blob-num js-line-number" data-line-number="1228"></td>
        <td id="LC1228" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(isGUI) publish(<span class="pl-s"><span class="pl-pds">&quot;</span>Searching for circles. <span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> countCircles <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span> circles found.<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L1229" class="blob-num js-line-number" data-line-number="1229"></td>
        <td id="LC1229" class="blob-code blob-code-inner js-file-line">            <span class="pl-c1">IJ</span><span class="pl-k">.</span>showStatus(<span class="pl-s"><span class="pl-pds">&quot;</span>Searching for circles. <span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> countCircles <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span> circles found.<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L1230" class="blob-num js-line-number" data-line-number="1230"></td>
        <td id="LC1230" class="blob-code blob-code-inner js-file-line">            </td>
      </tr>
      <tr>
        <td id="L1231" class="blob-num js-line-number" data-line-number="1231"></td>
        <td id="LC1231" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>Search for the highest remaining Hough score in the matrix</span></td>
      </tr>
      <tr>
        <td id="L1232" class="blob-num js-line-number" data-line-number="1232"></td>
        <td id="LC1232" class="blob-code blob-code-inner js-file-line">            houghMaximum();</td>
      </tr>
      <tr>
        <td id="L1233" class="blob-num js-line-number" data-line-number="1233"></td>
        <td id="LC1233" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L1234" class="blob-num js-line-number" data-line-number="1234"></td>
        <td id="LC1234" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(maxHough<span class="pl-k">&gt;=</span>threshold){</td>
      </tr>
      <tr>
        <td id="L1235" class="blob-num js-line-number" data-line-number="1235"></td>
        <td id="LC1235" class="blob-code blob-code-inner js-file-line">                circleIDcounter<span class="pl-k">++</span>;</td>
      </tr>
      <tr>
        <td id="L1236" class="blob-num js-line-number" data-line-number="1236"></td>
        <td id="LC1236" class="blob-code blob-code-inner js-file-line">                circleID[countCircles] <span class="pl-k">=</span> circleIDcounter;</td>
      </tr>
      <tr>
        <td id="L1237" class="blob-num js-line-number" data-line-number="1237"></td>
        <td id="LC1237" class="blob-code blob-code-inner js-file-line">                centerPoint[countCircles] <span class="pl-k">=</span> maxPoint;</td>
      </tr>
      <tr>
        <td id="L1238" class="blob-num js-line-number" data-line-number="1238"></td>
        <td id="LC1238" class="blob-code blob-code-inner js-file-line">                centerRadii[countCircles] <span class="pl-k">=</span> maxRadius;</td>
      </tr>
      <tr>
        <td id="L1239" class="blob-num js-line-number" data-line-number="1239"></td>
        <td id="LC1239" class="blob-code blob-code-inner js-file-line">                houghScores[countCircles] <span class="pl-k">=</span> maxHough;</td>
      </tr>
      <tr>
        <td id="L1240" class="blob-num js-line-number" data-line-number="1240"></td>
        <td id="LC1240" class="blob-code blob-code-inner js-file-line">                countCircles<span class="pl-k">++</span>;</td>
      </tr>
      <tr>
        <td id="L1241" class="blob-num js-line-number" data-line-number="1241"></td>
        <td id="LC1241" class="blob-code blob-code-inner js-file-line">                clearNeighbours(maxPoint<span class="pl-k">.</span>x,maxPoint<span class="pl-k">.</span>y, maxRadius);</td>
      </tr>
      <tr>
        <td id="L1242" class="blob-num js-line-number" data-line-number="1242"></td>
        <td id="LC1242" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L1243" class="blob-num js-line-number" data-line-number="1243"></td>
        <td id="LC1243" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L1244" class="blob-num js-line-number" data-line-number="1244"></td>
        <td id="LC1244" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L1245" class="blob-num js-line-number" data-line-number="1245"></td>
        <td id="LC1245" class="blob-code blob-code-inner js-file-line">        nCircles <span class="pl-k">=</span> countCircles;</td>
      </tr>
      <tr>
        <td id="L1246" class="blob-num js-line-number" data-line-number="1246"></td>
        <td id="LC1246" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L1247" class="blob-num js-line-number" data-line-number="1247"></td>
        <td id="LC1247" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Clear the remainder of result arrays, since these results are from the previous round</span></td>
      </tr>
      <tr>
        <td id="L1248" class="blob-num js-line-number" data-line-number="1248"></td>
        <td id="LC1248" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">for</span>(<span class="pl-k">int</span> i <span class="pl-k">=</span> nCircles; i<span class="pl-k">&lt;</span>maxCircles; i<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L1249" class="blob-num js-line-number" data-line-number="1249"></td>
        <td id="LC1249" class="blob-code blob-code-inner js-file-line">            circleID[i] <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L1250" class="blob-num js-line-number" data-line-number="1250"></td>
        <td id="LC1250" class="blob-code blob-code-inner js-file-line">            centerPoint[i] <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Point</span>(<span class="pl-k">-</span><span class="pl-c1">1</span>,<span class="pl-k">-</span><span class="pl-c1">1</span>);</td>
      </tr>
      <tr>
        <td id="L1251" class="blob-num js-line-number" data-line-number="1251"></td>
        <td id="LC1251" class="blob-code blob-code-inner js-file-line">            centerRadii[i] <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L1252" class="blob-num js-line-number" data-line-number="1252"></td>
        <td id="LC1252" class="blob-code blob-code-inner js-file-line">            houghScores[i] <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L1253" class="blob-num js-line-number" data-line-number="1253"></td>
        <td id="LC1253" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L1254" class="blob-num js-line-number" data-line-number="1254"></td>
        <td id="LC1254" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L1255" class="blob-num js-line-number" data-line-number="1255"></td>
        <td id="LC1255" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L1256" class="blob-num js-line-number" data-line-number="1256"></td>
        <td id="LC1256" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>OPTIMIZED - cancellable</span></td>
      </tr>
      <tr>
        <td id="L1257" class="blob-num js-line-number" data-line-number="1257"></td>
        <td id="LC1257" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">void</span> <span class="pl-en">getLocalCenterPoint2</span>(<span class="pl-k">int</span> <span class="pl-v">index</span>){</td>
      </tr>
      <tr>
        <td id="L1258" class="blob-num js-line-number" data-line-number="1258"></td>
        <td id="LC1258" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Initialize local search variables</span></td>
      </tr>
      <tr>
        <td id="L1259" class="blob-num js-line-number" data-line-number="1259"></td>
        <td id="LC1259" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Initialize local search variables</span></td>
      </tr>
      <tr>
        <td id="L1260" class="blob-num js-line-number" data-line-number="1260"></td>
        <td id="LC1260" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> startWidth <span class="pl-k">=</span> centerPoint[index]<span class="pl-k">.</span>x <span class="pl-k">-</span> searchRadius;</td>
      </tr>
      <tr>
        <td id="L1261" class="blob-num js-line-number" data-line-number="1261"></td>
        <td id="LC1261" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span> (startWidth <span class="pl-k">&lt;</span> <span class="pl-c1">1</span>) startWidth <span class="pl-k">=</span> <span class="pl-c1">1</span>; <span class="pl-c"><span class="pl-c">//</span>Keep search area inside the image</span></td>
      </tr>
      <tr>
        <td id="L1262" class="blob-num js-line-number" data-line-number="1262"></td>
        <td id="LC1262" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> endWidth <span class="pl-k">=</span> centerPoint[index]<span class="pl-k">.</span>x <span class="pl-k">+</span> searchRadius;</td>
      </tr>
      <tr>
        <td id="L1263" class="blob-num js-line-number" data-line-number="1263"></td>
        <td id="LC1263" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span> (endWidth <span class="pl-k">&gt;</span> width) endWidth <span class="pl-k">=</span> width; <span class="pl-c"><span class="pl-c">//</span>Keep search area inside the image</span></td>
      </tr>
      <tr>
        <td id="L1264" class="blob-num js-line-number" data-line-number="1264"></td>
        <td id="LC1264" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L1265" class="blob-num js-line-number" data-line-number="1265"></td>
        <td id="LC1265" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> startHeight <span class="pl-k">=</span> centerPoint[index]<span class="pl-k">.</span>y <span class="pl-k">-</span> searchRadius;</td>
      </tr>
      <tr>
        <td id="L1266" class="blob-num js-line-number" data-line-number="1266"></td>
        <td id="LC1266" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span> (startHeight <span class="pl-k">&lt;</span> <span class="pl-c1">1</span>) startHeight <span class="pl-k">=</span> <span class="pl-c1">1</span>; <span class="pl-c"><span class="pl-c">//</span>Keep search area inside the image</span></td>
      </tr>
      <tr>
        <td id="L1267" class="blob-num js-line-number" data-line-number="1267"></td>
        <td id="LC1267" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> endHeight <span class="pl-k">=</span> centerPoint[index]<span class="pl-k">.</span>y <span class="pl-k">+</span> searchRadius;</td>
      </tr>
      <tr>
        <td id="L1268" class="blob-num js-line-number" data-line-number="1268"></td>
        <td id="LC1268" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span> (endHeight <span class="pl-k">&gt;</span> height) endHeight <span class="pl-k">=</span> height; <span class="pl-c"><span class="pl-c">//</span>Keep search area inside the image</span></td>
      </tr>
      <tr>
        <td id="L1269" class="blob-num js-line-number" data-line-number="1269"></td>
        <td id="LC1269" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L1270" class="blob-num js-line-number" data-line-number="1270"></td>
        <td id="LC1270" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> lradiusMin <span class="pl-k">=</span> centerRadii[index] <span class="pl-k">-</span> searchBand;</td>
      </tr>
      <tr>
        <td id="L1271" class="blob-num js-line-number" data-line-number="1271"></td>
        <td id="LC1271" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(lradiusMin <span class="pl-k">&lt;</span> radiusMin) lradiusMin <span class="pl-k">=</span> radiusMin;</td>
      </tr>
      <tr>
        <td id="L1272" class="blob-num js-line-number" data-line-number="1272"></td>
        <td id="LC1272" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> lradiusMax <span class="pl-k">=</span> centerRadii[index] <span class="pl-k">+</span> searchBand;</td>
      </tr>
      <tr>
        <td id="L1273" class="blob-num js-line-number" data-line-number="1273"></td>
        <td id="LC1273" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(lradiusMax <span class="pl-k">&gt;</span> radiusMax) lradiusMax <span class="pl-k">=</span> radiusMax;</td>
      </tr>
      <tr>
        <td id="L1274" class="blob-num js-line-number" data-line-number="1274"></td>
        <td id="LC1274" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L1275" class="blob-num js-line-number" data-line-number="1275"></td>
        <td id="LC1275" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L1276" class="blob-num js-line-number" data-line-number="1276"></td>
        <td id="LC1276" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Search locally for the highest hough score in the full Hough Space</span></td>
      </tr>
      <tr>
        <td id="L1277" class="blob-num js-line-number" data-line-number="1277"></td>
        <td id="LC1277" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> maxLocalHough <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L1278" class="blob-num js-line-number" data-line-number="1278"></td>
        <td id="LC1278" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> maxLocalRadius <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L1279" class="blob-num js-line-number" data-line-number="1279"></td>
        <td id="LC1279" class="blob-code blob-code-inner js-file-line">        <span class="pl-smi">Point</span> maxLocalPoint <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Point</span> (<span class="pl-k">-</span><span class="pl-c1">1</span>,<span class="pl-k">-</span><span class="pl-c1">1</span>);</td>
      </tr>
      <tr>
        <td id="L1280" class="blob-num js-line-number" data-line-number="1280"></td>
        <td id="LC1280" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">for</span>(<span class="pl-k">int</span> radius <span class="pl-k">=</span> lradiusMin; radius<span class="pl-k">&lt;=</span>lradiusMax; radius <span class="pl-k">+=</span> radiusInc){</td>
      </tr>
      <tr>
        <td id="L1281" class="blob-num js-line-number" data-line-number="1281"></td>
        <td id="LC1281" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">int</span> indexR<span class="pl-k">=</span>(radius<span class="pl-k">-</span>radiusMin)<span class="pl-k">/</span>radiusInc;</td>
      </tr>
      <tr>
        <td id="L1282" class="blob-num js-line-number" data-line-number="1282"></td>
        <td id="LC1282" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">for</span>(<span class="pl-k">int</span> j <span class="pl-k">=</span> startHeight; j <span class="pl-k">&lt;</span> endHeight; j<span class="pl-k">++</span>) {</td>
      </tr>
      <tr>
        <td id="L1283" class="blob-num js-line-number" data-line-number="1283"></td>
        <td id="LC1283" class="blob-code blob-code-inner js-file-line">                <span class="pl-c"><span class="pl-c">//</span>Check for interrupt</span></td>
      </tr>
      <tr>
        <td id="L1284" class="blob-num js-line-number" data-line-number="1284"></td>
        <td id="LC1284" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">if</span>(cancelThread) <span class="pl-k">return</span>;</td>
      </tr>
      <tr>
        <td id="L1285" class="blob-num js-line-number" data-line-number="1285"></td>
        <td id="LC1285" class="blob-code blob-code-inner js-file-line">                </td>
      </tr>
      <tr>
        <td id="L1286" class="blob-num js-line-number" data-line-number="1286"></td>
        <td id="LC1286" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">for</span>(<span class="pl-k">int</span> k <span class="pl-k">=</span> startWidth; k <span class="pl-k">&lt;</span> endWidth; k<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L1287" class="blob-num js-line-number" data-line-number="1287"></td>
        <td id="LC1287" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">if</span>(houghValues[k][j][indexR] <span class="pl-k">&gt;</span> maxLocalHough) {</td>
      </tr>
      <tr>
        <td id="L1288" class="blob-num js-line-number" data-line-number="1288"></td>
        <td id="LC1288" class="blob-code blob-code-inner js-file-line">                        maxLocalHough <span class="pl-k">=</span> houghValues[k][j][indexR];</td>
      </tr>
      <tr>
        <td id="L1289" class="blob-num js-line-number" data-line-number="1289"></td>
        <td id="LC1289" class="blob-code blob-code-inner js-file-line">                        maxLocalPoint <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Point</span>(k,j);</td>
      </tr>
      <tr>
        <td id="L1290" class="blob-num js-line-number" data-line-number="1290"></td>
        <td id="LC1290" class="blob-code blob-code-inner js-file-line">                        maxLocalRadius <span class="pl-k">=</span> radius;</td>
      </tr>
      <tr>
        <td id="L1291" class="blob-num js-line-number" data-line-number="1291"></td>
        <td id="LC1291" class="blob-code blob-code-inner js-file-line">                    }</td>
      </tr>
      <tr>
        <td id="L1292" class="blob-num js-line-number" data-line-number="1292"></td>
        <td id="LC1292" class="blob-code blob-code-inner js-file-line">                }</td>
      </tr>
      <tr>
        <td id="L1293" class="blob-num js-line-number" data-line-number="1293"></td>
        <td id="LC1293" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L1294" class="blob-num js-line-number" data-line-number="1294"></td>
        <td id="LC1294" class="blob-code blob-code-inner js-file-line">        }       </td>
      </tr>
      <tr>
        <td id="L1295" class="blob-num js-line-number" data-line-number="1295"></td>
        <td id="LC1295" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>If the highest score is above the threshold, record the new circle</span></td>
      </tr>
      <tr>
        <td id="L1296" class="blob-num js-line-number" data-line-number="1296"></td>
        <td id="LC1296" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(maxLocalHough<span class="pl-k">&gt;=</span>threshold){</td>
      </tr>
      <tr>
        <td id="L1297" class="blob-num js-line-number" data-line-number="1297"></td>
        <td id="LC1297" class="blob-code blob-code-inner js-file-line">            centerPoint[index] <span class="pl-k">=</span> maxLocalPoint;</td>
      </tr>
      <tr>
        <td id="L1298" class="blob-num js-line-number" data-line-number="1298"></td>
        <td id="LC1298" class="blob-code blob-code-inner js-file-line">            centerRadii[index] <span class="pl-k">=</span> maxLocalRadius;</td>
      </tr>
      <tr>
        <td id="L1299" class="blob-num js-line-number" data-line-number="1299"></td>
        <td id="LC1299" class="blob-code blob-code-inner js-file-line">            houghScores[index] <span class="pl-k">=</span> maxLocalHough;</td>
      </tr>
      <tr>
        <td id="L1300" class="blob-num js-line-number" data-line-number="1300"></td>
        <td id="LC1300" class="blob-code blob-code-inner js-file-line">            clearNeighbours(maxLocalPoint<span class="pl-k">.</span>x,maxLocalPoint<span class="pl-k">.</span>y, maxLocalRadius);</td>
      </tr>
      <tr>
        <td id="L1301" class="blob-num js-line-number" data-line-number="1301"></td>
        <td id="LC1301" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L1302" class="blob-num js-line-number" data-line-number="1302"></td>
        <td id="LC1302" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Otherwise, record that the circle was lost</span></td>
      </tr>
      <tr>
        <td id="L1303" class="blob-num js-line-number" data-line-number="1303"></td>
        <td id="LC1303" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">else</span>{</td>
      </tr>
      <tr>
        <td id="L1304" class="blob-num js-line-number" data-line-number="1304"></td>
        <td id="LC1304" class="blob-code blob-code-inner js-file-line">            circleID[index] <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L1305" class="blob-num js-line-number" data-line-number="1305"></td>
        <td id="LC1305" class="blob-code blob-code-inner js-file-line">            centerPoint[index] <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Point</span>(<span class="pl-k">-</span><span class="pl-c1">1</span>,<span class="pl-k">-</span><span class="pl-c1">1</span>);</td>
      </tr>
      <tr>
        <td id="L1306" class="blob-num js-line-number" data-line-number="1306"></td>
        <td id="LC1306" class="blob-code blob-code-inner js-file-line">            centerRadii[index] <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L1307" class="blob-num js-line-number" data-line-number="1307"></td>
        <td id="LC1307" class="blob-code blob-code-inner js-file-line">            houghScores[index] <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L1308" class="blob-num js-line-number" data-line-number="1308"></td>
        <td id="LC1308" class="blob-code blob-code-inner js-file-line">        }  </td>
      </tr>
      <tr>
        <td id="L1309" class="blob-num js-line-number" data-line-number="1309"></td>
        <td id="LC1309" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L1310" class="blob-num js-line-number" data-line-number="1310"></td>
        <td id="LC1310" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L1311" class="blob-num js-line-number" data-line-number="1311"></td>
        <td id="LC1311" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>OPTMIZED - cancellable</span></td>
      </tr>
      <tr>
        <td id="L1312" class="blob-num js-line-number" data-line-number="1312"></td>
        <td id="LC1312" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">void</span> <span class="pl-en">localGetCenterPoint</span>(<span class="pl-k">int</span> <span class="pl-v">index</span>){</td>
      </tr>
      <tr>
        <td id="L1313" class="blob-num js-line-number" data-line-number="1313"></td>
        <td id="LC1313" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L1314" class="blob-num js-line-number" data-line-number="1314"></td>
        <td id="LC1314" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Extract the local search parameters</span></td>
      </tr>
      <tr>
        <td id="L1315" class="blob-num js-line-number" data-line-number="1315"></td>
        <td id="LC1315" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> startWidth <span class="pl-k">=</span> localHoughParameters[index][<span class="pl-c1">0</span>];</td>
      </tr>
      <tr>
        <td id="L1316" class="blob-num js-line-number" data-line-number="1316"></td>
        <td id="LC1316" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> endWidth <span class="pl-k">=</span> localHoughParameters[index][<span class="pl-c1">1</span>];</td>
      </tr>
      <tr>
        <td id="L1317" class="blob-num js-line-number" data-line-number="1317"></td>
        <td id="LC1317" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> lwidth <span class="pl-k">=</span> localHoughParameters[index][<span class="pl-c1">2</span>];</td>
      </tr>
      <tr>
        <td id="L1318" class="blob-num js-line-number" data-line-number="1318"></td>
        <td id="LC1318" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> startHeight <span class="pl-k">=</span> localHoughParameters[index][<span class="pl-c1">3</span>];</td>
      </tr>
      <tr>
        <td id="L1319" class="blob-num js-line-number" data-line-number="1319"></td>
        <td id="LC1319" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> endHeight <span class="pl-k">=</span> localHoughParameters[index][<span class="pl-c1">4</span>];</td>
      </tr>
      <tr>
        <td id="L1320" class="blob-num js-line-number" data-line-number="1320"></td>
        <td id="LC1320" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> lheight <span class="pl-k">=</span> localHoughParameters[index][<span class="pl-c1">5</span>];</td>
      </tr>
      <tr>
        <td id="L1321" class="blob-num js-line-number" data-line-number="1321"></td>
        <td id="LC1321" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> lradiusMin <span class="pl-k">=</span> localHoughParameters[index][<span class="pl-c1">6</span>];</td>
      </tr>
      <tr>
        <td id="L1322" class="blob-num js-line-number" data-line-number="1322"></td>
        <td id="LC1322" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> lradiusMax <span class="pl-k">=</span> localHoughParameters[index][<span class="pl-c1">7</span>];</td>
      </tr>
      <tr>
        <td id="L1323" class="blob-num js-line-number" data-line-number="1323"></td>
        <td id="LC1323" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> ldepth <span class="pl-k">=</span> localHoughParameters[index][<span class="pl-c1">8</span>];</td>
      </tr>
      <tr>
        <td id="L1324" class="blob-num js-line-number" data-line-number="1324"></td>
        <td id="LC1324" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L1325" class="blob-num js-line-number" data-line-number="1325"></td>
        <td id="LC1325" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Search for the highest hough score in the local Hough Space</span></td>
      </tr>
      <tr>
        <td id="L1326" class="blob-num js-line-number" data-line-number="1326"></td>
        <td id="LC1326" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> maxLocalHough <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L1327" class="blob-num js-line-number" data-line-number="1327"></td>
        <td id="LC1327" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> maxLocalRadius <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L1328" class="blob-num js-line-number" data-line-number="1328"></td>
        <td id="LC1328" class="blob-code blob-code-inner js-file-line">        <span class="pl-smi">Point</span> maxLocalPoint <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Point</span> (<span class="pl-k">-</span><span class="pl-c1">1</span>,<span class="pl-k">-</span><span class="pl-c1">1</span>);</td>
      </tr>
      <tr>
        <td id="L1329" class="blob-num js-line-number" data-line-number="1329"></td>
        <td id="LC1329" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">for</span>(<span class="pl-k">int</span> a<span class="pl-k">=</span><span class="pl-c1">0</span>; a<span class="pl-k">&lt;</span>ldepth; a<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L1330" class="blob-num js-line-number" data-line-number="1330"></td>
        <td id="LC1330" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">for</span>(<span class="pl-k">int</span> j <span class="pl-k">=</span> <span class="pl-c1">0</span>; j <span class="pl-k">&lt;</span> lheight; j<span class="pl-k">++</span>) {</td>
      </tr>
      <tr>
        <td id="L1331" class="blob-num js-line-number" data-line-number="1331"></td>
        <td id="LC1331" class="blob-code blob-code-inner js-file-line">                <span class="pl-c"><span class="pl-c">//</span>Check for interrupt</span></td>
      </tr>
      <tr>
        <td id="L1332" class="blob-num js-line-number" data-line-number="1332"></td>
        <td id="LC1332" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">if</span>(cancelThread) <span class="pl-k">return</span>;</td>
      </tr>
      <tr>
        <td id="L1333" class="blob-num js-line-number" data-line-number="1333"></td>
        <td id="LC1333" class="blob-code blob-code-inner js-file-line">                </td>
      </tr>
      <tr>
        <td id="L1334" class="blob-num js-line-number" data-line-number="1334"></td>
        <td id="LC1334" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">for</span>(<span class="pl-k">int</span> k <span class="pl-k">=</span> <span class="pl-c1">0</span>; k <span class="pl-k">&lt;</span> lwidth; k<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L1335" class="blob-num js-line-number" data-line-number="1335"></td>
        <td id="LC1335" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">if</span>(localHoughValues[index][k][j][a] <span class="pl-k">&gt;</span> maxLocalHough) {</td>
      </tr>
      <tr>
        <td id="L1336" class="blob-num js-line-number" data-line-number="1336"></td>
        <td id="LC1336" class="blob-code blob-code-inner js-file-line">                        maxLocalHough <span class="pl-k">=</span> localHoughValues[index][k][j][a];</td>
      </tr>
      <tr>
        <td id="L1337" class="blob-num js-line-number" data-line-number="1337"></td>
        <td id="LC1337" class="blob-code blob-code-inner js-file-line">                        maxLocalPoint <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Point</span>(k <span class="pl-k">+</span> startWidth,j <span class="pl-k">+</span> startHeight);</td>
      </tr>
      <tr>
        <td id="L1338" class="blob-num js-line-number" data-line-number="1338"></td>
        <td id="LC1338" class="blob-code blob-code-inner js-file-line">                        maxLocalRadius <span class="pl-k">=</span> a<span class="pl-k">*</span>radiusInc <span class="pl-k">+</span> lradiusMin;</td>
      </tr>
      <tr>
        <td id="L1339" class="blob-num js-line-number" data-line-number="1339"></td>
        <td id="LC1339" class="blob-code blob-code-inner js-file-line">                    }</td>
      </tr>
      <tr>
        <td id="L1340" class="blob-num js-line-number" data-line-number="1340"></td>
        <td id="LC1340" class="blob-code blob-code-inner js-file-line">                }</td>
      </tr>
      <tr>
        <td id="L1341" class="blob-num js-line-number" data-line-number="1341"></td>
        <td id="LC1341" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L1342" class="blob-num js-line-number" data-line-number="1342"></td>
        <td id="LC1342" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L1343" class="blob-num js-line-number" data-line-number="1343"></td>
        <td id="LC1343" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L1344" class="blob-num js-line-number" data-line-number="1344"></td>
        <td id="LC1344" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>If the highest score is above the threshold, record the new circle</span></td>
      </tr>
      <tr>
        <td id="L1345" class="blob-num js-line-number" data-line-number="1345"></td>
        <td id="LC1345" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(maxLocalHough<span class="pl-k">&gt;=</span>threshold){            </td>
      </tr>
      <tr>
        <td id="L1346" class="blob-num js-line-number" data-line-number="1346"></td>
        <td id="LC1346" class="blob-code blob-code-inner js-file-line">            centerPoint[index] <span class="pl-k">=</span> maxLocalPoint;</td>
      </tr>
      <tr>
        <td id="L1347" class="blob-num js-line-number" data-line-number="1347"></td>
        <td id="LC1347" class="blob-code blob-code-inner js-file-line">            centerRadii[index] <span class="pl-k">=</span> maxLocalRadius;</td>
      </tr>
      <tr>
        <td id="L1348" class="blob-num js-line-number" data-line-number="1348"></td>
        <td id="LC1348" class="blob-code blob-code-inner js-file-line">            houghScores[index] <span class="pl-k">=</span> maxLocalHough;</td>
      </tr>
      <tr>
        <td id="L1349" class="blob-num js-line-number" data-line-number="1349"></td>
        <td id="LC1349" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L1350" class="blob-num js-line-number" data-line-number="1350"></td>
        <td id="LC1350" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Otherwise, record that the circle was lost</span></td>
      </tr>
      <tr>
        <td id="L1351" class="blob-num js-line-number" data-line-number="1351"></td>
        <td id="LC1351" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">else</span>{</td>
      </tr>
      <tr>
        <td id="L1352" class="blob-num js-line-number" data-line-number="1352"></td>
        <td id="LC1352" class="blob-code blob-code-inner js-file-line">            circleID[index] <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L1353" class="blob-num js-line-number" data-line-number="1353"></td>
        <td id="LC1353" class="blob-code blob-code-inner js-file-line">            centerPoint[index] <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Point</span>(<span class="pl-k">-</span><span class="pl-c1">1</span>,<span class="pl-k">-</span><span class="pl-c1">1</span>);</td>
      </tr>
      <tr>
        <td id="L1354" class="blob-num js-line-number" data-line-number="1354"></td>
        <td id="LC1354" class="blob-code blob-code-inner js-file-line">            centerRadii[index] <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L1355" class="blob-num js-line-number" data-line-number="1355"></td>
        <td id="LC1355" class="blob-code blob-code-inner js-file-line">            houghScores[index] <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L1356" class="blob-num js-line-number" data-line-number="1356"></td>
        <td id="LC1356" class="blob-code blob-code-inner js-file-line">        }     </td>
      </tr>
      <tr>
        <td id="L1357" class="blob-num js-line-number" data-line-number="1357"></td>
        <td id="LC1357" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L1358" class="blob-num js-line-number" data-line-number="1358"></td>
        <td id="LC1358" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L1359" class="blob-num js-line-number" data-line-number="1359"></td>
        <td id="LC1359" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>OPTMIZED</span></td>
      </tr>
      <tr>
        <td id="L1360" class="blob-num js-line-number" data-line-number="1360"></td>
        <td id="LC1360" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">void</span> <span class="pl-en">collapseLocalResult</span>(){</td>
      </tr>
      <tr>
        <td id="L1361" class="blob-num js-line-number" data-line-number="1361"></td>
        <td id="LC1361" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>search for indeces containing circles (i.e. index != -1)</span></td>
      </tr>
      <tr>
        <td id="L1362" class="blob-num js-line-number" data-line-number="1362"></td>
        <td id="LC1362" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span>[] idIndeces <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">int</span> [circleID<span class="pl-k">.</span>length];</td>
      </tr>
      <tr>
        <td id="L1363" class="blob-num js-line-number" data-line-number="1363"></td>
        <td id="LC1363" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> indexCounter <span class="pl-k">=</span> <span class="pl-c1">0</span>;</td>
      </tr>
      <tr>
        <td id="L1364" class="blob-num js-line-number" data-line-number="1364"></td>
        <td id="LC1364" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">for</span>(<span class="pl-k">int</span> i<span class="pl-k">=</span><span class="pl-c1">0</span>; i<span class="pl-k">&lt;</span>circleID<span class="pl-k">.</span>length; i<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L1365" class="blob-num js-line-number" data-line-number="1365"></td>
        <td id="LC1365" class="blob-code blob-code-inner js-file-line">            <span class="pl-c"><span class="pl-c">//</span>If a valid ID is found, record the index</span></td>
      </tr>
      <tr>
        <td id="L1366" class="blob-num js-line-number" data-line-number="1366"></td>
        <td id="LC1366" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(circleID[i] <span class="pl-k">!=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>){</td>
      </tr>
      <tr>
        <td id="L1367" class="blob-num js-line-number" data-line-number="1367"></td>
        <td id="LC1367" class="blob-code blob-code-inner js-file-line">                idIndeces[indexCounter] <span class="pl-k">=</span> i;</td>
      </tr>
      <tr>
        <td id="L1368" class="blob-num js-line-number" data-line-number="1368"></td>
        <td id="LC1368" class="blob-code blob-code-inner js-file-line">                indexCounter<span class="pl-k">++</span>;</td>
      </tr>
      <tr>
        <td id="L1369" class="blob-num js-line-number" data-line-number="1369"></td>
        <td id="LC1369" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L1370" class="blob-num js-line-number" data-line-number="1370"></td>
        <td id="LC1370" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L1371" class="blob-num js-line-number" data-line-number="1371"></td>
        <td id="LC1371" class="blob-code blob-code-inner js-file-line">       </td>
      </tr>
      <tr>
        <td id="L1372" class="blob-num js-line-number" data-line-number="1372"></td>
        <td id="LC1372" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Move all the found results to the starting indeces of the arrays if needed</span></td>
      </tr>
      <tr>
        <td id="L1373" class="blob-num js-line-number" data-line-number="1373"></td>
        <td id="LC1373" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(indexCounter <span class="pl-k">&lt;</span> maxCircles){</td>
      </tr>
      <tr>
        <td id="L1374" class="blob-num js-line-number" data-line-number="1374"></td>
        <td id="LC1374" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">for</span>(<span class="pl-k">int</span> i<span class="pl-k">=</span><span class="pl-c1">0</span>; i<span class="pl-k">&lt;</span>indexCounter; i<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L1375" class="blob-num js-line-number" data-line-number="1375"></td>
        <td id="LC1375" class="blob-code blob-code-inner js-file-line">                <span class="pl-c"><span class="pl-c">//</span>If index is empty, then move the result</span></td>
      </tr>
      <tr>
        <td id="L1376" class="blob-num js-line-number" data-line-number="1376"></td>
        <td id="LC1376" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">if</span>(circleID[i] <span class="pl-k">==</span> <span class="pl-k">-</span><span class="pl-c1">1</span>){</td>
      </tr>
      <tr>
        <td id="L1377" class="blob-num js-line-number" data-line-number="1377"></td>
        <td id="LC1377" class="blob-code blob-code-inner js-file-line">                    <span class="pl-c"><span class="pl-c">//</span>Check to see index is empty</span></td>
      </tr>
      <tr>
        <td id="L1378" class="blob-num js-line-number" data-line-number="1378"></td>
        <td id="LC1378" class="blob-code blob-code-inner js-file-line">                    <span class="pl-c"><span class="pl-c">//</span>Move results</span></td>
      </tr>
      <tr>
        <td id="L1379" class="blob-num js-line-number" data-line-number="1379"></td>
        <td id="LC1379" class="blob-code blob-code-inner js-file-line">                    circleID[i] <span class="pl-k">=</span> circleID[idIndeces[i]];</td>
      </tr>
      <tr>
        <td id="L1380" class="blob-num js-line-number" data-line-number="1380"></td>
        <td id="LC1380" class="blob-code blob-code-inner js-file-line">                    houghScores[i] <span class="pl-k">=</span> houghScores[idIndeces[i]];</td>
      </tr>
      <tr>
        <td id="L1381" class="blob-num js-line-number" data-line-number="1381"></td>
        <td id="LC1381" class="blob-code blob-code-inner js-file-line">                    centerRadii[i] <span class="pl-k">=</span> centerRadii[idIndeces[i]];</td>
      </tr>
      <tr>
        <td id="L1382" class="blob-num js-line-number" data-line-number="1382"></td>
        <td id="LC1382" class="blob-code blob-code-inner js-file-line">                    centerPoint[i] <span class="pl-k">=</span> centerPoint[idIndeces[i]];</td>
      </tr>
      <tr>
        <td id="L1383" class="blob-num js-line-number" data-line-number="1383"></td>
        <td id="LC1383" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L1384" class="blob-num js-line-number" data-line-number="1384"></td>
        <td id="LC1384" class="blob-code blob-code-inner js-file-line">                    <span class="pl-c"><span class="pl-c">//</span>Clear original index</span></td>
      </tr>
      <tr>
        <td id="L1385" class="blob-num js-line-number" data-line-number="1385"></td>
        <td id="LC1385" class="blob-code blob-code-inner js-file-line">                    circleID[idIndeces[i]] <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L1386" class="blob-num js-line-number" data-line-number="1386"></td>
        <td id="LC1386" class="blob-code blob-code-inner js-file-line">                    houghScores[idIndeces[i]] <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L1387" class="blob-num js-line-number" data-line-number="1387"></td>
        <td id="LC1387" class="blob-code blob-code-inner js-file-line">                    centerRadii[idIndeces[i]] <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L1388" class="blob-num js-line-number" data-line-number="1388"></td>
        <td id="LC1388" class="blob-code blob-code-inner js-file-line">                    centerPoint[idIndeces[i]] <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Point</span>(<span class="pl-k">-</span><span class="pl-c1">1</span>,<span class="pl-k">-</span><span class="pl-c1">1</span>);</td>
      </tr>
      <tr>
        <td id="L1389" class="blob-num js-line-number" data-line-number="1389"></td>
        <td id="LC1389" class="blob-code blob-code-inner js-file-line">                }</td>
      </tr>
      <tr>
        <td id="L1390" class="blob-num js-line-number" data-line-number="1390"></td>
        <td id="LC1390" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L1391" class="blob-num js-line-number" data-line-number="1391"></td>
        <td id="LC1391" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L1392" class="blob-num js-line-number" data-line-number="1392"></td>
        <td id="LC1392" class="blob-code blob-code-inner js-file-line">        </td>
      </tr>
      <tr>
        <td id="L1393" class="blob-num js-line-number" data-line-number="1393"></td>
        <td id="LC1393" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>Update nCircles to reflect the new found number of circles</span></td>
      </tr>
      <tr>
        <td id="L1394" class="blob-num js-line-number" data-line-number="1394"></td>
        <td id="LC1394" class="blob-code blob-code-inner js-file-line">        nCircles <span class="pl-k">=</span> indexCounter;</td>
      </tr>
      <tr>
        <td id="L1395" class="blob-num js-line-number" data-line-number="1395"></td>
        <td id="LC1395" class="blob-code blob-code-inner js-file-line">    };</td>
      </tr>
      <tr>
        <td id="L1396" class="blob-num js-line-number" data-line-number="1396"></td>
        <td id="LC1396" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L1397" class="blob-num js-line-number" data-line-number="1397"></td>
        <td id="LC1397" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>OPTIMIZED - Not time limiting, even with large circles - cancellable</span></td>
      </tr>
      <tr>
        <td id="L1398" class="blob-num js-line-number" data-line-number="1398"></td>
        <td id="LC1398" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">/*</span>* Clear, from the Hough Space, all the counter that are near (radius/2) a previously found circle C.    </span></td>
      </tr>
      <tr>
        <td id="L1399" class="blob-num js-line-number" data-line-number="1399"></td>
        <td id="LC1399" class="blob-code blob-code-inner js-file-line"><span class="pl-c">    @param x The x coordinate of the circle C found.</span></td>
      </tr>
      <tr>
        <td id="L1400" class="blob-num js-line-number" data-line-number="1400"></td>
        <td id="LC1400" class="blob-code blob-code-inner js-file-line"><span class="pl-c">    @param x The y coordinate of the circle C found.</span></td>
      </tr>
      <tr>
        <td id="L1401" class="blob-num js-line-number" data-line-number="1401"></td>
        <td id="LC1401" class="blob-code blob-code-inner js-file-line"><span class="pl-c">    @param x The radius of the circle C found.</span></td>
      </tr>
      <tr>
        <td id="L1402" class="blob-num js-line-number" data-line-number="1402"></td>
        <td id="LC1402" class="blob-code blob-code-inner js-file-line"><span class="pl-c">    <span class="pl-c">*/</span></span></td>
      </tr>
      <tr>
        <td id="L1403" class="blob-num js-line-number" data-line-number="1403"></td>
        <td id="LC1403" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">void</span> <span class="pl-en">clearNeighbours</span>(<span class="pl-k">int</span> <span class="pl-v">x</span>,<span class="pl-k">int</span> <span class="pl-v">y</span>, <span class="pl-k">int</span> <span class="pl-v">radius</span>) {</td>
      </tr>
      <tr>
        <td id="L1404" class="blob-num js-line-number" data-line-number="1404"></td>
        <td id="LC1404" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span> The following code just clean the points around the center of the circle found.</span></td>
      </tr>
      <tr>
        <td id="L1405" class="blob-num js-line-number" data-line-number="1405"></td>
        <td id="LC1405" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">int</span> radiusSquared <span class="pl-k">=</span> (<span class="pl-k">int</span>) <span class="pl-smi">Math</span><span class="pl-k">.</span>round(<span class="pl-smi">Math</span><span class="pl-k">.</span>pow(radius<span class="pl-k">*</span>ratio, <span class="pl-c1">2D</span>));</td>
      </tr>
      <tr>
        <td id="L1406" class="blob-num js-line-number" data-line-number="1406"></td>
        <td id="LC1406" class="blob-code blob-code-inner js-file-line">        <span class="pl-c"><span class="pl-c">//</span>int radiusSquared = radius*radius;</span></td>
      </tr>
      <tr>
        <td id="L1407" class="blob-num js-line-number" data-line-number="1407"></td>
        <td id="LC1407" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L1408" class="blob-num js-line-number" data-line-number="1408"></td>
        <td id="LC1408" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> y1 <span class="pl-k">=</span> (<span class="pl-k">int</span>)<span class="pl-smi">Math</span><span class="pl-k">.</span>floor (y <span class="pl-k">-</span> radius);</td>
      </tr>
      <tr>
        <td id="L1409" class="blob-num js-line-number" data-line-number="1409"></td>
        <td id="LC1409" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> y2 <span class="pl-k">=</span> (<span class="pl-k">int</span>)<span class="pl-smi">Math</span><span class="pl-k">.</span>ceil (y <span class="pl-k">+</span> radius) <span class="pl-k">+</span> <span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L1410" class="blob-num js-line-number" data-line-number="1410"></td>
        <td id="LC1410" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> x1 <span class="pl-k">=</span> (<span class="pl-k">int</span>)<span class="pl-smi">Math</span><span class="pl-k">.</span>floor (x <span class="pl-k">-</span> radius);</td>
      </tr>
      <tr>
        <td id="L1411" class="blob-num js-line-number" data-line-number="1411"></td>
        <td id="LC1411" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> x2 <span class="pl-k">=</span> (<span class="pl-k">int</span>)<span class="pl-smi">Math</span><span class="pl-k">.</span>ceil (x <span class="pl-k">+</span> radius) <span class="pl-k">+</span> <span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L1412" class="blob-num js-line-number" data-line-number="1412"></td>
        <td id="LC1412" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L1413" class="blob-num js-line-number" data-line-number="1413"></td>
        <td id="LC1413" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(y1 <span class="pl-k">&lt;</span> <span class="pl-c1">0</span>)</td>
      </tr>
      <tr>
        <td id="L1414" class="blob-num js-line-number" data-line-number="1414"></td>
        <td id="LC1414" class="blob-code blob-code-inner js-file-line">            y1 <span class="pl-k">=</span> <span class="pl-c1">0</span>;</td>
      </tr>
      <tr>
        <td id="L1415" class="blob-num js-line-number" data-line-number="1415"></td>
        <td id="LC1415" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(y2 <span class="pl-k">&gt;</span> height)</td>
      </tr>
      <tr>
        <td id="L1416" class="blob-num js-line-number" data-line-number="1416"></td>
        <td id="LC1416" class="blob-code blob-code-inner js-file-line">            y2 <span class="pl-k">=</span> height;</td>
      </tr>
      <tr>
        <td id="L1417" class="blob-num js-line-number" data-line-number="1417"></td>
        <td id="LC1417" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(x1 <span class="pl-k">&lt;</span> <span class="pl-c1">0</span>)</td>
      </tr>
      <tr>
        <td id="L1418" class="blob-num js-line-number" data-line-number="1418"></td>
        <td id="LC1418" class="blob-code blob-code-inner js-file-line">            x1 <span class="pl-k">=</span> <span class="pl-c1">0</span>;</td>
      </tr>
      <tr>
        <td id="L1419" class="blob-num js-line-number" data-line-number="1419"></td>
        <td id="LC1419" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span>(x2 <span class="pl-k">&gt;</span> width)</td>
      </tr>
      <tr>
        <td id="L1420" class="blob-num js-line-number" data-line-number="1420"></td>
        <td id="LC1420" class="blob-code blob-code-inner js-file-line">            x2 <span class="pl-k">=</span> width;</td>
      </tr>
      <tr>
        <td id="L1421" class="blob-num js-line-number" data-line-number="1421"></td>
        <td id="LC1421" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L1422" class="blob-num js-line-number" data-line-number="1422"></td>
        <td id="LC1422" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">for</span>(<span class="pl-k">int</span> indexR <span class="pl-k">=</span> <span class="pl-c1">0</span>; indexR<span class="pl-k">&lt;</span>depth; indexR<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L1423" class="blob-num js-line-number" data-line-number="1423"></td>
        <td id="LC1423" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">for</span>(<span class="pl-k">int</span> i <span class="pl-k">=</span> y1; i <span class="pl-k">&lt;</span> y2; i<span class="pl-k">++</span>) {</td>
      </tr>
      <tr>
        <td id="L1424" class="blob-num js-line-number" data-line-number="1424"></td>
        <td id="LC1424" class="blob-code blob-code-inner js-file-line">                <span class="pl-c"><span class="pl-c">//</span>Check for interrupt</span></td>
      </tr>
      <tr>
        <td id="L1425" class="blob-num js-line-number" data-line-number="1425"></td>
        <td id="LC1425" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">if</span>(cancelThread) <span class="pl-k">return</span>;</td>
      </tr>
      <tr>
        <td id="L1426" class="blob-num js-line-number" data-line-number="1426"></td>
        <td id="LC1426" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">for</span>(<span class="pl-k">int</span> j <span class="pl-k">=</span> x1; j <span class="pl-k">&lt;</span> x2; j<span class="pl-k">++</span>) {	      	     </td>
      </tr>
      <tr>
        <td id="L1427" class="blob-num js-line-number" data-line-number="1427"></td>
        <td id="LC1427" class="blob-code blob-code-inner js-file-line">                    <span class="pl-k">if</span>((<span class="pl-k">int</span>) (<span class="pl-smi">Math</span><span class="pl-k">.</span>pow (j <span class="pl-k">-</span> x, <span class="pl-c1">2D</span>) <span class="pl-k">+</span> <span class="pl-smi">Math</span><span class="pl-k">.</span>pow (i <span class="pl-k">-</span> y, <span class="pl-c1">2D</span>)) <span class="pl-k">&lt;</span> radiusSquared) {</td>
      </tr>
      <tr>
        <td id="L1428" class="blob-num js-line-number" data-line-number="1428"></td>
        <td id="LC1428" class="blob-code blob-code-inner js-file-line">                        houghValues[j][i][indexR] <span class="pl-k">=</span> <span class="pl-c1">0</span>;</td>
      </tr>
      <tr>
        <td id="L1429" class="blob-num js-line-number" data-line-number="1429"></td>
        <td id="LC1429" class="blob-code blob-code-inner js-file-line">                    }</td>
      </tr>
      <tr>
        <td id="L1430" class="blob-num js-line-number" data-line-number="1430"></td>
        <td id="LC1430" class="blob-code blob-code-inner js-file-line">                }</td>
      </tr>
      <tr>
        <td id="L1431" class="blob-num js-line-number" data-line-number="1431"></td>
        <td id="LC1431" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L1432" class="blob-num js-line-number" data-line-number="1432"></td>
        <td id="LC1432" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L1433" class="blob-num js-line-number" data-line-number="1433"></td>
        <td id="LC1433" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L1434" class="blob-num js-line-number" data-line-number="1434"></td>
        <td id="LC1434" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L1435" class="blob-num js-line-number" data-line-number="1435"></td>
        <td id="LC1435" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">/*</span>* Create a Thread[] array as large as the number of processors available. </span></td>
      </tr>
      <tr>
        <td id="L1436" class="blob-num js-line-number" data-line-number="1436"></td>
        <td id="LC1436" class="blob-code blob-code-inner js-file-line"><span class="pl-c">    * From Stephan Preibisch&#39;s Multithreading.java class. See: </span></td>
      </tr>
      <tr>
        <td id="L1437" class="blob-num js-line-number" data-line-number="1437"></td>
        <td id="LC1437" class="blob-code blob-code-inner js-file-line"><span class="pl-c">    * http://repo.or.cz/w/trakem2.git?a=blob;f=mpi/fruitfly/general/MultiThreading.java;hb=HEAD </span></td>
      </tr>
      <tr>
        <td id="L1438" class="blob-num js-line-number" data-line-number="1438"></td>
        <td id="LC1438" class="blob-code blob-code-inner js-file-line"><span class="pl-c">    <span class="pl-c">*/</span></span>  </td>
      </tr>
      <tr>
        <td id="L1439" class="blob-num js-line-number" data-line-number="1439"></td>
        <td id="LC1439" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">Thread</span>[] <span class="pl-en">newThreadArray</span>() {  </td>
      </tr>
      <tr>
        <td id="L1440" class="blob-num js-line-number" data-line-number="1440"></td>
        <td id="LC1440" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> n_cpus <span class="pl-k">=</span> <span class="pl-smi">Runtime</span><span class="pl-k">.</span>getRuntime()<span class="pl-k">.</span>availableProcessors();  </td>
      </tr>
      <tr>
        <td id="L1441" class="blob-num js-line-number" data-line-number="1441"></td>
        <td id="LC1441" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">return</span> <span class="pl-k">new</span> <span class="pl-smi">Thread</span>[n_cpus];  </td>
      </tr>
      <tr>
        <td id="L1442" class="blob-num js-line-number" data-line-number="1442"></td>
        <td id="LC1442" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L1443" class="blob-num js-line-number" data-line-number="1443"></td>
        <td id="LC1443" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L1444" class="blob-num js-line-number" data-line-number="1444"></td>
        <td id="LC1444" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">/*</span>* Start all given threads and wait on each of them until all are done. </span></td>
      </tr>
      <tr>
        <td id="L1445" class="blob-num js-line-number" data-line-number="1445"></td>
        <td id="LC1445" class="blob-code blob-code-inner js-file-line"><span class="pl-c">    * From Stephan Preibisch&#39;s Multithreading.java class. See: </span></td>
      </tr>
      <tr>
        <td id="L1446" class="blob-num js-line-number" data-line-number="1446"></td>
        <td id="LC1446" class="blob-code blob-code-inner js-file-line"><span class="pl-c">    * http://repo.or.cz/w/trakem2.git?a=blob;f=mpi/fruitfly/general/MultiThreading.java;hb=HEAD </span></td>
      </tr>
      <tr>
        <td id="L1447" class="blob-num js-line-number" data-line-number="1447"></td>
        <td id="LC1447" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     * @param threads</span></td>
      </tr>
      <tr>
        <td id="L1448" class="blob-num js-line-number" data-line-number="1448"></td>
        <td id="LC1448" class="blob-code blob-code-inner js-file-line"><span class="pl-c">    <span class="pl-c">*/</span></span>  </td>
      </tr>
      <tr>
        <td id="L1449" class="blob-num js-line-number" data-line-number="1449"></td>
        <td id="LC1449" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">public</span> <span class="pl-k">static</span> <span class="pl-k">void</span> <span class="pl-en">startAndJoin</span>(<span class="pl-k">Thread</span>[] <span class="pl-v">threads</span>)  </td>
      </tr>
      <tr>
        <td id="L1450" class="blob-num js-line-number" data-line-number="1450"></td>
        <td id="LC1450" class="blob-code blob-code-inner js-file-line">    {  </td>
      </tr>
      <tr>
        <td id="L1451" class="blob-num js-line-number" data-line-number="1451"></td>
        <td id="LC1451" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">for</span> (<span class="pl-k">int</span> ithread <span class="pl-k">=</span> <span class="pl-c1">0</span>; ithread <span class="pl-k">&lt;</span> threads<span class="pl-k">.</span>length; <span class="pl-k">++</span>ithread)  </td>
      </tr>
      <tr>
        <td id="L1452" class="blob-num js-line-number" data-line-number="1452"></td>
        <td id="LC1452" class="blob-code blob-code-inner js-file-line">        {  </td>
      </tr>
      <tr>
        <td id="L1453" class="blob-num js-line-number" data-line-number="1453"></td>
        <td id="LC1453" class="blob-code blob-code-inner js-file-line">            threads[ithread]<span class="pl-k">.</span>setPriority(<span class="pl-smi">Thread</span><span class="pl-c1"><span class="pl-k">.</span>NORM_PRIORITY</span>);  </td>
      </tr>
      <tr>
        <td id="L1454" class="blob-num js-line-number" data-line-number="1454"></td>
        <td id="LC1454" class="blob-code blob-code-inner js-file-line">            threads[ithread]<span class="pl-k">.</span>start();  </td>
      </tr>
      <tr>
        <td id="L1455" class="blob-num js-line-number" data-line-number="1455"></td>
        <td id="LC1455" class="blob-code blob-code-inner js-file-line">        }  </td>
      </tr>
      <tr>
        <td id="L1456" class="blob-num js-line-number" data-line-number="1456"></td>
        <td id="LC1456" class="blob-code blob-code-inner js-file-line">  </td>
      </tr>
      <tr>
        <td id="L1457" class="blob-num js-line-number" data-line-number="1457"></td>
        <td id="LC1457" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">try</span>  </td>
      </tr>
      <tr>
        <td id="L1458" class="blob-num js-line-number" data-line-number="1458"></td>
        <td id="LC1458" class="blob-code blob-code-inner js-file-line">        {     </td>
      </tr>
      <tr>
        <td id="L1459" class="blob-num js-line-number" data-line-number="1459"></td>
        <td id="LC1459" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">for</span> (<span class="pl-k">int</span> ithread <span class="pl-k">=</span> <span class="pl-c1">0</span>; ithread <span class="pl-k">&lt;</span> threads<span class="pl-k">.</span>length; <span class="pl-k">++</span>ithread)  </td>
      </tr>
      <tr>
        <td id="L1460" class="blob-num js-line-number" data-line-number="1460"></td>
        <td id="LC1460" class="blob-code blob-code-inner js-file-line">                threads[ithread]<span class="pl-k">.</span>join();  </td>
      </tr>
      <tr>
        <td id="L1461" class="blob-num js-line-number" data-line-number="1461"></td>
        <td id="LC1461" class="blob-code blob-code-inner js-file-line">        } <span class="pl-k">catch</span> (<span class="pl-smi">InterruptedException</span> ie)  </td>
      </tr>
      <tr>
        <td id="L1462" class="blob-num js-line-number" data-line-number="1462"></td>
        <td id="LC1462" class="blob-code blob-code-inner js-file-line">        {  </td>
      </tr>
      <tr>
        <td id="L1463" class="blob-num js-line-number" data-line-number="1463"></td>
        <td id="LC1463" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">throw</span> <span class="pl-k">new</span> <span class="pl-smi">RuntimeException</span>(ie);  </td>
      </tr>
      <tr>
        <td id="L1464" class="blob-num js-line-number" data-line-number="1464"></td>
        <td id="LC1464" class="blob-code blob-code-inner js-file-line">        }  </td>
      </tr>
      <tr>
        <td id="L1465" class="blob-num js-line-number" data-line-number="1465"></td>
        <td id="LC1465" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L1466" class="blob-num js-line-number" data-line-number="1466"></td>
        <td id="LC1466" class="blob-code blob-code-inner js-file-line">    </td>
      </tr>
      <tr>
        <td id="L1467" class="blob-num js-line-number" data-line-number="1467"></td>
        <td id="LC1467" class="blob-code blob-code-inner js-file-line">    <span class="pl-c"><span class="pl-c">//</span>Catches publish info from background thread so that the status can be checked</span></td>
      </tr>
      <tr>
        <td id="L1468" class="blob-num js-line-number" data-line-number="1468"></td>
        <td id="LC1468" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">@Override</span></td>
      </tr>
      <tr>
        <td id="L1469" class="blob-num js-line-number" data-line-number="1469"></td>
        <td id="LC1469" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">protected</span> <span class="pl-k">void</span> <span class="pl-en">process</span>(<span class="pl-k">List&lt;<span class="pl-smi">String</span>&gt;</span> <span class="pl-v">status</span>) {</td>
      </tr>
      <tr>
        <td id="L1470" class="blob-num js-line-number" data-line-number="1470"></td>
        <td id="LC1470" class="blob-code blob-code-inner js-file-line">      currentStatus <span class="pl-k">=</span> status<span class="pl-k">.</span>get(status<span class="pl-k">.</span>size()<span class="pl-k">-</span><span class="pl-c1">1</span>);</td>
      </tr>
      <tr>
        <td id="L1471" class="blob-num js-line-number" data-line-number="1471"></td>
        <td id="LC1471" class="blob-code blob-code-inner js-file-line">   }</td>
      </tr>
      <tr>
        <td id="L1472" class="blob-num js-line-number" data-line-number="1472"></td>
        <td id="LC1472" class="blob-code blob-code-inner js-file-line">   </td>
      </tr>
      <tr>
        <td id="L1473" class="blob-num js-line-number" data-line-number="1473"></td>
        <td id="LC1473" class="blob-code blob-code-inner js-file-line">   <span class="pl-c"><span class="pl-c">//</span>Allows GUI class to get status updates from the worker thread </span></td>
      </tr>
      <tr>
        <td id="L1474" class="blob-num js-line-number" data-line-number="1474"></td>
        <td id="LC1474" class="blob-code blob-code-inner js-file-line">   <span class="pl-k">public</span> <span class="pl-smi">String</span> <span class="pl-en">getStatus</span>(){</td>
      </tr>
      <tr>
        <td id="L1475" class="blob-num js-line-number" data-line-number="1475"></td>
        <td id="LC1475" class="blob-code blob-code-inner js-file-line">       <span class="pl-k">return</span> currentStatus;</td>
      </tr>
      <tr>
        <td id="L1476" class="blob-num js-line-number" data-line-number="1476"></td>
        <td id="LC1476" class="blob-code blob-code-inner js-file-line">   }</td>
      </tr>
      <tr>
        <td id="L1477" class="blob-num js-line-number" data-line-number="1477"></td>
        <td id="LC1477" class="blob-code blob-code-inner js-file-line">   </td>
      </tr>
      <tr>
        <td id="L1478" class="blob-num js-line-number" data-line-number="1478"></td>
        <td id="LC1478" class="blob-code blob-code-inner js-file-line">   <span class="pl-c"><span class="pl-c">//</span>Flags that all active child threads should stop when cancel button is pressed in GUI class</span></td>
      </tr>
      <tr>
        <td id="L1479" class="blob-num js-line-number" data-line-number="1479"></td>
        <td id="LC1479" class="blob-code blob-code-inner js-file-line">   <span class="pl-k">public</span> <span class="pl-k">void</span> <span class="pl-en">interruptThreads</span>(<span class="pl-k">boolean</span> <span class="pl-v">a</span>){</td>
      </tr>
      <tr>
        <td id="L1480" class="blob-num js-line-number" data-line-number="1480"></td>
        <td id="LC1480" class="blob-code blob-code-inner js-file-line">       <span class="pl-c1">this</span><span class="pl-k">.</span>cancelThread <span class="pl-k">=</span> a;</td>
      </tr>
      <tr>
        <td id="L1481" class="blob-num js-line-number" data-line-number="1481"></td>
        <td id="LC1481" class="blob-code blob-code-inner js-file-line">   } </td>
      </tr>
      <tr>
        <td id="L1482" class="blob-num js-line-number" data-line-number="1482"></td>
        <td id="LC1482" class="blob-code blob-code-inner js-file-line">}</td>
      </tr>
</table>


  </div>

  </div>

  <button type="button" data-facebox="#jump-to-line" data-facebox-class="linejump" data-hotkey="l" class="d-none">Jump to Line</button>
  <div id="jump-to-line" style="display:none">
    <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="" class="js-jump-to-line-form" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
      <input class="form-control linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" aria-label="Jump to line" autofocus>
      <button type="submit" class="btn">Go</button>
</form>  </div>

  </div>
  <div class="modal-backdrop js-touch-events"></div>
</div>

    </div>
  </div>

  </div>

      
<div class="container site-footer-container">
  <div class="site-footer " role="contentinfo">
    <ul class="site-footer-links float-right">
        <li><a href="https://github.com/contact" data-ga-click="Footer, go to contact, text:contact">Contact GitHub</a></li>
      <li><a href="https://developer.github.com" data-ga-click="Footer, go to api, text:api">API</a></li>
      <li><a href="https://training.github.com" data-ga-click="Footer, go to training, text:training">Training</a></li>
      <li><a href="https://shop.github.com" data-ga-click="Footer, go to shop, text:shop">Shop</a></li>
        <li><a href="https://github.com/blog" data-ga-click="Footer, go to blog, text:blog">Blog</a></li>
        <li><a href="https://github.com/about" data-ga-click="Footer, go to about, text:about">About</a></li>

    </ul>

    <a href="https://github.com" aria-label="Homepage" class="site-footer-mark" title="GitHub">
      <svg aria-hidden="true" class="octicon octicon-mark-github" height="24" version="1.1" viewBox="0 0 16 16" width="24"><path fill-rule="evenodd" d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0 0 16 8c0-4.42-3.58-8-8-8z"/></svg>
</a>
    <ul class="site-footer-links">
      <li>&copy; 2017 <span title="0.35485s from unicorn-4179671913-t5bmr">GitHub</span>, Inc.</li>
        <li><a href="https://github.com/site/terms" data-ga-click="Footer, go to terms, text:terms">Terms</a></li>
        <li><a href="https://github.com/site/privacy" data-ga-click="Footer, go to privacy, text:privacy">Privacy</a></li>
        <li><a href="https://github.com/security" data-ga-click="Footer, go to security, text:security">Security</a></li>
        <li><a href="https://status.github.com/" data-ga-click="Footer, go to status, text:status">Status</a></li>
        <li><a href="https://help.github.com" data-ga-click="Footer, go to help, text:help">Help</a></li>
    </ul>
  </div>
</div>



  <div id="ajax-error-message" class="ajax-error-message flash flash-error">
    <svg aria-hidden="true" class="octicon octicon-alert" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path fill-rule="evenodd" d="M8.865 1.52c-.18-.31-.51-.5-.87-.5s-.69.19-.87.5L.275 13.5c-.18.31-.18.69 0 1 .19.31.52.5.87.5h13.7c.36 0 .69-.19.86-.5.17-.31.18-.69.01-1L8.865 1.52zM8.995 13h-2v-2h2v2zm0-3h-2V6h2v4z"/></svg>
    <button type="button" class="flash-close js-flash-close js-ajax-error-dismiss" aria-label="Dismiss error">
      <svg aria-hidden="true" class="octicon octicon-x" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z"/></svg>
    </button>
    You can't perform that action at this time.
  </div>


    
    <script crossorigin="anonymous" integrity="sha256-gBuTF1N7H6yXvP2aQTKbuyEvx+HxrDT55EaIF+li1cI=" src="https://assets-cdn.github.com/assets/frameworks-801b9317537b1fac97bcfd9a41329bbb212fc7e1f1ac34f9e4468817e962d5c2.js"></script>
    
    <script async="async" crossorigin="anonymous" integrity="sha256-QOH+WphThR4CtM9u0iG+LKfhRjMHOZ/0ccJD9dXbbLg=" src="https://assets-cdn.github.com/assets/github-40e1fe5a9853851e02b4cf6ed221be2ca7e1463307399ff471c243f5d5db6cb8.js"></script>
    
    
    
    
  <div class="js-stale-session-flash stale-session-flash flash flash-warn flash-banner d-none">
    <svg aria-hidden="true" class="octicon octicon-alert" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path fill-rule="evenodd" d="M8.865 1.52c-.18-.31-.51-.5-.87-.5s-.69.19-.87.5L.275 13.5c-.18.31-.18.69 0 1 .19.31.52.5.87.5h13.7c.36 0 .69-.19.86-.5.17-.31.18-.69.01-1L8.865 1.52zM8.995 13h-2v-2h2v2zm0-3h-2V6h2v4z"/></svg>
    <span class="signed-in-tab-flash">You signed in with another tab or window. <a href="">Reload</a> to refresh your session.</span>
    <span class="signed-out-tab-flash">You signed out in another tab or window. <a href="">Reload</a> to refresh your session.</span>
  </div>
  <div class="facebox" id="facebox" style="display:none;">
  <div class="facebox-popup">
    <div class="facebox-content" role="dialog" aria-labelledby="facebox-header" aria-describedby="facebox-description">
    </div>
    <button type="button" class="facebox-close js-facebox-close" aria-label="Close modal">
      <svg aria-hidden="true" class="octicon octicon-x" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z"/></svg>
    </button>
  </div>
</div>


  </body>
</html>

