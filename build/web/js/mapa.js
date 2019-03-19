
mapboxgl.accessToken = 'pk.eyJ1IjoiYWdlbnRmZTU0NzQ0IiwiYSI6ImNqdDlmYndyeTBpejM0YXRoM2ptb2NueHEifQ.MLIvTiPreCQU42XKrH0IHg';
var map = new mapboxgl.Map({
container: 'map',
style: 'mapbox://styles/mapbox/streets-v11',
center: [-99.175449, 19.452926],
zoom: 10
});

var marker = new mapboxgl.Marker()
  .setLngLat([-99.175449, 19.452926])
  .addTo(map);
  
  var marker1 = new mapboxgl.Marker()
  .setLngLat([-98.883850, 19.313101])
  .addTo(map);