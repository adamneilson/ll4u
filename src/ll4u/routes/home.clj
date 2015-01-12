(ns ll4u.routes.home
  (:require [compojure.core :refer :all]
            [ll4u.layout :as layout]
            [ll4u.util :as util]))

(defn home-page []
  (layout/render
    "index.html" {:content (util/md->html "/md/docs.md")}))

(defn about-page []
  (layout/render "about.html"))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page)))
