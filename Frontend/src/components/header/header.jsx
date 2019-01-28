import React, { Component } from 'react'
import { NavLink } from 'react-router-dom';
import '../contents/css/header/header.css';

class Header extends Component {

  render () {

    const mainjsx = <a class="navbar-brand" href="#a">SBRR-Crud</a>;

    const homelinkjsx = <a class="nav-item nav-link" tag={NavLink} href="/">
    <i class="fa fa-home"></i> &nbsp;Home <span class="sr-only">(current)</span>
    </a>;

    const addbooklinkjsx = <a class="nav-item nav-link" tag={NavLink} href="/addbk">
    <i class="fas fa-save"></i> &nbsp;Add Book
    </a>;

    const fetchbookslinkjsx = <a class="nav-item nav-link" tag={NavLink} href="/fetchbk">
    <i class="fas fa-archive"></i> &nbsp;Fetch Books
    </a>;

    const updatebooklinkjsx = <a class="nav-item nav-link" tag={NavLink} href="/updatebk">
    <i class="fas fa-edit"></i> &nbsp;Update Book
    </a>;

    return (
<div className="setting_navs">
  <nav class="navbar navbar-expand-lg navbar-dark bg-danger">
    {mainjsx}&nbsp;&nbsp;&nbsp;
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
      aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
      <div class="navbar-nav activy" id="tab">
        {homelinkjsx} {addbooklinkjsx} {fetchbookslinkjsx} {updatebooklinkjsx}
      </div>
    </div>
  </nav>
</div>
    );
  }
}
export default Header;
