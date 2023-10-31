(ns dots.typescript.transformation-result)

(defn transformed
  "Gets the transformed source files."
  ^js [transformation-result]
  (.-transformed ^js transformation-result))

(defn set-transformed!
  "Gets the transformed source files."
  ^js [transformation-result value]
  (set! (.-transformed ^js transformation-result) value))

(defn diagnostics
  "Gets diagnostics for the transformation."
  ^js [transformation-result]
  (.-diagnostics ^js transformation-result))

(defn set-diagnostics!
  "Gets diagnostics for the transformation."
  ^js [transformation-result value]
  (set! (.-diagnostics ^js transformation-result) value))

(defn substitute-node
  "Gets a substitute for a node, if one is available; otherwise, returns the original node."
  ^js [transformation-result hint node]
  (.substituteNode ^js transformation-result hint node))

(defn emit-node-with-notification
  "Emits a node with possible notification."
  ^js [transformation-result hint node emit-callback]
  (.emitNodeWithNotification ^js transformation-result hint node emit-callback))

(defn emit-notification-enabled?
  "Indicates if a given node needs an emit notification"
  ^js [transformation-result node]
  (.isEmitNotificationEnabled ^js transformation-result node))

(defn dispose
  "Clean up EmitNode entries on any parse-tree nodes."
  ^js [transformation-result]
  (.dispose ^js transformation-result))
