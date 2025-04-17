window.initMap = function () {// 콜백함수의 코드시작
  const map = new google.maps.Map(document.getElementById("map"), {
	//앞의 id속성의 map 따라감-div요소
    center: { lat: 37.5400456, lng: 126.9921017 },
    zoom: 10
  });

  const malls = [
	//lat : 위도 lng : 경도
    { label: "C", name: "코엑스몰", lat: 37.5115557, lng: 127.0595261 },
    { label: "G", name: "고투몰", lat: 37.5062379, lng: 127.0050378 },
    { label: "D", name: "동대문시장", lat: 37.566596, lng: 127.007702 },
    { label: "I", name: "IFC몰", lat: 37.5251644, lng: 126.9255491 },
    { label: "L", name: "롯데월드타워몰", lat: 37.5125585, lng: 127.1025353 },
    { label: "M", name: "명동지하상가", lat: 37.563692, lng: 126.9822107 },
    { label: "T", name: "타임스퀘어", lat: 37.5173108, lng: 126.9033793 }
  ];

  //LatLngBounds : 경계 객체 생성 
  //InfoWindow : 정보창 객체 생성
  const bounds = new google.maps.LatLngBounds();
  const infoWindow = new google.maps.InfoWindow();

  //marker 사용 - 클릭했을때 부가정보 설명
  malls.forEach(({ label, name, lat, lng }) => {
    const marker = new google.maps.Marker({
      position: { lat, lng },
      label,
      map
    });
    bounds.extend(marker.position);

    marker.addListener("click", () => {
      map.panTo(marker.position);//panTo 매서드에 마커의 위치정보 넘김
      infoWindow.setContent(name);
      infoWindow.open({
        anchor: marker,
        map
      });
    });
  });

  map.fitBounds(bounds);
};
