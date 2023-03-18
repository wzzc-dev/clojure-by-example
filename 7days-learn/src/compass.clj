(defprotocol Compass
  (direction [c])
  (left [c])
  (right [c]))