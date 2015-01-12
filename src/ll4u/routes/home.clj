(ns ll4u.routes.home
  (:require [compojure.core :refer :all]
            [ll4u.layout :as layout]
            [ll4u.util :as util]))

(defn home-page []
  (layout/render
    "index.html")); {:content (util/md->html "/md/docs.md")}))


(defroutes home-routes
  (GET "/" [] (home-page)))
