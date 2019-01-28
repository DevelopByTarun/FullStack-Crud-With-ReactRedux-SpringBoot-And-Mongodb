import React, { Component } from 'react'
import '../contents/css/footer/footer.css';

class Footer extends Component {

    render () {

        const footerjsx = <div class="row">
        <div class="col-sm-12">
            <div class="footer">
                <p id="setfooter">2018 © Crud. All rights reserved | Design By&nbsp;
                    <a href="https://github.com/DevelopByTarun">TarunParve</a>
                </p>
            </div>
        </div>
    </div>;

        return (
            <div class="container-fluid">
                {footerjsx}
            </div>
        );
    }
}

export default Footer;