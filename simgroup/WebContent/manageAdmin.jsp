<%
HttpSession sessionn = request.getSession(true);
String id=(String)sessionn.getAttribute("id");
System.out.println("id from session check view admin"+id);

if(id==null || id.equals("")){
	sessionn.setAttribute("statuscode", "300");
	sessionn.setAttribute("StatusMessage", "NOK");
	sessionn.setAttribute("ErrorMessage", "Please Login Again!");
	//response.sendRedirect("index.jsp");
	request.getRequestDispatcher("index.jsp").forward(request, response); 
}



%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">


    <!-- Twitter -->
    <meta name="twitter:site" content="@themepixels">
    <meta name="twitter:creator" content="@themepixels">
    <meta name="twitter:card" content="summary_large_image">
    <meta name="twitter:title" content="Bracket">
    <meta name="twitter:description" content="Premium Quality and Responsive UI for Dashboard.">
    <meta name="twitter:image" content="http://themepixels.me/bracket/img/bracket-social.png">

    <!-- Facebook -->
    <meta property="og:url" content="http://themepixels.me/bracket">
    <meta property="og:title" content="Bracket">
    <meta property="og:description" content="Premium Quality and Responsive UI for Dashboard.">

    <meta property="og:image" content="http://themepixels.me/bracket/img/bracket-social.png">
    <meta property="og:image:secure_url" content="http://themepixels.me/bracket/img/bracket-social.png">
    <meta property="og:image:type" content="image/png">
    <meta property="og:image:width" content="1200">
    <meta property="og:image:height" content="600">

    <!-- Meta -->
    <meta name="description" content="Premium Quality and Responsive UI for Dashboard.">
    <meta name="author" content="ThemePixels">

    <title>Bracket Responsive Bootstrap 4 Admin Template</title>

    <!-- vendor css -->
    <link href="../CardDistributedSystem/resources/lib/font-awesome/css/font-awesome.css" rel="stylesheet">
    <link href="../CardDistributedSystem/resources/lib/Ionicons/css/ionicons.css" rel="stylesheet">
    <link href="../CardDistributedSystem/resources/lib/perfect-scrollbar/css/perfect-scrollbar.css" rel="stylesheet">
    <link href="../CardDistributedSystem/resources/lib/jquery-switchbutton/jquery.switchButton.css" rel="stylesheet">
    <link href="../CardDistributedSystem/resources/lib/rickshaw/rickshaw.min.css" rel="stylesheet">
    <link href="../CardDistributedSystem/resources/lib/chartist/chartist.css" rel="stylesheet">

    <!-- Bracket CSS -->
    <link rel="stylesheet" href="../CardDistributedSystem/resources/css/bracket.css">
  </head>

  <body>

    <!-- ########## START: LEFT PANEL ########## -->
    <div class="br-logo"><a href=""><span>[</span>Sim Group<span>]</span></a></div>
    <div class="br-sideleft overflow-y-auto">
      <label class="sidebar-label pd-x-15 mg-t-20">Navigation</label>
      <div class="br-sideleft-menu">
        <a href="#" class="br-menu-link">
          <div class="br-menu-item">
            <i class="menu-item-icon icon ion-ios-filing-outline tx-24"></i>
            <span class="menu-item-label">Home</span>
            <i class="menu-item-arrow fa fa-angle-down"></i>
          </div><!-- menu-item -->
        </a><!-- br-menu-link -->
        <ul class="br-menu-sub nav flex-column">
          <li class="nav-item"><a href="../CardDistributedSystem/home.jsp" class="nav-link">Home</a></li>
        </ul>
        <a href="#" class="br-menu-link">
          <div class="br-menu-item">
            <i class="menu-item-icon icon ion-ios-filing-outline tx-24"></i>
            <span class="menu-item-label">Manage Admin</span>
            <i class="menu-item-arrow fa fa-angle-down"></i>
          </div><!-- menu-item -->
        </a><!-- br-menu-link -->
        <ul class="br-menu-sub nav flex-column">
          <li class="nav-item"><a href="../CardDistributedSystem/viewAdmin?page_type=admin_page&page=0" class="nav-link">View Admin</a></li>
          <li class="nav-item"><a href="../CardDistributedSystem/manageAdmin?page_type=manage_admin_page&page=0" class="nav-link">Manage Branch</a></li>
          <li class="nav-item"><a href="../CardDistributedSystem/setHourlyJoin?page_type=set_hourly_join" class="nav-link">Set Hourly Join</a></li>
          <li class="nav-item"><a href="cards.html" class="nav-link">Set Hourly Payment</a></li>
          <li class="nav-item"><a href="icons.html" class="nav-link">Set Withdrawl Status</a></li>
          <li class="nav-item"><a href="modal.html" class="nav-link">Manage Notice</a></li>
        </ul>
		<a href="#" class="br-menu-link">
          <div class="br-menu-item">
            <i class="menu-item-icon icon ion-ios-filing-outline tx-24"></i>
            <span class="menu-item-label">Manage Assosiate</span>
            <i class="menu-item-arrow fa fa-angle-down"></i>
          </div><!-- menu-item -->
        </a><!-- br-menu-link -->
        <ul class="br-menu-sub nav flex-column">
          <li class="nav-item"><a href="../CardDistributedSystem/viewAssosiate?page_type=view_associate&page=0" class="nav-link">View Assosiate</a></li>
          <li class="nav-item"><a href="../CardDistributedSystem/addNewAssosiate?page_type=addNewAssosiate" class="nav-link">Add New Assosiate</a></li>
          <li class="nav-item"><a href="../CardDistributedSystem/viewAssosiateDateWise?page_type=viewAssosiateDateWise" class="nav-link">View Assosiate(Date-Wise)</a></li>
          <li class="nav-item"><a href="../CardDistributedSystem/viewTopupDateWise?page_type=viewTopupDateWise" class="nav-link">View Topup(Date-Wise)</a></li>
          <li class="nav-item"><a href="../CardDistributedSystem/ViewKycDateWise?page_type=ViewKycDateWise" class="nav-link">View KYC(Date-Wise)</a></li>
          <li class="nav-item"><a href="../CardDistributedSystem/ViewTopupMemberWise?page_type=ViewTopupMemberWise" class="nav-link">View Topup(Member-Wise)</a></li>
		  <li class="nav-item"><a href="../CardDistributedSystem/viewAssosiateMobileNo?page_type=viewAssosiateMobileNo" class="nav-link">View Assosiate(Mobile No)</a></li>
        </ul>
		<a href="#" class="br-menu-link">
          <div class="br-menu-item">
            <i class="menu-item-icon icon ion-ios-filing-outline tx-24"></i>
            <span class="menu-item-label">Manage Package</span>
            <i class="menu-item-arrow fa fa-angle-down"></i>
          </div><!-- menu-item -->
        </a><!-- br-menu-link -->
        <ul class="br-menu-sub nav flex-column">
          <li class="nav-item"><a href="accordion.html" class="nav-link">View Package</a></li>
          <li class="nav-item"><a href="alerts.html" class="nav-link">Add Package</a></li>
        </ul>
		<a href="#" class="br-menu-link">
          <div class="br-menu-item">
            <i class="menu-item-icon icon ion-ios-filing-outline tx-24"></i>
            <span class="menu-item-label">Manage Loan Details</span>
            <i class="menu-item-arrow fa fa-angle-down"></i>
          </div><!-- menu-item -->
        </a><!-- br-menu-link -->
        <ul class="br-menu-sub nav flex-column">
          <li class="nav-item"><a href="accordion.html" class="nav-link">View Loans</a></li>
          <li class="nav-item"><a href="alerts.html" class="nav-link">View Salary</a></li>
          <li class="nav-item"><a href="buttons.html" class="nav-link">Current Withdrawal Request</a></li>
          <li class="nav-item"><a href="cards.html" class="nav-link">Previous Withdrawal Request</a></li>
          <li class="nav-item"><a href="icons.html" class="nav-link">View Repayment Details</a></li>
        </ul>
		<a href="#" class="br-menu-link">
          <div class="br-menu-item">
            <i class="menu-item-icon icon ion-ios-filing-outline tx-24"></i>
            <span class="menu-item-label">Manage Payment</span>
            <i class="menu-item-arrow fa fa-angle-down"></i>
          </div><!-- menu-item -->
        </a><!-- br-menu-link -->
        <ul class="br-menu-sub nav flex-column">
          <li class="nav-item"><a href="accordion.html" class="nav-link">View Matching Payment</a></li>
          <li class="nav-item"><a href="alerts.html" class="nav-link">TDS Report</a></li>
        </ul>
        <a href="#" class="br-menu-link">
          <div class="br-menu-item">
            <i class="menu-item-icon ion-ios-redo-outline tx-24"></i>
            <span class="menu-item-label">Manage E-PIN</span>
            <i class="menu-item-arrow fa fa-angle-down"></i>
          </div><!-- menu-item -->
        </a><!-- br-menu-link -->
        <ul class="br-menu-sub nav flex-column">
          <li class="nav-item"><a href="navigation.html" class="nav-link">New E-PIN</a></li>
          <li class="nav-item"><a href="navigation-layouts.html" class="nav-link">Unused E-PIN</a></li>
		  <li class="nav-item"><a href="navigation-layouts.html" class="nav-link">Used E-PIN</a></li>
        </ul>
		<a href="#" class="br-menu-link">
          <div class="br-menu-item">
            <i class="menu-item-icon ion-ios-redo-outline tx-24"></i>
            <span class="menu-item-label">Manage E-PIN Request</span>
            <i class="menu-item-arrow fa fa-angle-down"></i>
          </div><!-- menu-item -->
        </a><!-- br-menu-link -->
        <ul class="br-menu-sub nav flex-column">
          <li class="nav-item"><a href="navigation.html" class="nav-link">Manage E-PIN Request</a></li>
          <li class="nav-item"><a href="navigation-layouts.html" class="nav-link">E-PIN Request(Date-Wise)</a></li>
		</ul>
		<a href="#" class="br-menu-link">
          <div class="br-menu-item">
            <i class="menu-item-icon ion-ios-redo-outline tx-24"></i>
            <span class="menu-item-label">Withdrawal Request Details</span>
            <i class="menu-item-arrow fa fa-angle-down"></i>
          </div><!-- menu-item -->
        </a><!-- br-menu-link -->
        <ul class="br-menu-sub nav flex-column">
          <li class="nav-item"><a href="navigation.html" class="nav-link">Current Withdrawal Request Details</a></li>
          <li class="nav-item"><a href="navigation-layouts.html" class="nav-link">previous Withdrawal Request Details</a></li>
		</ul>
		<a href="#" class="br-menu-link">
          <div class="br-menu-item">
            <i class="menu-item-icon ion-ios-redo-outline tx-24"></i>
            <span class="menu-item-label">Fund Request Details</span>
            <i class="menu-item-arrow fa fa-angle-down"></i>
          </div><!-- menu-item -->
        </a><!-- br-menu-link -->
        <ul class="br-menu-sub nav flex-column">
          <li class="nav-item"><a href="navigation.html" class="nav-link">Current Fund Request Details</a></li>
          <li class="nav-item"><a href="navigation-layouts.html" class="nav-link">previous Fund Request Details</a></li>
		</ul>
		<a href="#" class="br-menu-link">
          <div class="br-menu-item">
            <i class="menu-item-icon ion-ios-redo-outline tx-24"></i>
            <span class="menu-item-label">Manage Wallet</span>
            <i class="menu-item-arrow fa fa-angle-down"></i>
          </div><!-- menu-item -->
        </a><!-- br-menu-link -->
        <ul class="br-menu-sub nav flex-column">
          <li class="nav-item"><a href="navigation.html" class="nav-link">Transfer Wallet</a></li>
          <li class="nav-item"><a href="navigation-layouts.html" class="nav-link">Transfer Wallet(Member-Wise)</a></li>
		  <li class="nav-item"><a href="navigation-layouts.html" class="nav-link">Wallet Correction</a></li>
		  <li class="nav-item"><a href="navigation-layouts.html" class="nav-link">Transfer History</a></li>
		</ul>
		<a href="#" class="br-menu-link">
          <div class="br-menu-item">
            <i class="menu-item-icon ion-ios-redo-outline tx-24"></i>
            <span class="menu-item-label">Manage Distributor Request</span>
            <i class="menu-item-arrow fa fa-angle-down"></i>
          </div><!-- menu-item -->
        </a><!-- br-menu-link -->
        <ul class="br-menu-sub nav flex-column">
          <li class="nav-item"><a href="navigation.html" class="nav-link">Manage Distributor Request</a></li>
        </ul>
		<a href="#" class="br-menu-link">
          <div class="br-menu-item">
            <i class="menu-item-icon ion-ios-redo-outline tx-24"></i>
            <span class="menu-item-label">Change Password</span>
            <i class="menu-item-arrow fa fa-angle-down"></i>
          </div><!-- menu-item -->
        </a><!-- br-menu-link -->
        <ul class="br-menu-sub nav flex-column">
          <li class="nav-item"><a href="navigation.html" class="nav-link">Change Password</a></li>
		  <li class="nav-item"><a href="navigation.html" class="nav-link">Change Password & Send SMS</a></li>
        </ul>
		<a href="#" class="br-menu-link">
          <div class="br-menu-item">
            <i class="menu-item-icon ion-ios-redo-outline tx-24"></i>
            <span class="menu-item-label">Login History</span>
            <i class="menu-item-arrow fa fa-angle-down"></i>
          </div><!-- menu-item -->
        </a><!-- br-menu-link -->
        <ul class="br-menu-sub nav flex-column">
          <li class="nav-item"><a href="navigation.html" class="nav-link">Login History</a></li>
		</ul>
        <a href="#" class="br-menu-link">
          <div class="br-menu-item">
            <i class="menu-item-icon ion-ios-pie-outline tx-20"></i>
            <span class="menu-item-label">Manage Admin Control</span>
            <i class="menu-item-arrow fa fa-angle-down"></i>
          </div><!-- menu-item -->
        </a><!-- br-menu-link -->
        <ul class="br-menu-sub nav flex-column">
          <li class="nav-item"><a href="chart-morris.html" class="nav-link">Admin COntrol</a></li>
          <li class="nav-item"><a href="chart-flot.html" class="nav-link">Manage Own Admin Control</a></li>
        </ul>
        <a href="#" class="br-menu-link">
          <div class="br-menu-item">
            <i class="menu-item-icon icon ion-ios-gear-outline tx-24"></i>
            <span class="menu-item-label">Manage SMS</span>
            <i class="menu-item-arrow fa fa-angle-down"></i>
          </div><!-- menu-item -->
        </a><!-- br-menu-link -->
        <ul class="br-menu-sub nav flex-column">
          <li class="nav-item"><a href="form-elements.html" class="nav-link">Send SMS</a></li>
        </ul>
        <a href="#" class="br-menu-link">
          <div class="br-menu-item">
            <i class="menu-item-icon icon ion-ios-bookmarks-outline tx-20"></i>
            <span class="menu-item-label">LogOut</span>
            <i class="menu-item-arrow fa fa-angle-down"></i>
          </div><!-- menu-item -->
        </a><!-- br-menu-link -->
        <ul class="br-menu-sub nav flex-column">
          <li class="nav-item"><a href="../CardDistributedSystem/LogOut" class="nav-link">LogOut</a></li>
        </ul>
      </div><!-- br-sideleft-menu -->

      

      <br>
    </div><!-- br-sideleft -->
    <!-- ########## END: LEFT PANEL ########## -->

    <!-- ########## START: HEAD PANEL ########## -->
    <div class="br-header">
      <div class="br-header-left">
        <div class="navicon-left hidden-md-down"><a id="btnLeftMenu" href=""><i class="icon ion-navicon-round"></i></a></div>
        <div class="navicon-left hidden-lg-up"><a id="btnLeftMenuMobile" href=""><i class="icon ion-navicon-round"></i></a></div>
        <div class="input-group hidden-xs-down wd-170 transition">
          <input id="searchbox" type="text" class="form-control" value="Welcome Admin" disabled>
          <span>
          </span>
        </div><!-- input-group -->
      </div><!-- br-header-left -->
      <div class="br-header-right">
        <nav class="nav">
          
          <div class="dropdown">
            <a href="" class="nav-link nav-link-profile" data-toggle="dropdown">
              <span class="logged-name hidden-md-down"><%=(String) request.getSession().getAttribute("uname")%></span>
              <img src="http://via.placeholder.com/64x64" class="wd-32 rounded-circle" alt="">
              <span class="square-10 bg-success"></span>
            </a>
            <div class="dropdown-menu dropdown-menu-header wd-200">
              <ul class="list-unstyled user-profile-nav">
                
                <li><a href="../CardDistributedSystem/LogOut"><i class="icon ion-power"></i> Sign Out</a></li>
              </ul>
            </div><!-- dropdown-menu -->
          </div><!-- dropdown -->
        </nav>
        
      </div><!-- br-header-right -->
    </div><!-- br-header -->
    <!-- ########## END: HEAD PANEL ########## -->

    <!-- ########## START: RIGHT PANEL ########## -->
    <div class="br-sideright">
      <ul class="nav nav-tabs sidebar-tabs" role="tablist">
        <li class="nav-item">
          <a class="nav-link active" data-toggle="tab" role="tab" href="#contacts"><i class="icon ion-ios-contact-outline tx-24"></i></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" data-toggle="tab" role="tab" href="#attachments"><i class="icon ion-ios-folder-outline tx-22"></i></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" data-toggle="tab" role="tab" href="#calendar"><i class="icon ion-ios-calendar-outline tx-24"></i></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" data-toggle="tab" role="tab" href="#settings"><i class="icon ion-ios-gear-outline tx-24"></i></a>
        </li>
      </ul><!-- sidebar-tabs -->

      <!-- Tab panes -->
      <div class="tab-content">
        <div class="tab-pane pos-absolute a-0 mg-t-60 overflow-y-auto active" id="contacts" role="tabpanel">
          <label class="sidebar-label pd-x-25 mg-t-25">Online Contacts</label>
          <div class="contact-list pd-x-10">
            <a href="" class="contact-list-link new">
              <div class="d-flex">
                <div class="pos-relative">
                  <img src="http://via.placeholder.com/280x280" class="wd-40 rounded-circle" alt="">
                  <div class="contact-status-indicator bg-success"></div>
                </div>
                <div class="contact-person">
                  <p class="mg-b-0">Marilyn Tarter</p>
                  <span class="tx-12 op-5 d-inline-block">Clemson, CA</span>
                </div>
                <span class="tx-info tx-12"><span class="square-8 bg-info rounded-circle"></span> 1 new</span>
              </div><!-- d-flex -->
            </a><!-- contact-list-link -->
            <a href="" class="contact-list-link">
              <div class="d-flex">
                <div class="pos-relative">
                  <img src="http://via.placeholder.com/280x280" class="wd-40 rounded-circle" alt="">
                  <div class="contact-status-indicator bg-success"></div>
                </div>
                <div class="contact-person">
                  <p class="mg-b-0 ">Belinda Connor</p>
                  <span class="tx-12 op-5 d-inline-block">Fort Kent, ME</span>
                </div>
              </div><!-- d-flex -->
            </a><!-- contact-list-link -->
            <a href="" class="contact-list-link new">
              <div class="d-flex">
                <div class="pos-relative">
                  <img src="http://via.placeholder.com/280x280" class="wd-40 rounded-circle" alt="">
                  <div class="contact-status-indicator bg-success"></div>
                </div>
                <div class="contact-person">
                  <p class="mg-b-0">Britanny Cevallos</p>
                  <span class="tx-12 op-5 d-inline-block">Shiboygan Falls, WI</span>
                </div>
                <span class="tx-info tx-12"><span class="square-8 bg-info rounded-circle"></span> 3 new</span>
              </div><!-- d-flex -->
            </a><!-- contact-list-link -->
            <a href="" class="contact-list-link new">
              <div class="d-flex">
                <div class="pos-relative">
                  <img src="http://via.placeholder.com/280x280" class="wd-40 rounded-circle" alt="">
                  <div class="contact-status-indicator bg-success"></div>
                </div>
                <div class="contact-person">
                  <p class="mg-b-0">Brandon Lawrence</p>
                  <span class="tx-12 op-5 d-inline-block">Snohomish, WA</span>
                </div>
                <span class="tx-info tx-12"><span class="square-8 bg-info rounded-circle"></span> 1 new</span>
              </div><!-- d-flex -->
            </a><!-- contact-list-link -->
            <a href="" class="contact-list-link">
              <div class="d-flex">
                <div class="pos-relative">
                  <img src="http://via.placeholder.com/280x280" class="wd-40 rounded-circle" alt="">
                  <div class="contact-status-indicator bg-success"></div>
                </div>
                <div class="contact-person">
                  <p class="mg-b-0">Andrew Wiggins</p>
                  <span class="tx-12 op-5 d-inline-block">Springfield, MA</span>
                </div>
              </div><!-- d-flex -->
            </a><!-- contact-list-link -->
            <a href="" class="contact-list-link">
              <div class="d-flex">
                <div class="pos-relative">
                  <img src="http://via.placeholder.com/280x280" class="wd-40 rounded-circle" alt="">
                  <div class="contact-status-indicator bg-success"></div>
                </div>
                <div class="contact-person">
                  <p class="mg-b-0">Theodore Gristen</p>
                  <span class="tx-12 op-5 d-inline-block">Nashville, TN</span>
                </div>
              </div><!-- d-flex -->
            </a><!-- contact-list-link -->
            <a href="" class="contact-list-link">
              <div class="d-flex">
                <div class="pos-relative">
                  <img src="http://via.placeholder.com/280x280" class="wd-40 rounded-circle" alt="">
                  <div class="contact-status-indicator bg-success"></div>
                </div>
                <div class="contact-person">
                  <p class="mg-b-0">Deborah Miner</p>
                  <span class="tx-12 op-5 d-inline-block">North Shore, CA</span>
                </div>
              </div><!-- d-flex -->
            </a><!-- contact-list-link -->
          </div><!-- contact-list -->


          <label class="sidebar-label pd-x-25 mg-t-25">Offline Contacts</label>
          <div class="contact-list pd-x-10">
            <a href="" class="contact-list-link">
              <div class="d-flex">
                <div class="pos-relative">
                  <img src="http://via.placeholder.com/280x280" class="wd-40 rounded-circle" alt="">
                  <div class="contact-status-indicator bg-gray-500"></div>
                </div>
                <div class="contact-person">
                  <p class="mg-b-0">Marilyn Tarter</p>
                  <span class="tx-12 op-5 d-inline-block">Clemson, CA</span>
                </div>
              </div><!-- d-flex -->
            </a><!-- contact-list-link -->
            <a href="" class="contact-list-link">
              <div class="d-flex">
                <div class="pos-relative">
                  <img src="http://via.placeholder.com/280x280" class="wd-40 rounded-circle" alt="">
                  <div class="contact-status-indicator bg-gray-500"></div>
                </div>
                <div class="mg-l-10">
                  <p class="mg-b-0">Belinda Connor</p>
                  <span class="tx-12 op-5 d-inline-block">Fort Kent, ME</span>
                </div>
              </div><!-- d-flex -->
            </a><!-- contact-list-link -->
            <a href="" class="contact-list-link">
              <div class="d-flex">
                <div class="pos-relative">
                  <img src="http://via.placeholder.com/280x280" class="wd-40 rounded-circle" alt="">
                  <div class="contact-status-indicator bg-gray-500"></div>
                </div>
                <div class="contact-person">
                  <p class="mg-b-0">Britanny Cevallos</p>
                  <span class="tx-12 op-5 d-inline-block">Shiboygan Falls, WI</span>
                </div>
              </div><!-- d-flex -->
            </a><!-- contact-list-link -->
            <a href="" class="contact-list-link">
              <div class="d-flex">
                <div class="pos-relative">
                  <img src="http://via.placeholder.com/280x280" class="wd-40 rounded-circle" alt="">
                  <div class="contact-status-indicator bg-gray-500"></div>
                </div>
                <div class="contact-person">
                  <p class="mg-b-0">Brandon Lawrence</p>
                  <span class="tx-12 op-5 d-inline-block">Snohomish, WA</span>
                </div>
              </div><!-- d-flex -->
            </a><!-- contact-list-link -->
            <a href="" class="contact-list-link">
              <div class="d-flex">
                <div class="pos-relative">
                  <img src="http://via.placeholder.com/280x280" class="wd-40 rounded-circle" alt="">
                  <div class="contact-status-indicator bg-gray-500"></div>
                </div>
                <div class="contact-person">
                  <p class="mg-b-0">Andrew Wiggins</p>
                  <span class="tx-12 op-5 d-inline-block">Springfield, MA</span>
                </div>
              </div><!-- d-flex -->
            </a><!-- contact-list-link -->
            <a href="" class="contact-list-link">
              <div class="d-flex">
                <div class="pos-relative">
                  <img src="http://via.placeholder.com/280x280" class="wd-40 rounded-circle" alt="">
                  <div class="contact-status-indicator bg-gray-500"></div>
                </div>
                <div class="contact-person">
                  <p class="mg-b-0">Theodore Gristen</p>
                  <span class="tx-12 op-5 d-inline-block">Nashville, TN</span>
                </div>
              </div><!-- d-flex -->
            </a><!-- contact-list-link -->
            <a href="" class="contact-list-link">
              <div class="d-flex">
                <div class="pos-relative">
                  <img src="http://via.placeholder.com/280x280" class="wd-40 rounded-circle" alt="">
                  <div class="contact-status-indicator bg-gray-500"></div>
                </div>
                <div class="contact-person">
                  <p class="mg-b-0">Deborah Miner</p>
                  <span class="tx-12 op-5 d-inline-block">North Shore, CA</span>
                </div>
              </div><!-- d-flex -->
            </a><!-- contact-list-link -->
          </div><!-- contact-list -->

        </div><!-- #contacts -->


        <div class="tab-pane pos-absolute a-0 mg-t-60 overflow-y-auto" id="attachments" role="tabpanel">
          <label class="sidebar-label pd-x-25 mg-t-25">Recent Attachments</label>
          <div class="media-file-list">
            <div class="media">
              <div class="pd-10 bg-primary wd-50 ht-60 tx-center d-flex align-items-center justify-content-center">
                <i class="fa fa-file-image-o tx-28 tx-white"></i>
              </div>
              <div class="media-body">
                <p class="mg-b-0 tx-13">IMG_43445</p>
                <p class="mg-b-0 tx-12 op-5">JPG Image</p>
                <p class="mg-b-0 tx-12 op-5">1.2mb</p>
              </div><!-- media-body -->
              <a href="" class="more"><i class="icon ion-android-more-vertical tx-18"></i></a>
            </div><!-- media -->
            <div class="media mg-t-20">
              <div class="pd-10 bg-purple wd-50 ht-60 tx-center d-flex align-items-center justify-content-center">
                <i class="fa fa-file-video-o tx-28 tx-white"></i>
              </div>
              <div class="media-body">
                <p class="mg-b-0 tx-13">VID_6543</p>
                <p class="mg-b-0 tx-12 op-5">MP4 Video</p>
                <p class="mg-b-0 tx-12 op-5">24.8mb</p>
              </div><!-- media-body -->
              <a href="" class="more"><i class="icon ion-android-more-vertical tx-18"></i></a>
            </div><!-- media -->
            <div class="media mg-t-20">
              <div class="pd-10 bg-success wd-50 ht-60 tx-center d-flex align-items-center justify-content-center">
                <i class="fa fa-file-word-o tx-28 tx-white"></i>
              </div>
              <div class="media-body">
                <p class="mg-b-0 tx-13">Tax_Form</p>
                <p class="mg-b-0 tx-12 op-5">Word Document</p>
                <p class="mg-b-0 tx-12 op-5">5.5mb</p>
              </div><!-- media-body -->
              <a href="" class="more"><i class="icon ion-android-more-vertical tx-18"></i></a>
            </div><!-- media -->
            <div class="media mg-t-20">
              <div class="pd-10 bg-warning wd-50 ht-60 tx-center d-flex align-items-center justify-content-center">
                <i class="fa fa-file-pdf-o tx-28 tx-white"></i>
              </div>
              <div class="media-body">
                <p class="mg-b-0 tx-13">Getting_Started</p>
                <p class="mg-b-0 tx-12 op-5">PDF Document</p>
                <p class="mg-b-0 tx-12 op-5">12.7mb</p>
              </div><!-- media-body -->
              <a href="" class="more"><i class="icon ion-android-more-vertical tx-18"></i></a>
            </div><!-- media -->
            <div class="media mg-t-20">
              <div class="pd-10 bg-warning wd-50 ht-60 tx-center d-flex align-items-center justify-content-center">
                <i class="fa fa-file-pdf-o tx-28 tx-white"></i>
              </div>
              <div class="media-body">
                <p class="mg-b-0 tx-13">Introduction</p>
                <p class="mg-b-0 tx-12 op-5">PDF Document</p>
                <p class="mg-b-0 tx-12 op-5">7.7mb</p>
              </div><!-- media-body -->
              <a href="" class="more"><i class="icon ion-android-more-vertical tx-18"></i></a>
            </div><!-- media -->
            <div class="media mg-t-20">
              <div class="pd-10 bg-primary wd-50 ht-60 tx-center d-flex align-items-center justify-content-center">
                <i class="fa fa-file-image-o tx-28 tx-white"></i>
              </div>
              <div class="media-body">
                <p class="mg-b-0 tx-13">IMG_43420</p>
                <p class="mg-b-0 tx-12 op-5">JPG Image</p>
                <p class="mg-b-0 tx-12 op-5">2.2mb</p>
              </div><!-- media-body -->
              <a href="" class="more"><i class="icon ion-android-more-vertical tx-18"></i></a>
            </div><!-- media -->
            <div class="media mg-t-20">
              <div class="pd-10 bg-primary wd-50 ht-60 tx-center d-flex align-items-center justify-content-center">
                <i class="fa fa-file-image-o tx-28 tx-white"></i>
              </div>
              <div class="media-body">
                <p class="mg-b-0 tx-13">IMG_43447</p>
                <p class="mg-b-0 tx-12 op-5">JPG Image</p>
                <p class="mg-b-0 tx-12 op-5">3.2mb</p>
              </div><!-- media-body -->
              <a href="" class="more"><i class="icon ion-android-more-vertical tx-18"></i></a>
            </div><!-- media -->
            <div class="media mg-t-20">
              <div class="pd-10 bg-purple wd-50 ht-60 tx-center d-flex align-items-center justify-content-center">
                <i class="fa fa-file-video-o tx-28 tx-white"></i>
              </div>
              <div class="media-body">
                <p class="mg-b-0 tx-13">VID_6545</p>
                <p class="mg-b-0 tx-12 op-5">AVI Video</p>
                <p class="mg-b-0 tx-12 op-5">14.8mb</p>
              </div><!-- media-body -->
              <a href="" class="more"><i class="icon ion-android-more-vertical tx-18"></i></a>
            </div><!-- media -->
            <div class="media mg-t-20">
              <div class="pd-10 bg-success wd-50 ht-60 tx-center d-flex align-items-center justify-content-center">
                <i class="fa fa-file-word-o tx-28 tx-white"></i>
              </div>
              <div class="media-body">
                <p class="mg-b-0 tx-13">Secret_Document</p>
                <p class="mg-b-0 tx-12 op-5">Word Document</p>
                <p class="mg-b-0 tx-12 op-5">4.5mb</p>
              </div><!-- media-body -->
              <a href="" class="more"><i class="icon ion-android-more-vertical tx-18"></i></a>
            </div><!-- media -->
          </div><!-- media-list -->
        </div><!-- #history -->
        <div class="tab-pane pos-absolute a-0 mg-t-60 overflow-y-auto" id="calendar" role="tabpanel">
          <label class="sidebar-label pd-x-25 mg-t-25">Time &amp; Date</label>
          <div class="pd-x-25">
            <h2 id="brTime" class="tx-white tx-lato mg-b-5"></h2>
            <h6 id="brDate" class="tx-white tx-light op-3"></h6>
          </div>

          <label class="sidebar-label pd-x-25 mg-t-25">Events Calendar</label>
          <div class="datepicker sidebar-datepicker"></div>


          <label class="sidebar-label pd-x-25 mg-t-25">Event Today</label>
          <div class="pd-x-25">
            <div class="list-group sidebar-event-list mg-b-20">
              <div class="list-group-item">
                <div>
                  <h6 class="tx-white tx-13 mg-b-5 tx-normal">Roven's 32th Birthday</h6>
                  <p class="mg-b-0 tx-white tx-12 op-2">2:30PM</p>
                </div>
                <a href="" class="more"><i class="icon ion-android-more-vertical tx-18"></i></a>
              </div><!-- list-group-item -->
              <div class="list-group-item">
                <div>
                  <h6 class="tx-white tx-13 mg-b-5 tx-normal">Regular Workout Schedule</h6>
                  <p class="mg-b-0 tx-white tx-12 op-2">7:30PM</p>
                </div>
                <a href="" class="more"><i class="icon ion-android-more-vertical tx-18"></i></a>
              </div><!-- list-group-item -->
            </div><!-- list-group -->

            <a href="" class="btn btn-block btn-outline-secondary tx-uppercase tx-11 tx-spacing-2">+ Add Event</a>
            <br>
          </div>

        </div>
        <div class="tab-pane pos-absolute a-0 mg-t-60 overflow-y-auto" id="settings" role="tabpanel">
          <label class="sidebar-label pd-x-25 mg-t-25">Quick Settings</label>

          <div class="pd-y-20 pd-x-25 tx-white">
            <h6 class="tx-13 tx-normal">Sound Notification</h6>
            <p class="op-5 tx-13">Play an alert sound everytime there is a new notification.</p>
            <div class="pos-relative">
              <input type="checkbox" name="checkbox" class="switch-button" checked>
            </div>
          </div>

          <div class="pd-y-20 pd-x-25 tx-white">
            <h6 class="tx-13 tx-normal">2 Steps Verification</h6>
            <p class="op-5 tx-13">Sign in using a two step verification by sending a verification code to your phone.</p>
            <div class="pos-relative">
              <input type="checkbox" name="checkbox2" class="switch-button">
            </div>
          </div>

          <div class="pd-y-20 pd-x-25 tx-white">
            <h6 class="tx-13 tx-normal">Location Services</h6>
            <p class="op-5 tx-13">Allowing us to access your location</p>
            <div class="pos-relative">
              <input type="checkbox" name="checkbox3" class="switch-button">
            </div>
          </div>

          <div class="pd-y-20 pd-x-25 tx-white">
            <h6 class="tx-13 tx-normal">Newsletter Subscription</h6>
            <p class="op-5 tx-13">Enables you to send us news and updates send straight to your email.</p>
            <div class="pos-relative">
              <input type="checkbox" name="checkbox4" class="switch-button" checked>
            </div>
          </div>

          <div class="pd-y-20 pd-x-25 tx-white">
            <h6 class="tx-13 tx-normal">Your email</h6>
            <div class="pos-relative">
              <input type="email" name="email" class="form-control form-control-inverse transition pd-y-10" value="janedoe@domain.com">
            </div>
          </div>

          <div class="pd-y-20 pd-x-25">
            <h6 class="tx-13 tx-normal tx-white mg-b-20">More Settings</h6>
            <a href="" class="btn btn-block btn-outline-secondary tx-uppercase tx-11 tx-spacing-2">Account Settings</a>
            <a href="" class="btn btn-block btn-outline-secondary tx-uppercase tx-11 tx-spacing-2">Privacy Settings</a>
          </div>

        </div>
      </div><!-- tab-content -->
    </div><!-- br-sideright -->
    <!-- ########## END: RIGHT PANEL ########## --->

    <!-- ########## START: MAIN PANEL ########## -->
    <div class="br-mainpanel">
 

 
 <% 
