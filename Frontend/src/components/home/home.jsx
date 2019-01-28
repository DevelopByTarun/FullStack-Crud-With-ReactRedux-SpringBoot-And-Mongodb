import React, { Component } from 'react'
import '../contents/css/home/home.css';
import homeimg from '../contents/images/home/homy.jpg';

class Home extends Component {

  render () {

    const homyjsx1 = <h1 id="setHead">SpringBoot Crud With React Redux And Mongodb</h1>;

    const homyjsx2 =  <div class="row">
    <div class="col-sm-12">
      <br/>
      <br/>
      <br/>
      <div class="text-center">
        <img class="img-fluid" src={homeimg} alt="img" />
      </div>
      <br/>
      <br/>
      <br/>
    </div>
  </div>;

    return (
      <div>
        <div class="text-center" id="jumb">
          {homyjsx1}
        </div>
        <div class="container-fluid">
          {homyjsx2}
        </div>
      </div>
    );
  }
}
export default Home;
