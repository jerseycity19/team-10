//
//  MapViewController.swift
//  cfg
//
//  Created by Helal Chowdhury on 9/27/19.
//  Copyright © 2019 Helal. All rights reserved.
//

import UIKit
import MapKit
import CoreLocation
import FlyoverKit
import Speech

class MapViewController: UIViewController {
    @IBOutlet weak var mapView: MKMapView!
    
    
    let locationManager = CLLocationManager()
    var currentCoordinate: CLLocationCoordinate2D?
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        locationManager.delegate = self
        mapView.delegate = self
        userLocationSetup()
        self.mapSetup()
        
    }
    
    func userLocationSetup(){
        locationManager.requestAlwaysAuthorization() //we can ask this later
        locationManager.startUpdatingLocation()
        locationManager.distanceFilter = 100
        mapView.showsUserLocation = true
        mapView.mapType = MKMapType.hybrid
    }
    
    func zoomIn(_ coordinate: CLLocationCoordinate2D){
        let zoomRegion = MKCoordinateRegion(center: coordinate, latitudinalMeters: 10000, longitudinalMeters: 10000)
        mapView.setRegion(zoomRegion, animated: true)
    }

    

}
