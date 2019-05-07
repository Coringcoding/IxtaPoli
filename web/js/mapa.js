mapboxgl.accessToken = 'pk.eyJ1IjoiYWdlbnRmZTU0NzQ0IiwiYSI6ImNqdDlmYndyeTBpejM0YXRoM2ptb2NueHEifQ.MLIvTiPreCQU42XKrH0IHg';
var map = new mapboxgl.Map({
container: 'map',
style: 'mapbox://styles/mapbox/streets-v11',
center: [-99.175449, 19.452926],
zoom: 10, 
pitch: 45
});

var marker = new mapboxgl.Marker()
  .setLngLat([-99.175449, 19.452926])
  .addTo(map);
  
  var marker1 = new mapboxgl.Marker()
  .setLngLat([-98.883850, 19.313101])
  .addTo(map);
  
  var marker2 = new mapboxgl.Marker()
  .setLngLat([-98.883850, 19.313101])
  .addTo(map);
  
   var marker3 = new mapboxgl.Marker()
  .setLngLat([-99.015338, 19.371903])
  .addTo(map);
  
    var marker4 = new mapboxgl.Marker()
  .setLngLat([-99.087486, 19.412060])
  .addTo(map);
  



//Animacion
function rotateCamera(timestamp) {
map.rotateTo((timestamp / 400) % 360, {duration: 0});
requestAnimationFrame(rotateCamera);
}

 
map.on('load', function () {
// Start the animation.
rotateCamera(0);

});