String Errormessage="";
String statuscode=(String)request.getAttribute("StatusCode");
String StatusMessage=(String)request.getAttribute("StatusMessage");
//System.out.println("statuscode  ....."+statuscode);
if(statuscode.equals("300") && StatusMessage.equals("NOK")){
	 Errormessage = (String)request.getAttribute("ErrorMessage"); 
}else{
	Errormessage = (String)request.getAttribute("ErrorMessage"); 
}


%>
<%= Errormessage%>
 
 
 
 
       <footer class="br-footer">
        <div class="footer-left d-flex ">
		<h6 class="d-flex align-items-center justify-content-between mg-b-30">© Copyright 2021 STAR WING.. | <a href="#">Top</a></h6>
          <!--<div class="mg-b-2">Copyright &copy; 2017. Bracket. All Rights Reserved.</div>
          <div>Attentively and carefully made by ThemePixels.</div> -->
        </div>
        
      </footer>
	</div><!-- col-9 -->
          

            
        

      
     
    </div><!-- br-mainpanel -->
    <!-- ########## END: MAIN PANEL ########## -->

    <script src="../CardDistributedSystem/resources/lib/jquery/jquery.js"></script>
    <script src="../CardDistributedSystem/resources/lib/popper.js/popper.js"></script>
    <script src="../CardDistributedSystem/resources/lib/bootstrap/bootstrap.js"></script>
    <script src="../CardDistributedSystem/resources/lib/perfect-scrollbar/js/perfect-scrollbar.jquery.js"></script>
    <script src="../CardDistributedSystem/resources/lib/moment/moment.js"></script>
    <script src="../CardDistributedSystem/resources/lib/jquery-ui/jquery-ui.js"></script>
    <script src="../CardDistributedSystem/resources/lib/jquery-switchbutton/jquery.switchButton.js"></script>
    <script src="../CardDistributedSystem/resources/lib/peity/jquery.peity.js"></script>
    <script src="../CardDistributedSystem/resources/lib/chartist/chartist.js"></script>
    <script src="../CardDistributedSystem/resources/lib/jquery.sparkline.bower/jquery.sparkline.min.js"></script>
    <script src="../CardDistributedSystem/resources/lib/d3/d3.js"></script>
    <script src="../CardDistributedSystem/resources/lib/rickshaw/rickshaw.min.js"></script>


    <script src="../CardDistributedSystem/resources/js/bracket.js"></script>
    <script src="../CardDistributedSystem/resources/js/ResizeSensor.js"></script>
    <script src="../CardDistributedSystem/resources/js/dashboard.js"></script>
    <script>
      $(function(){
        'use strict'

        // FOR DEMO ONLY
        // menu collapsed by default during first page load or refresh with screen
        // having a size between 992px and 1299px. This is intended on this page only
        // for better viewing of widgets demo.
        $(window).resize(function(){
          minimizeMenu();
        });

        minimizeMenu();

        function minimizeMenu() {
          if(window.matchMedia('(min-width: 992px)').matches && window.matchMedia('(max-width: 1299px)').matches) {
            // show only the icons and hide left menu label by default
            $('.menu-item-label,.menu-item-arrow').addClass('op-lg-0-force d-lg-none');
            $('body').addClass('collapsed-menu');
            $('.show-sub + .br-menu-sub').slideUp();
          } else if(window.matchMedia('(min-width: 1300px)').matches && !$('body').hasClass('collapsed-menu')) {
            $('.menu-item-label,.menu-item-arrow').removeClass('op-lg-0-force d-lg-none');
            $('body').removeClass('collapsed-menu');
            $('.show-sub + .br-menu-sub').slideDown();
          }
        }
      });
    </script>
  </body>
</html>
